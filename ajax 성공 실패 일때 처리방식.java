 type: : "text",  
	     url: "web06",   
	     data: param,  
	     dataType: "txt",
	     success: function(data){
	    // 성공 했을 때 처리
	    },
	     error:function(request,status,error){
	        alert("NaN"); // 실패 시 처리
	       },
	     complete : function(data) {
	                 //  실패했어도 완료가 되었을 때 처리
	        }
	 );

