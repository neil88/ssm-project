/**
 * user.jsp  js代码处理
 */
	
	$(function(){
		$("#addUser").click(function(){
			var name=$("#name").val();
			var age=$("#age").val();
			$.ajax({
				url:zxy+"user/addUser",
				type:"POST",
				async:false,
				data:{
					"name":name,
					"age":age
				},
				success:function(data){
					if(data.code==200){
						alert(data.msg);
						window.location.href=zxy+"user/queryUserList"
					}else{
						alert(data.msg);
					}
				},
				error: function(){
				    alert(arguments[1]);
				}
			})
		})
		$("#queryUser").click(function(){
			$.ajax({
				url:zxy+"user/queryUserList",
				data:"",
				async:false,
				type:"POST",
				success:function(date){
					alert("成功");
				},
				error: function(){
				    alert(arguments[1]);
				}
			})
		})
	});

	