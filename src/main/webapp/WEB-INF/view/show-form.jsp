<%--
  Created by IntelliJ IDEA.
  User: 30045033
  Date: 31.03.2020
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Save Customer</title>
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"/>
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>CRM - Customer Relationship Manager</h2>
        </div>
    </div>
    <div id="container">
        <h3>Save Customer</h3>
        <form:form action="addCustomer" modelAttribute="customer" method="post">
            <form:hidden path="id"/>
            <table>
                <tr>
                    <td><label>Fist Name</label></td>
                    <td><form:input path="firstName"/></td>
                </tr>
                <tr>
                    <td><label>Last Name</label></td>
                    <td><form:input path="lastName"/></td>
                </tr>
                <tr>
                    <td><label>email</label></td>
                    <td><form:input path="email"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Save" class="save" /></td>
                </tr>
            </table>
        </form:form>
        <div style="clear: both"></div>
        <p>
            <a href="${pageContext.request.contextPath}/customer/list">Back to Customer List</a>
        </p>
    </div>
</body>
</html>
