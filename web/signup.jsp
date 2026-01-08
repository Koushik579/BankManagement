<%-- 
    Document   : signup
    Created on : Jan 4, 2026, 3:14:21 PM
    Author     : Koushik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signup Page</title>
        <link rel="stylesheet" href="css/style.css"/>      
    </head>

    <body>
        <div id="container">
            <div id="signup">
                <form action="signupconf" method="post">
                    <input type="text" name="fname" placeholder="First Name" required/>
                    <br /><br />
                    <input type="text" name="lname" placeholder="Last Name" required/>
                    <br /><br />
                    <input type="text" name="uname" placeholder="Create Username" required/>
                    <br /><br />
                    <input type="text" name="email" placeholder="Email Id" required/>
                    <br /><br />
                    <input type="text" name="pass1" placeholder="Password" required/>
                    <br /><br />
                    <input type="password" name="pass2" id="pass2" placeholder="Confirm Password" required/>
                    <div>
                        <br/>
                        <label class="showpassCheck">
                            <input type="checkbox" onclick="togglepass2();"/>Show Password
                        </label>
                    </div>
                    <br />
                    <button type="submit">Signup</button>
                    <br />
                    <p style="color: red; font-size: 14px">${err}</p>
                    <br />
                    <a href="index.jsp">Already have an account ?..</a>
                </form>
            </div>
        </div>
        <script src="js/validation.js"></script>
    </body>
</html>
