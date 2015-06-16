<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/common.css" />
<link type="text/css" rel="stylesheet" href="css/index.css" />
<link type="text/css" rel="stylesheet" href="css/product.css" />
<link type="text/css" rel="stylesheet" href="css/user.css" />
<script type="text/javascript" src="js/common.js"></script>
<title>爱玛克首页</title>
</head>
<body>
		<div class="con_left">
			<div class="pad_border">
				<ul class="user_menu">
					<li class="user_icon1"><a
						href="User!findCustomInfo.action">个人信息</a></li>
					<li class="user_icon2"><a
						href="Order!findOrderListByCustom.action" >我的订单</a>
					</li>
				</ul>
				<div class="user_logout">
					<a href="#" title="退出"><img src="images/user_btn1.jpg" alt="退出" />
					</a>
				</div>
			</div>
		</div>
</body>
</html>
