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
<table>
<s:iterator value="ol" >
<s:form action="qiangorder" class="action" method="post">
<tr>
<s:hidden name="rider.id" value="%{#session.rider_ylm.id}" /></tr>
<tr><td>订单号:</td><td><s:textfield name="order.id" value="%{id}"/></td></tr>
<tr><td>商家号:</td><td><s:textfield name="order.bid" value="%{bid}"/></td>
<tr><td>物品:</td><td><s:textfield name="order.goods" value="%{goods}"></s:textfield></td>
<tr><td>佣金:</td><td><s:textfield name="order.price" value="%{price}"></s:textfield></td>
<tr><td>目的地:</td><td><s:textfield name="order.end" value="%{end}" ></s:textfield></td>
<tr><td>派发时间:</td><td><s:textfield name="order.starttimr" value="%{starttime}"></s:textfield></td>
<s:submit value="抢单"  />
</s:form>
</s:iterator>
</table>
</body>
</html>