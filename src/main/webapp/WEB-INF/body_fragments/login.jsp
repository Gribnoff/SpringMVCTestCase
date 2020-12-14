<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--@elvariable id="login" type="ru.gribnoff.testcase4springsecurity.persistence.entity.Login"--%>
<form id="loginForm" action="login" method="post">
    <table>
        <tr>
            <td>Username: </td>
            <td><input type="text" name="username" id="username" /></td>
        </tr>
        <tr>
            <td>Password: </td>
            <td><input type="password" name="password" id="password" /></td>
        </tr>

        <tr>
            <td></td>
            <td><button type="submit">Login</button></td>
        </tr>
    </table>
</form>
<%--<table align="center">--%>
<%--    <tr>--%>
<%--        <td style="font-style: italic; color: red;">${message}</td>--%>
<%--    </tr>--%>
<%--</table>--%>