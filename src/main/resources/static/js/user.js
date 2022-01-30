let index = {
	init:function(){
		$("#btn-save").on("click", ()=>{
			this.save();
});
},
	save:function(){
		// alert('user의 save함수 호출됨');
		let data = {
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val()

}

		$.ajax().done().fail(); // ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여 insert 요청!!
},

	login:function(){
		// alert('user의 save함수 호출됨');
		let data = {
			username: $("#username").val(),
			password: $("#password").val()
};

		$.ajax({
			type:"POST",
			url:"/blog/api/user/login",
			data:JSON.stringify(data), // http body 데이터
			contentType:"application/json; charset=utf-8", // body 데이터가 어떤 타입인지 
			dataType:"json" // 요청을 서버로해서 응답 오면 기본적으로 모두 문자열 
}).done(function(resp){
alert("회원가입 완료");
location.href="/blog";
}).fail(function(error){
alert(JSON.stringify(error));});
}



}

index.init();