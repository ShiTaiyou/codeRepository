<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'studentAdd.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

 <link rel="stylesheet" href="css/index.css" type="text/css"></link></head>

<body>
<div class="main">
  <form id="form" name="form" method="post" action="add.action">
      <table width="342" height="185" border="1">
         <caption><h1>添加学生信息</h1></caption>
          <tr>
            <td>user</td>
            <td><input type="text" name="user" /></td>
          </tr>
          <tr>
            <td>email</td>
            <td><input type="text" name="email" /></td>
          </tr>
          <tr>
            <td>date</td>
            <!-- HMTL5的新的日期 -->
            <td><input type="date" name="date" /></td>
          </tr>
          <tr>
            <td>age</td>
            <td><input type="text" name="age" /></td>
          </tr>
          <tr align="center">
            <td height="30" colspan="2"><input type="submit" name="button" id="button" value="提交" />
   &nbsp; &nbsp;            <input type="reset" id="button" value="重置"/></td>
          </tr>
      </table>
    </form>
  </tr>
</table>
 <p><a href="index.jsp">返回</a></p>
</div>
</body>
</html>
