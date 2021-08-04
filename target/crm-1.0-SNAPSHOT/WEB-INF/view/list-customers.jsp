<%--
  Created by IntelliJ IDEA.
  User: JuanCamiloCC
  Date: 8/3/21
  Time: 8:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Customers</title>
</head>
<body>
<h1>List of Customers</h1>
<div>
    <a href="${pageContext.request.contextPath}/customer/form-add-customer">Insert a new Customer</a>
</div>
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
            <th>Email</th>
        </tr>
        <c:forEach var="customer" items="${customersList}">
            <tr>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.age}</td>
                <td>${customer.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
