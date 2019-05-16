<%@page import="cn.edu.nsu.bookshop.db.last.users.Users"%>
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
    
	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">操作成功</h3>
					
				</div>
				<div class="panel-body">
		               <div class="alert alert-success"><h4>修改类型成功！</h4></div>
		                
			    </div>
			    <div class="panel-footer">
			    	 <div class="btn-group">
						 <button type="button" class="btn btn-primary" onclick="javascript:window.history.back();"><i class="fa fa-fw fa-lg fa-times-circle"></i>返回</button>
					 </div>
			    </div>
			</div>
		</div>
		
	</div>
	
	
	<%
		Users dataObj = new Users();
		String users_name = request.getParameter("users_name"); 
		System.out.println(users_name);
		String users_sex = request.getParameter("users_sex"); 
		System.out.println(users_sex);
 		String roles_id = request.getParameter("roles_id"); 
 		System.out.println(roles_id);
 		String users_idNum = request.getParameter("users_idNum"); 
 		System.out.println(users_idNum);
 		String users_mobile = request.getParameter("users_mobile"); 
 		System.out.println(users_mobile);
 		String users_address = request.getParameter("users_address"); 
 		System.out.println(users_address);
 		String users_postcode = request.getParameter("users_postcode"); 
 		System.out.println(users_postcode);
 		String users_portraitImg = request.getParameter("users_portraitImg"); 
 		System.out.println(users_portraitImg);
	%>

	<!--全局JS -->
	<script src="/bookshop/js/admin/share/jquery-3.2.1.min.js"></script>
	<script src="/bookshop/js/admin/share/bootstrap.min.js"></script> 
	<script src="/bookshop/js/admin/share/share.js"></script>
	
	<!--私有JS-->

	<script type="text/javascript">
    
        
      
    </script>
</body>