 $(document).ready(function(){ 
	   //��ȡ������ַ֮���Ŀ¼���磺 ybzx/index.jsp  
	    var pathName=window.document.location.pathname;
	    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1); 
		  //ʡ 
		  $.ajax({url:projectName+"/js/share/City.xml", 
		   success:function(xml){ 
		    $(xml).find("province").each(function(){ 
		    var t = $(this).attr("name");//this-> 
		    $("#DropProvince").append("<option>"+t+"</option>"); 
		    }); 
		   } 
		  }); 
		  //�� 
		  $("#DropProvince").change(function(){ 
		   $("#sCity>option").remove(); 
		   $("#sArea>option").remove(); 
		   var pname = $("#DropProvince").val(); 
		   $.ajax({url:projectName+"/js/share/City.xml", 
		   success:function(xml){ 
		    ///����<province>�µ����е�һ����Ԫ��(������) 
		    $(xml).find("province[name='"+pname+"']>city").each(function(){ 
		    var city = $(this).attr("name");//this-> 
		    $("#sCity").append("<option>"+city+"</option>"); 
		    }); 
		    ///����<city>�µ����е�һ����Ԫ��(������) 
		    var cname = $("#sCity").val(); 
		    $(xml).find("city[name='"+cname+"']>area").each(function(){ 
		    var area = $(this).attr("name");//this-> 
		    $("#sArea").append("<option>"+area+"</option>"); 
		    }); 
		   } 
		   }); 
		  }); 
		  //�� 
		  $("#sCity").change(function(){ 
		   $("#sArea>option").remove(); 
		   var cname = $("#sCity").val(); 
		   $.ajax({url:projectName+"/js/share/City.xml", 
		   success:function(xml){ 
		    ///����<city>�µ����е�һ����Ԫ��(������) 
		    $(xml).find("city[name='"+cname+"']>area").each(function(){ 
		    var area = $(this).attr("name");//this-> 
		    $("#sArea").append("<option>"+area+"</option>"); 
		    }); 
		   } 
		   }); 
		  }); 
		 }); 