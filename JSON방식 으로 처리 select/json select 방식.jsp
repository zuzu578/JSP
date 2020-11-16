	  	//===>select<===//
 $(document)
.on('click','#btnGet',function(){
	//console.log('btnGet1')
	$.get('selectServlet',{},function(data){
		//json방식//
		console.log('btnGet2')
		console.log(data);
		$.each(data,function(ndx,value){
			//서블릿에서 써준대로 값을 써준다.//
			name='<tr><td>'+value['emp_id']+'</td><td>'+value['emp_name']+'</td><td>'+value['man_id']+'</td></tr>';
			$('#tblData').append(name);
			console.log('btnGet3')
		})
		
		/*
		alert("작업을 실행합니다.");
		ar = txt.split(',');
		for(i=0;i<ar.length;i++){
			//<tr><td>John</td></tr>이런식으로 넣게된다.//
			name = '<tr><td>'+ar[i]+'</td></tr>';
			$('#tblData').append(name);
		}*/
		
	},'json');//===>2개이상 타입 은 json 이라한다.//text는 하나//
	return false;
});
	  