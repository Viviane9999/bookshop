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
						 <a href="<%=request.getContextPath() %>/Admin/User/List"><button type="button" class="btn btn-primary" onclick="javascript:window.history.back();"><i class="fa fa-fw fa-lg fa-times-circle"></i>返回</button>
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