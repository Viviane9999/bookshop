<%@page import="cn.edu.nsu.bookshop.db.last.roles.Roles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.bookshop.db.last.roles.RolesDAO"%>
<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>职位管理-网上书店系统</title>
<meta charset="utf-8">
<!--全局CSS-->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/admin/share/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/admin/share/myStyle.css">
<!--私有CSS-->
<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/myModal/myModal.css">
</head>

<body>
    <!-- 页面顶部导航条 -->
	<div class="row panel titlePanel">
		<div class="col-md-12">
			<div class="col-md-3">
				<h3>
					<i class="fa fa-dashboard"></i> 职位管理
				</h3>
			</div>
			<div class="col-md-6">
				<div style="text-align: center;"></div>
			</div>
			<div class="col-md-3">
				<ul class="functionTip app-breadcrumb breadcrumb">
					<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
					<li class="breadcrumb-item"><a href="">职位 / 列表</a></li>
				</ul>
			</div>
		</div>
	</div>
    <!-- 页面内容体 -->
    
	<div class="row">
		
		
		<div class="col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="row col-md-12">
						   <div class="col-md-9"></div>
	                       <div class="col-md-3" style="text-align: right;">
							  	<a href="#" rel="rs-dialog" data-target="updateModal"><button class="btn btn-default" type="button"><i class="fa fa-fw fa-lg fa-plus-circle"></i>添加</button></a>
	                       </div>
	                </div>
				</div>
				<div class="panel-body">
				
	              <table class="table table-hover table-bordered table-striped" id="dataTable">
	                <thead>
	                  <tr>
	                    <th width="20%">名称</th>
	                    <th width="60%">职责</th>
	                   	<th width="20%">操作</th>
	                  </tr>
	                </thead>
	                <tbody>
					<%
	                RolesDAO rolesDAO = new RolesDAO();
					ArrayList<Roles> roles = rolesDAO.getAll();
	                for(int i=0;i<roles.size();i++){
	                	Roles role = roles.get(i);
	                	%>
	                	<tr>
	                    <td><%=role.getRoles_name() %></td>
	                    <td><%=role.getRoles_note() %></td>
	                    <td>
	                    	<a href="<%=request.getContextPath()%>/pages/admin/roles/detail.html"><button class="btn btn-success" type="button">详情</button></a>
	                        <a href="<%=request.getContextPath()%>/pages/admin/roles/modify.html"><button class="btn btn-warning" type="button">修改</button></a>
							<a href="<%=request.getContextPath()%>/pages/admin/roles/predom.html"><button class="btn btn-primary" type="button">配置权限</button></a>
						</td>
	                  </tr>
	                	<% 
	                }
					%>
	                  
	                  
	                </tbody>
	              </table>
              
			    </div>
			    
			</div>
		</div>
		
		
		
	</div>


	<!-- 添加/修改模态框 -->
	<div class="rs-dialog" id="updateModal">
		<form action="">
			<div class="rs-dialog-box">
				<a class="close dismiss" href="#">&times;</a>
				<div class="rs-dialog-header">
					<h3>新增职位</h3>
				</div>
				<div class="rs-dialog-body">
					<div class="row">
						<div class="col-md-12">
			                <div class="form-group col-md-12 form-inline" >
			                  <label class="control-label-required">名称</label>
			                  <input class="form-control" type="text" placeholder="请输入职位的名称">
			                </div>
							
			                <div class="form-group col-md-12 form-inline" >
			                  <label class="control-label-norequired">职责</label>
			                  <textarea class="form-control" rows="2" cols="40" placeholder="请输入职位的说明"></textarea>
			                </div>
						</div>
					</div>
				</div>
				<div class="rs-dialog-footer form-footer">
					<input type="button" class="btn btn-danger dismiss" value="提交">
				</div>
			</div>
		</form>	
	</div>

	

	<!--全局JS-->
	<script src="<%=request.getContextPath()%>/js/admin/share/jquery-3.2.1.min.js"></script>
	 <script src="<%=request.getContextPath()%>/js/admin/share/bootstrap.min.js"></script> 
	<script src="<%=request.getContextPath()%>/js/admin/share/share.js"></script>
	<!--私有JS-->
	<script src="<%=request.getContextPath()%>/plugins/myModal/myModal.js"></script>

	<script type="text/javascript">
    
        
      
    </script>
</body>