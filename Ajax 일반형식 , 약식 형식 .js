Ajax 표준.형식

$.ajax({ 
  url:'servletname',
  method:'get/post',
  data:querystring,
  datatype:'text/xml/json',
  beforesend:function(){

  },
  success:function(){

  },
  error:function(){

  },

 complete:function(){

 }
  

})


Ajax 약식 형식

$.post/get(
    
    'servletname',
//data{key:value,key:value,.....},
      function(){
     //성공할때 할일//
 
       },
//datatype 'text/xml/json'

);
