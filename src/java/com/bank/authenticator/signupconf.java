package com.bank.authenticator;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import com.bank.util.DbConnector;
import java.security.*;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Koushik
 */
public class signupconf extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                String name = request.getParameter("fname") + " " + request.getParameter("lname");
                String uname = request.getParameter("uname");
                String email = request.getParameter("email");
                String pass1 = request.getParameter("pass1");
                String pass2 = request.getParameter("pass2");
                if (!pass1.equals(pass2)) {
                    request.setAttribute("error", "Passwords are not same");
                    request.getRequestDispatcher("signup.jsp").forward(request, response);
                } else {

                    Connection con = DbConnector.connect();
                    con.setAutoCommit(false);
                    try {
                        if (con != null) {
                            String hashedpass = BCrypt.hashpw(pass1, BCrypt.gensalt());
                            String insert = "insert into customers(full_name,username,email,password_hash) values(?,?,?,?)";
                            PreparedStatement ps = con.prepareStatement(insert);
                            ps.setString(1, name);
                            ps.setString(2, uname);
                            ps.setString(3, email);
                            ps.setString(4, hashedpass);
                            ps.executeUpdate();
                            
                            PreparedStatement getid = con.prepareStatement("select customer_id from customers");
                            ResultSet rs = getid.executeQuery();

                            int branch_code = 1107;
                            long customer_ID = 0;
                            long account_Num = 0;
                            if (rs.next()) {
                                account_Num = Long.parseLong("" + branch_code + rs.getLong(1));
                                customer_ID = rs.getLong(1);
                            }

                            PreparedStatement accinsert = con.prepareStatement("insert into accounts(customer_id,account_number) values(?,?)");
                            accinsert.setLong(1, customer_ID);
                            accinsert.setLong(2, account_Num);

                            accinsert.execute();
                            con.commit();
                            
                            request.setAttribute("connectmsg", "SQL Connection Successful");
                            request.getRequestDispatcher("webauthentication/signupconf.jsp").forward(request, response);
                        } else {
                            request.setAttribute("connectmsg", "Bad Connection");
                            request.getRequestDispatcher("signupconf.jsp").forward(request, response);
                        }
                    } catch (Exception e) {
                        con.rollback();
                        throw e;
                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
