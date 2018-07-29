<%-- 
    Document   : login
    Created on : Jul 29, 2018, 10:20:17 PM
    Author     : TRAN VAN PHU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="login" method="post">  
            Name:<input type="text" name="username"/><br/>  
            Password:<input type="password" name="password"/><br/>  
            <input type="submit" value="login"/>  
        </form>
    </body>
</html>
