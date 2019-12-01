<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生信息</title>
    <s:head/>
    <sx:head/>
</head>
<body>
<s:form method="POST" action="addStudentAction" validate="true">\
    <s:fielderror name="student.studentId"></s:fielderror>
    <s:textfield name="student.studentId" label="学号"></s:textfield><br>
    <s:textfield name="student.name" label="姓名"></s:textfield>
    <s:radio list="{'男','女'}" label="性别" name="student.sex"></s:radio>
    <s:textfield name="student.major" label="专业"></s:textfield>
    <sx:datetimepicker name="student.birthDate" label="出生日期" displayFormat="yyyy-MM-dd" id="cssj"></sx:datetimepicker>
    <s:textarea name="student.memo" label="备注" cols="30" rows="10"></s:textarea>
    <s:submit value="添加"/>
    <s:reset value="重置"/>
</s:form>
</body>
</html>
