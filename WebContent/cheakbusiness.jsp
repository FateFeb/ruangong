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

666
<s:property value="cBusiness.id"/><br>
<s:property value="cBusiness.name"/>
<s:property value="cBusiness.phone"/>
<s:property value="cBusiness.address"/>
<s:form action="pass" method="post">
<s:submit value="通过"/>
</s:form>
<s:form action="unpass" method="post">
<s:submit value="不通过"/>
</s:form>
</body>
</html>