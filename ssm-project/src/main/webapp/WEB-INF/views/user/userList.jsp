<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 引用c 标签  c:choose 下  c:when  c:otherwise -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 引用时间格式化 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="zxy" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${zxy}/static_1/css/user.css" type="text/css" rel="stylesheet">
<title>查看用户列表</title>
</head>
<body>
	<div>	
		<table>
			<tr>
				<td colspan="3">
					<a href="javascript:void(0)" onclick="history.back(-1)" >返回</a>
				</td>
			</tr>
			<tr>
				<td>用户姓名</td>
				<td>年龄</td>
				<td>创建时间</td>
			</tr>
			<c:choose>
				<c:when test="${empty userList}"></c:when>
				<c:otherwise>
					<c:forEach items="${userList}" var="user"> 
						<tr>
							<td>${user.name}</td>
							<td>${user.age}</td>
							<td>
								<fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss"
									value="${user.createTime}"/>
							</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
			
		</table>
	</div>
</body>
</html>