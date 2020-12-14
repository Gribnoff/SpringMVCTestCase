<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--@elvariable id="user" type="ru.gribnoff.testcase4springsecurity.persistence.entity.User"--%>
<form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
    <table>
        <tr>
            <td><form:label path="username">Username: </form:label></td>
            <td><form:input path="username" name="username" id="username"/></td>
        </tr>
        <tr>
            <td><form:label path="password">Password: </form:label></td>
            <td><form:password path="password" name="password" id="password"/></td>
        </tr>

        <tr>
            <td></td>
            <td><form:button id="register" name="register">Register</form:button></td>
        </tr>
    </table>
</form:form>