<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--@elvariable id="login" type="ru.gribnoff.testcase4springsecurity.persistence.entity.Login"--%>
<form:form id="loginForm" modelAttribute="login" action="loginProcess" method="post">
    <table>
        <tr>
            <td><form:label path="username">Username: </form:label></td>
            <td><form:input path="username" name="username" id="username" /></td>
        </tr>
        <tr>
            <td><form:label path="password">Password: </form:label></td>
            <td><form:password path="password" name="password" id="password" /></td>
        </tr>

        <tr>
            <td></td>
            <td><form:button id="login" name="login">Login</form:button></td>
        </tr>
    </table>
</form:form>
<%--<table align="center">--%>
<%--    <tr>--%>
<%--        <td style="font-style: italic; color: red;">${message}</td>--%>
<%--    </tr>--%>
<%--</table>--%>