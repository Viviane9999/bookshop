<%@page import="cn.edu.nsu.bookshop.db.last.users.Users"%>
<%@page import="cn.edu.nsu.bookshop.db.last.users.UsersDAO"%>
<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>操作成功-examOnline</title>
<meta charset="utf-8">
<!--全局CSS-->
<link rel="stylesheet" type="text/css" href="/bookshop/css/admin/share/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/bookshop/css/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="/bookshop/css/admin/share/myStyle.css">
<!--私有CSS-->
</head>
<body>
    <!-- 页面顶部导航条 -->
	<div class="row panel titlePanel">
		<div class="col-md-12">
			<div class="col-md-3">
				<h3>
					<i class="fa fa-dashboard"></i> 类别管理
				</h3>
			</div>
			<div class="col-md-6">
				<div style="text-align: center;"></div>
			</div>
			<div class="col-md-3">
				<ul class="functionTip app-breadcrumb breadcrumb">
					<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
					<li class="breadcrumb-item"><a href="">类别管理 / 修改</a></li>
				</ul>
			</div>
		</div>
	</div>
    <!-- 页面内容体 -->
    <%
    request.setCharacterEncoding("utf-8");
   //从请求中获得更改后的用户数据
    String users_id = request.getParameter("users_id");
    String roles_id = request.getParameter("roles_id");
    String users_name = request.getParameter("users_name");
    String users_sex = request.getParameter("users_sex");
    String users_idNum = request.getParameter("users_idNum");
    String users_mobile = request.getParameter("users_mobile");
    String users_address = request.getParameter("users_address");
    String users_postcode = request.getParameter("users_postcode");
    String users_portraitImg = request.getParameter("users_portraitImg");
    String users_password = request.getParameter("users_password");
    
    //将更改后的用户数据更新到User表中对应记录
    UsersDAO userDAO = new UsersDAO();
    Users users = new Users();
    users.setUsers_id(Integer.parseInt(users_id));
    users.setRoles_id(Integer.parseInt(roles_id));
    users.setUsers_name(users_name);
    users.setUsers_sex(users_sex);
    users.setUsers_idNum(users_idNum);
    users.setUsers_mobile(users_mobile);
    users.setUsers_address(users_address);
    users.setUsers_postcode(users_postcode);
    users.setUsers_portraitImg(users_portraitImg);
    users.setUsers_password(users_password);
    
    userDAO.modify(users);
    
    
    
    
    %>
    
    
    
    
    
    
    
    
    
    
	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">操作成功</h3>
					
				</div>
				<div class="panel-body">
		               <div class="alert alert-success"><h4>修改用户成功！</h4></div>
		                
			    </div>
			    <div class="panel-footer">
			    	 <div class="btn-group">
						 <a href="<%=request.getContextPath() %>/pages/admin/users/list.jsp"><button type="button" class="btn btn-primary" onclick="javascript:window.history.back();"><i class="fa fa-fw fa-lg fa-times-circle"></i>返回</button>
					 </div>
			    </div>
			</div>
		</div>
		
	</div>

	<!--全局JS -->
	<script src="/bookshop/js/admin/share/jquery-3.2.1.min.js"></script>
	<script src="/bookshop/js/admin/share/bootstrap.min.js"></script> 
	<script src="/bookshop/js/admin/share/share.js"></script>
	
	<!--私有JS-->

	<script type="text/javascript">
    
        
      
    </script>
</body>