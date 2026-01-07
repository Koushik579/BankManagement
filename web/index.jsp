<%-- 
    Document   : index
    Created on : Jan 4, 2026, 10:11:14 AM
    Author     : Koushik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="css/style.css"/>     
    </head>

    <body>
        <div id="container">
            <div id="login">
                <form action="loginconf">
                    <label>Login</label>
                    <br /><br /><br />
                    <label onclick="admintoggle();" id="admin">Admin</label> | 
                    <label onclick="custtoggle();" id="customer">Customer</label>
                    <br /><br /><br />
                    <input type="hidden" name="role" value="customer" >
                    <input type="text" name="uname" placeholder="UserName/Email" required/>
                    <br /><br />
                    <input type="password" name="pass" id="pass" placeholder="Password" required/>
                    <div>
                        <input type="checkbox" id="showPass" onclick="togglepass()" />
                        <label for="showPass">Show Password</label>
                    </div>
                    <br /><br />
                    <button type="submit">Login</button>
                    <br />
                    <p style="color: red; font-size: 14px">${errormsg}</p>
                    <br />
                    <br /><br /><br />
                    <a href="signup.jsp">Don't have a account ?...</a>
                </form>
            </div>
        </div>
        <script src="js/validation.js"></script>
    </body>
</html>
