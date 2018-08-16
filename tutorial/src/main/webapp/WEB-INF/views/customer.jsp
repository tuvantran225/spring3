<%-- 
    Document   : customer
    Created on : Aug 12, 2018, 4:23:26 PM
    Author     : TRAN VAN PHU
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Customers</title>
        <script src="<c:url value="/resources/jquery-3.3.1/jquery-3.3.1.min.js" />"></script>
        <script src="<c:url value="/resources/flexigrid/js/flexigrid.js" />"></script>
        <script src="<c:url value="/resources/bootstrap-3.3.7/js/bootstrap.min.js" />"></script>
        
        <script src="<c:url value="/resources/javascript/customer.js" />"></script>

        <link rel="stylesheet" href="<c:url value="/resources/flexigrid/css/flexigrid.css" />">
        <link rel="stylesheet" href="<c:url value="/resources/bootstrap-3.3.7/css/bootstrap.min.css" />">
    </head>
    <body>
        <div class="container">
                <form class="form-inline">
                    <div class="form-group">
                        <label for="exampleInputName2">Name</label>
                        <input type="text" class="form-control" name="name" />
                    </div>
                    <div class="form-group">
                        <label for="exampleInputEmail2">Email</label>
                        <input type="email" class="form-control" name="email" />
                    </div>
                    <button type="submit" class="btn btn-success">Send</button>
                </form>
            <table id="flex1" style="display:none"></table>
        </div>
    </body>
</html>
