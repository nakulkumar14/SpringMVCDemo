<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>${message}</h1>

<form action="addEmployee" method="get">
    <label>Firstname : </label>
    <input type="text" name="firstname">
    <label>Lastname : </label>
    <input type="text" name="lastname">
    <label>Dob : </label>
    <input type="text" name="dob">
    <label>empid : </label>
    <input type="text" name="empId">
    <input type="submit">
</form>
<a href="getAllEmployees">Get All Employees</a>

</body>
</html>