<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath=request.getScheme() + "://" + request.getServerName() + ":" +request.getServerPort() + "/" + path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="user.do" method="post">
		<input type="text"  placeholder="姓名" name="username">
		<input type="text"  placeholder="性别" name="sex">
		<input type="text"  placeholder="年龄" name="age">
		<input type="date" name="birthday">
		<input type="submit">
	</form>
</body>
</html>