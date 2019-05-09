 $(document).ready(function(){ 
	   //获取主机地址之后的目录，如： ybzx/index.jsp  
	    var pathName=window.document.location.pathname;
	    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1); 
		  //省 
		  $.ajax({url:projectName+"/js/share/City.xml", 
		   success:function(xml){ 
		    $(xml).find("province").each(function(){ 
		    var t = $(this).attr("name");//this-> 
		    $("#DropProvince").append("<option>"+t+"</option>"); 
		    }); 
		   } 
		  }); 
		  //市 
		  $("#DropProvince").change(function(){ 
		   $("#sCity>option").remove(); 
		   $("#sArea>option").remove(); 
		   var pname = $("#DropProvince").val(); 
		   $.ajax({url:projectName+"/js/share/City.xml", 
		   success:function(xml){ 
		    ///查找<province>下的所有第一级子元素(即城市) 
		    $(xml).find("province[name='"+pname+"']>city").each(function(){ 
		    var city = $(this).attr("name");//this-> 
		    $("#sCity").append("<option>"+city+"</option>"); 
		    }); 
		    ///查找<city>下的所有第一级子元素(即区域) 
		    var cname = $("#sCity").val(); 
		    $(xml).find("city[name='"+cname+"']>area").each(function(){ 
		    var area = $(this).attr("name");//this-> 
		    $("#sArea").append("<option>"+area+"</option>"); 
		    }); 
		   } 
		   }); 
		  }); 
		  //区 
		  $("#sCity").change(function(){ 
		   $("#sArea>option").remove(); 
		   var cname = $("#sCity").val(); 
		   $.ajax({url:projectName+"/js/share/City.xml", 
		   success:function(xml){ 
		    ///查找<city>下的所有第一级子元素(即区域) 
		    $(xml).find("city[name='"+cname+"']>area").each(function(){ 
		    var area = $(this).attr("name");//this-> 
		    $("#sArea").append("<option>"+area+"</option>"); 
		    }); 
		   } 
		   }); 
		  }); 
		 }); 