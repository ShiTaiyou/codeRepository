<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'show.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript" src="js/show.js"></script></head>

<body>
<a href="add.jsp">添加</a>
<center>
 <%--   <form action="find2.action" method="post">
     user:<input name="user" value="${my.user}">
     <input type="submit" value="查询"/>
   </form>
   <hr/> --%>
   
    <form action="findPage.action" method="post">
     user:<input name="user" value="${my.user}">
     email:<input name="email" value="${my.email}">
     <input type="submit" value="分页查询"/>
   </form>
   
   
	<table border="1" align="center" width="85%" height="101">
		<tbody>
			<tr bgColor="#00ff80">
				<th>编号</th>
				<th>姓名</th>
				<th>邮箱</th>
				<th>日期</th>
				<th>年龄</th>
				<th>操作</th>
			</tr>
		<%-- 	<c:forEach var="stu" items="${list}"> --%>
			<c:forEach var="stu" items="${list.list}">
				<tr>
					<td>${stu.id }</td>
					<td>${stu.user }</td>
					<td>${stu.email }</td>
					<td>
					 <fmt:formatDate value="${stu.date }" type="date"/>
					</td>
					<td>${stu.age }</td>
					<td><a href="find.action?id=${stu.id }">修改</a>
					
					  &nbsp;
					 
					<a href="javascript:funDel(${stu.id })">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<p>
				第${list.pageNum }/${list.lastPage }页 &nbsp;&nbsp;

				<c:if test="${!list.isFirstPage}">
					<a href="javascript:funPage(${list.firstPage })">首页</a>
					<a href="javascript:funPage(${list.prePage })">上一页</a>
				</c:if>

				<!--显示所有的页数 -->
				<c:forEach items="${list.navigatepageNums }" var="i">
					<a href="findPage.action?pageIndex=${i}">${i}</a>
				</c:forEach>


				<c:if test="${!list.isLastPage}">
					<a href="javascript:funPage(${list.nextPage })">下一页</a>
					<a href="javascript:funPage(${list.lastPage })">尾页</a>
				</c:if>

			</p>
</center>
</body>
</html>


