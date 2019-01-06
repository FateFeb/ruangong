<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head theme="xhtml"/>
<sx:head parseContent="true"  extraLocales="UTF-8"/>	
<title>Insert title here</title>
</head>
<body>
<s:actionerror/>
<s:form action="login" class="action" method="post">
<s:textfield name="loginUser.id" label="请输入用户名"/>
<s:password name="loginUser.pwd" label="请输入密码"/>
<s:submit value="登录"/>
</s:form>

</body>
</html>