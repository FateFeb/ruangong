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
<h3>订单列表</h3>
<table border=1>
<tr>
<th>订单号</th><th>商家号</th><th>物品</th><th>佣金</th><th>目的地</th><th>开始时间</th><th>结束时间</th>
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