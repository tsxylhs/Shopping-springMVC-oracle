<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTMutf-8L 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>注册</h1>
<form action="register" method="post">
     用户名:<input type="text" name="username"><br>
 密码:<input type="text" name="userpassword"><br>
   年龄:<input type="text" name="age"><br>
   性别:<input type="text" name="sex"><br>
  地址:
  <input type="text" name="address"><br>
   <input type="submit" value="提交">
</form>
</body>
</html> -->
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>注册</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="images/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="images/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="css/amazeui.min.css" />
<link rel="stylesheet" href="css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="css/app.css">
<script src="js/jquery.min.js"></script>

</head>

<body data-type="login">
	<script src="js/theme.js"></script>

		<div class="tpl-login">
			<div class="tpl-login-content">
				<div class="tpl-login-title">注册用户</div>
				<span class="tpl-login-content-info"> 创建一个新的用户 </span>


				<form class="am-form tpl-form-line-form" action="register" method="post">


					<div class="am-form-group">
						<input type="text" class="tpl-form-input"
							name="username" placeholder="用户名">
					</div>

					<div class="am-form-group">
						<input type="password" class="tpl-form-input"  
						name="userpassword" placeholder="请输入密码">
					</div>


					<div class="am-form-group">
						<input type="text" class="tpl-form-input" 
							name="userphone" placeholder="电话">

					</div>

					<div class="am-form-group tpl-login-remember-me">
						<input id="remember-me" type="checkbox"> <label
							for="remember-me"> 我已阅读并同意 <a href="javascript:;">《用户注册协议》</a>
						</label>

					</div>

					<div class="am-form-group">

						<button type="submit"
							class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn">提交</button>

					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="js/amazeui.min.js"></script>
	<script src="js/app.js"></script>

</body>

</html>