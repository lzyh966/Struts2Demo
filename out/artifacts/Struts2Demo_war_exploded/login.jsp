<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入标签开发能力--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<s:form action="loginAction" method="POST" validate="true">
    <s:textfield name="user.username" label="请输入用户名"></s:textfield>
    <s:password name="user.password" label="请输入密码"></s:password>
    <s:submit value="登录"></s:submit>
    <s:reset value="重置"></s:reset>
</s:form>
</body>
</html>
