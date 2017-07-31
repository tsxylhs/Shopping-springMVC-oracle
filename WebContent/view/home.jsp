<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>首页</title>
</head>
<body>


	<div align="center">
		<h1 align="center">欢迎登陆</h1>
		<h4>
			<a href="../ShoppingWeb/register.jsp">注册</a>
		</h4>
		<c:if test="${err==1}">
	<h6 color="red">账号或者密码错误！</h6>

</c:if>
	</div>
	<table border="1" align="center">
		<tr>
			<th>编号</th>
			<th>用户名</th>
			<th>密码</th>
			
			<th>操作</th>
		</tr>

		<c:forEach items="${users}" var="node">
			<tr>
				<td><c:out value="${node.userId}"></c:out></td>
				
				<td><c:out value="${node.username}"></c:out></td>
				<td><c:out value="${node.password}"></c:out></td>
			    
				<td><a href="userdelete?userid=${node.userId}">删除</a>/<a>修改</a></td>
			</tr>
		</c:forEach>
	</table>

	<br>
	<div align="center">
		<c:if test="${pageNos>1 }">
			<a href="inituser?pageNos=1">首页</a>
			<a href="inituser?pageNos=${pageNos-1}">上一页</a>
		</c:if>
		<c:if test="${pageNos<recordCount}">
			<a href="inituser?pageNos=${pageNos+1 }">下一页</a>
			<a href="inituser?pageNos=${recordCount}">未页</a>
		</c:if>
		<form action="inituser">
			<h4 align="center">
				共${recordCount}页 <input type="text" value="${pageNos}"
					name="pageNos" size="1">页 <input type="submit" value="到达">
			</h4>
		</form>
	</div>
</body>
</html>