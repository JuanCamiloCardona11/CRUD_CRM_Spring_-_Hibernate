<%--
  Created by IntelliJ IDEA.
  User: JuanCamiloCC
  Date: 8/3/21
  Time: 8:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customers Form</title>
</head>
<body>

    <h1 class="title">Customers Form</h1>
    <br>
    <form:form action="" method="post" modelAttribute="newCustomer">
        <div class="form-input">
            <label for="firstName">First Name:</label>
            <form:input path="firstName" id="firstName"/>
        </div>
        <div class="form-input">
            <label for="firstName">Last Name:</label>
            <form:input path="lastName" id="lastName"/>
        </div>
        <div class="form-input">
            <label for="firstName">Age:</label>
            <form:input path="age" id="age"/>
        </div>
        <div class="form-input">
            <label for="firstName">Email: </label>
            <form:input path="email" id="email"/>
        </div>
        <div class="form-input">
            <input type="submit" value="Save Customer">
        </div>
    </form:form>
    <br>
    <a href="${pageContext.request.contextPath}/customer/list">Back to the Customers List</a>
</body>
</html>
