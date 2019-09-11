<%-- 
    Document   : New_Employee
    Created on : May 13, 2019, 8:16:25 PM
    Author     : Maxerror678
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Employee List</title>
    </head>
    <body>
           <form action="New_Employee.jsp" method="post"> 
            <table>
                <tr><td>Enter Employee Name<input type="text" name="EmpName"></td></tr>
                <tr><td>Enter Employee Address<input type=text name="Address" ></td></tr>
                <tr><td>Enter Employee Mail Id<input type=text name="MailId" ></td></tr>
                <tr><td>Enter Employee Mobile<input type=text name="Mobile" > </td></tr>
                <tr><td>Enter Employee DOB<input type=text name="DOB" > </td></tr>
                <tr><td>Enter Employee Designation<input type=text list="Designation" ></td></tr>
<datalist id=Designation >
   <option> Housekeeper
   <option> Maintenance
   <option> Front-Desk
   <option> Assistance Manager
   <option> Manager
</datalist>
                <tr><td>Enter Employee DOJ<input type="" name="DOJ "></td></tr>
                <tr><td><input type="submit" ></td></tr>
            </table>
        </form>
    </body>
</html>
