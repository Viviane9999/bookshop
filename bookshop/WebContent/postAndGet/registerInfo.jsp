
<%@ page contentType="text/html;charset=utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'registerInfo.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

		<!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
	</head>

	<body>
		<H2>
			提交的数据是
		</H2>
		<P>
			<BR>
			用户名：
			<%=request.getParameter("name")%>
		</P>
		<P>
			登陆名：
			<%=request.getParameter("login_name")%>
		</P>
		<P>
			密码：
			<%=request.getParameter("password")%>
		</P>
		<P>
			性别：
			<%=request.getParameter("sex")%>
		</P>
		<P>
			角色：
			<%=request.getParameter("role")%>
		</P>
		<P>
			兴趣：
			<%
			String[] interests = request.getParameterValues("interest");
			if(interests != null)
			{
			
			for(int i=0;i<interests.length;i++)
			{
			%>
			<%= interests[i]+","%> 
			<%
			}}
			%>
		</P>
		
		<P>
			个人描述：<br>
			<%=request.getParameter("discription")%>
		</P>
	</body>
</html>
