<%@ page language="java" 
	import="java.util.*" 
	contentType="text/html; charset=UTF-8" %>  
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="zxy" value="${pageContext.request.contextPath}"></c:set>
<head>	
	<link rel="stylesheet" type="text/css" href="${zxy}/static_1/css/user.css">

</head>
<body>
<div>
	<h2>Hello You!</h2>
	<a href="${zxy}/user/queryUser">添加用户</a>
</div>
</body>
</html>
