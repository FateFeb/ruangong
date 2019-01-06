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
<s:form action="busreg" method="post">
<s:textfield name="bregisterUser.id" label="请输入用户名"/>
<s:password name="bregisterUser.pwd" label="请输入密码"/>
<s:password name="bregisterUser.repwd" label="请再次输入密码"/>
<s:textfield name="bregisterUser.name" label="请输入姓名"/>
<s:textfield name="bregisterUser.phone" label="请输入手机号"/>
<s:textfield name="bregisterUser.address" label="请输入地址"/>
<s:submit value="注册"/>
<s:reset value="重置"/>
</s:form>
</body>
</html>
