<%@ page language="java" contentType="text/html; charset=GB18030" pageEncoding="GB18030" import="com.opensymphony.xwork2.util.ValueStack,
java.util.List,java.util.Iterator,po.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>�����б�</h3>
<table border=1>
<tr>
<th>������</th><th>�̼Һ�</th><th>��Ʒ</th><th>Ӷ��</th><th>Ŀ�ĵ�</th><th>��ʼʱ��</th><th>����ʱ��</th>
</tr>
<s:iterator value="ol" >
<tr>
<td><s:property value="id"/></td>
<td><s:property value="bid"/></td>
<td><s:property value="goods"/></td>
<td><s:property value="price"/></td>
<td><s:property value="end"/></td>
<td><s:property value="starttime"/></td>
<td><s:property value="gettime"/></td>
</tr>
</tr>
</s:iterator>
</table>
</body>
</html>