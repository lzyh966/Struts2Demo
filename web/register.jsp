<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<s:form action="registerAction" method="POST" validate="true">
    <s:textfield name="user.username" label="请输入用户名"></s:textfield>
    <s:password name="user.password" label="请输入密码"></s:password>
    <s:submit value="注册"></s:submit>
    <s:reset value="重置"></s:reset>
</s:form>
</body>
</html>
