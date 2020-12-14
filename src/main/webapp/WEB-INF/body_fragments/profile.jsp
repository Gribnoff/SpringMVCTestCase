<%--@elvariable id="user" type="ru.gribnoff.testcase4springsecurity.persistence.entity.User"--%>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<h2>Welcome ${user.username}</h2>

Your balance is: ${user.balance}