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
            <form>
                <div class="row">
                    <div class="col-md-3">
                        <label>Company</label>
                        <input type="text" class="form-control" id="company" name="company">
                    </div>
                    <div class="form-group col-md-3">
                        <label>Last Name</label>
                        <input type="text" class="form-control" id="lastName" name="lastName">
                    </div>
                    <div class="form-group col-md-3">
                        <label>First Name</label>
                        <input type="text" class="form-control" id="firstName" name="firstName">
                    </div>
                    <div class="form-group col-md-3">
                        <label>Email Address</label>
                        <input type="email" class="form-control" id="email" name="email">
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-3">
                        <label>Job Title</label>
                        <input type="text" class="form-control" id="jobTitle" name="jobTitle">
                    </div>
                    <div class="form-group col-md-3">
                        <label>Business Phone</label>
                        <input type="text" class="form-control" id="businessPhone" name="businessPhone">
                    </div>
                    <div class="form-group col-md-3">
                        <label>Home Phone</label>
                        <input type="text" class="form-control" id="homePhone" name="homePhone">
                    </div>
                    <div class="form-group col-md-3">
                        <label>Mobile Phone</label>
                        <input type="text" class="form-control" id="mobilePhone" name="mobilePhone">
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-md-3">
                        <label>Fax Number</label>
                        <input type="text" class="form-control" id="faxNumber" name="faxNumber">
                    </div>
                    <div class="form-group col-md-3">
                        <label>Address</label>
                        <input type="text" class="form-control" id="address" name="address">
                    </div>
                    <div class="form-group col-md-3">
                        <label>City</label>
                        <input type="text" class="form-control" id="city" name="city">
                    </div>
                    <div class="form-group col-md-3">
                        <label>State Province</label>
                        <input type="text" class="form-control" id="state" name="state">
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-md-3">
                        <label>Zip Portal Code</label>
                        <input type="text" class="form-control" id="zip" name="zip">
                    </div>
                    <div class="form-group col-md-3">
                        <label>Country Region</label>
                        <input type="text" class="form-control" id="country" name="country">
                    </div>
                    <div class="form-group col-md-3">
                        <label>Web Page</label>
                        <input type="text" class="form-control" id="webPage" name="webPage">
                    </div>
                    <div class="form-group col-md-3">
                        <label>Notes</label>
                        <input type="text" class="form-control" id="notes" name="notes">
                    </div>
                </div>
                
                <div class="row text-right">
                    <div class="form-group col-md-12">
                        <button type="submit" class="btn btn-primary">Search</button>
                    </div>
                </div>
            </form>
            <table id="flex1" style="display:none"></table>
        </div>
    </body>
</html>
