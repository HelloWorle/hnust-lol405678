//$(".search_tips").css("width", $("#search-text-area").width() + "px");



/*$(window).resize(function(){
	$(".search_tips").css("width", $("#search-text-area").width() + "px");
	alert($("#search-text-area").offset().left);
	$(".search_tips").offset(function(n,c){
    	newPos=new Object();
        newPos.left=$("#search-text-area").offset().left + 5;
        return newPos;
    });
});*/




$("#search_text").focus(function(){
	$(this).css("background-color", "rgb(64,151,119)");
});
$("#search_text").blur(function(){
	$(this).css("background-color", "rgb(0,199,138)");
});


//var searchTips = $(".search_tips");
// 搜索提示框
/*$("#search_text").keyup(function(event){
	
	if (event.keyCode && (event.keyCode == 108)) {// 回车键
		
	} else if (event.keyCode >= 48 && event.keyCode <= 111) {
		// 模糊查询数据
		if ($("#search_text").val() != "" && searchTips.css("display") == "none") {
			searchTips.css("display", "block");
		}
	} else {
		if ($("#search_text").val() && searchTips.css("display") != "none") {
			searchTips.css("display", "none");
		}
	}
});*/
//点击页面隐藏搜索提示框
/*$(document).click(function (e) {  
    var e = e ? e : window.event;  
    var tar = e.srcElement || e.target;
    if (tar.id != "search_text") {  
        if ($("#search_tips").css("display") != "none") {  
            $("#search_tips").css("display", "none")  
        }  
    }  
});*/




// 跳转登录
function loginFun(){
	$('.mask_model').css("display", "block");
	$(".register").css("display", "none");
	$(".login").css("display", "block");
}

// 登录
function login() {
    console.log("login");
    var userName = $("#userName").val();
    var password = $("#password").val();
    var ajaLogin = $.ajax({
        url : "login",
        data : {
            userName : userName,
            password : password
        },
        dataType : "json",
        method : "post"
    });

    /*aja.always(function(){
        console.log("aja.always");
        registerFun();
    });*/

    ajaLogin.done(function(data){
        console.log("aja.done");
        var json = eval(data);
        console.log("json:" + json);
        if (json.code == '200') {
            layer.alert (json.msg, {
                icon: 1,
                skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
            });
            cancel_icon();
        } else if (json.code == '300') {
            layer.alert(json.msg, {
                icon: 2,
                skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
            });
        }
    });

    ajaLogin.fail(function(){
        console.log("aja.fail");
        layer.alert("网络异常，请稍后再试", {
            icon: 2,
            skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
        });
    });
}


// 跳转注册
function registerFun(){
	$('.mask_model').css("display", "block");
	$(".login").css("display", "none");
	$(".register").css("display", "block");
}

// 注册
function register() {
    console.log("register");
    var userNameNew = $("#userNameNew").val();
    var passwordNew = $("#passwordNew").val();
    var verifyCode = $("#verifyCode").val();
    var ajaRegister = $.ajax({
        url : "register",
        data : {
            userNameNew : userNameNew,
            passwordNew : passwordNew,
            verifyCode : verifyCode
        },
        dataType : "json",
        method : "post"
    });

   /* aja.always(function(){
        console.log("aja.always");
        registerFun();
    });*/

    ajaRegister.done(function(data){
        console.log("aja.done");
        var json = eval(data);
        console.log("json:" + json);
        if (json.code == '200') {
            layer.alert (json.msg, {
                icon: 1,
                skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
            });
            cancel_icon();
        } else if (json.code == '300') {
            layer.alert(json.msg, {
                icon: 2,
                skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
            });
        }
    });

    ajaRegister.fail(function(){
        console.log("aja.fail");
        layer.alert("网络异常，请稍后再试", {
            icon: 2,
            skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
        });
    });
}



// 取消图标
function cancel_icon() {
    $(".mask_model").css("display", "none");
    $(".login").css("display", "none");
    $(".register").css("display", "none");
}
$(".cancel_icon").click(function(){
    cancel_icon();
});
