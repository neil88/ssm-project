<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="zxy" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<script type="text/javascript">
	var zxy="${zxy}/"
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${zxy}/static_1/css/user.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="${zxy}/static_2/jquery/jquery.min.js"></script>
<script type="text/javascript" src="${zxy}/static_1/js/user.js"></script>
<title>userAdd</title>
</head>
<body>
	<div>	
		<table>
			<tr>
				<td>用户姓名</td>
				<td><input type="text" id="name"/></td>
			</tr>
			<tr>
				<td>用户年龄</td>
				<td><input type="text" id="age"/></td>
			</tr>
			<tr>
				<td colspan="2">点击:<input type="button" id="addUser" value="添加"/></td>
			</tr>
		</table>
	</div>
</body>
</html>