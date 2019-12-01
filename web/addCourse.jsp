<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加课程信息</title>
    <s:head/>
    <sx:head/>
</head>
<body>
<s:form method="POST" action="addCourseAction" validate="true">
    <s:textfield name="course.courseName" label="课程名称"></s:textfield>
    <s:textfield name="course.credit" label="学分"></s:textfield>
    <s:textfield name="course.teacher" label="授课老师"></s:textfield>
    <s:submit value="添加"/>
    <s:reset value="重置"/>
</s:form>
</body>
</html>
