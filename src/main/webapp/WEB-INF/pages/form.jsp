<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
<h1>Add New Customer</h1>
<form:form action="/form/save" method="post" modelAttribute="customer">
    <table>
        <tr>
            <td><form:label path="name">name</form:label></td>
            <td><form:input path="name" /> </td>
            <td><form:errors path="name"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Add user" />
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
