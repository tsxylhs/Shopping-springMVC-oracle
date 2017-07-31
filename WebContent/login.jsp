<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!--
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登陆</title> -->
<%-- </head>


<body>

	<div align="center">
	
<c:if test="${err!=0}">
	<h6 color="red">账号或者密码错误！</h6>

</c:if>
		<form action="login" method="post">
			用户名:<input type="text" name="username"><br> 密码:<input
				type="password" name="userpassword"><br> <input
				type="submit" value="登陆">

		</form>
		<a href="register.jsp"><button value="注册">注册</button></a>
	</div --%>>


<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Amaze UI Admin index Examples</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="images/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="images/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <link rel="stylesheet" href="css/amazeui.min.css" />
    <link rel="stylesheet" href="css/amazeui.datatables.min.css" />
    <link rel="stylesheet" href="css/app.css">
    <script src="js/jquery.min.js"></script>

</head>

		
<body data-type="login">
<c:if test="${err!=0}">
	<h6 color="red">账号或者密码错误！</h6>

</c:if>
    <script src="js/theme.js"></script>
  
        <div class="tpl-login">
            <div class="tpl-login-content">
                <div class="tpl-login-logo">

                </div>


             
                <form class="am-form tpl-form-line-form" action="login" method="post">
                    <div class="am-form-group">
                        <input type="text" class="tpl-form-input" id="user-name" name="username" placeholder="请输入账号">

                    </div>

                    <div class="am-form-group">
                        <input type="password" class="tpl-form-input" id="user-name"  name="userpassword" placeholder="请输入密码">

                    </div>
                    <div class="am-form-group tpl-login-remember-me">
                        <input id="remember-me" type="checkbox">
                        <label for="remember-me">
       
                        记住密码
                         </label>

                    </div>






                    <div class="am-form-group">

                        <button type="submit" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn">提交</button>
                        <a href="register.jsp" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn">注册</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <script src="js/amazeui.min.js"></script>
    <script src="js/app.js"></script>

</body>

</html>
</body>
</html>