<%@page import="cn.edu.nsu.bookshop.db.last.users.Users"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nsu.bookshop.db.last.users.UsersDAO"%>
<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>人员管理-网上书店</title>
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
					<i class="fa fa-dashboard"></i> 人员管理
				</h3>
			</div>
			<div class="col-md-6">
				<div style="text-align: center;"></div>
			</div>
			<div class="col-md-3">
				<ul class="functionTip app-breadcrumb breadcrumb">
					<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
					<li class="breadcrumb-item"><a href="">人员管理 / 列表</a></li>
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
						<th >头像</th>
	                    <th >姓名</th>
						<th >性别</th>
						<th >职务</th>
	                    <th >身份证号</th>
						<th >联系电话</th>
	                   	<th >操作</th>
	                  </tr>
	                </thead>
	                <tbody>
	                <%
	                //从DB的users表中查询出所有记录
	                //UsersDAO usersDAO = new UsersDAO();
	                //ArrayList<Users> users = usersDAO.getAll();
	                
	                ArrayList<Users> users = (ArrayList<Users>)request.getAttribute("users");
	                //显示查询得到的数据
	                for(int i=0;i<users.size();i++){
	                	Users user = users.get(i);
	                	%>
	                	<tr>
						<td>
							<a href="#" rel="rs-dialog" data-target="bigPicModal" title="点击看大图">
								<img src="<%=request.getContextPath()%><%=user.getUsers_portraitImg() %>" class="img-thumbnail" alt="头像" width="50" height="50">
							</a>
						</td>
	                    <td><%=user.getUsers_name() %></td>
						<td><%=user.getUsers_sex() %></td>
	                    <td><%=user.getRoles_id() %></td>
	                    <td><%=user.getUsers_idNum() %></td>
						<td><%=user.getUsers_mobile() %></td>
	                    <td>
	                        <a href="<%=request.getContextPath()%>/Admin/User/OpenModify?users_id=<%=user.getUsers_id() %>"><button class="btn btn-warning" type="button">修改</button></a>
							<a href="<%=request.getContextPath()%>/pages/admin/shares/success.html"><button class="btn btn-danger" type="button">禁用</button></a>
	                    </td>
	                  	</tr>
	                	<% 
	                }
					%>
	                  
	                  
	                  </tr>
	                  
	                </tbody>
	              </table>
              
			    </div>
			    <div class="panel-footer">
			    	 <div class="row paginationBox">
						<div class="col-md-4">
							<div class="paginationInfo">显示第 1 至 10 项结果，共 57 项</div>
						</div>
						<div class="col-md-4"></div>
						<div class="col-md-4">
							<ul class="pagination">
							    <li><a href="#">&laquo;</a></li>
							    <li class="active"><a href="#">1</a></li>
							    <li><a href="#">2</a></li>
							    <li><a href="#">3</a></li>
							    <li><a href="#">4</a></li>
							    <li><a href="#">5</a></li>
							    <li><a href="#">&raquo;</a></li>
							  </ul>
						</div>
					</div>
			    </div>
			</div>
		</div>
		
		
		
	</div>


	<!-- 大图模态框 -->
	<div class="rs-dialog" id="bigPicModal">
		<form action="">
			<div class="rs-dialog-box">
				<a class="close dismiss" href="#">&times;</a>
				
				<div class="rs-dialog-body">
					<div class="row">
						<div class="col-md-12" style="text-align:center;">
							<img src="<%=request.getContextPath()%>/img/admin/university.jpg" alt="头像" width="400" height="400">
						</div>
					</div>
				</div>
				
			</div>
		</form>	
	</div>
	
	<!-- 添加/修改模态框 -->
	<div class="rs-dialog" id="updateModal">
		<form action="">
			<div class="rs-dialog-box">
				<a class="close dismiss" href="#">&times;</a>
				<div class="rs-dialog-header">
					<h3>新增人员</h3>
				</div>
				<div class="rs-dialog-body">
					<div class="row">
						<div class="col-md-12">
			                <div class="form-group col-md-12 form-inline" >
			                  <label class="control-label-required">姓名</label>
			                  <input class="form-control" type="text" placeholder="请输入人员的姓名">
			                </div>
							
							<div class="form-group col-md-12 form-inline" >
							  <label class="control-label-required">性别</label>
							  <select class="form-control">
							       <option>男</option>
							       <option>女</option>
							  </select>			
							</div>
							
							<div class="form-group col-md-12 form-inline" >
							  <label class="control-label-required">职务</label>
							  <select class="form-control">
							       <option>超级管理员</option>
								   <option>图书管理员</option>
							       <option>人事管理员</option>
							  </select>			
							</div>
							
							<div class="form-group col-md-12 form-inline" >
							  <label class="control-label-required">身份<br>证号</label>
							  <input class="form-control" type="text" placeholder="请输入人员的省份证号码">
							</div>
							
			                <div class="form-group col-md-12 form-inline" >
			                  <label class="control-label-required">手机</label>
							  <input class="form-control" type="text" placeholder="请输入人员的手机号码">
			                </div>
							
							<div class="form-group col-md-12 form-inline" >
								<label class="control-label-required">地址</label>
								<textarea class="form-control" rows="4" cols="40" placeholder="请输入人员的地址"></textarea>
							</div>
							
							<div class="form-group col-md-12 form-inline" >
							  <label class="control-label-required">邮编</label>
							  <input class="form-control" type="text" placeholder="请输入人员的邮政编码">
							</div>
							
							<div class="form-group col-md-12 form-inline" >
							  <label class="control-label-required">头像</label>
							  <input class="form-control" type="file">
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
	<script src="<%=request.getContextPath()%>/js/admin/share/cityDrop.js"></script>
	
	<!--私有JS-->
	<script src="<%=request.getContextPath()%>/plugins/myModal/myModal.js"></script>	
	
	<script type="text/javascript">
    
        
      
    </script>
</body>