<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/common.css" />
<link type="text/css" rel="stylesheet" href="css/index.css" />
<link type="text/css" rel="stylesheet" href="css/product.css" />
<script type="text/javascript" src="js/common.js"></script>
<title>爱玛克首页</title>
</head>
<body>
    	<div class="con_left">
    	<div class="menu_top"><span>商品类型</span></div>
        	<div class="pro_menu">
                <ul>
                	<li><a href="#" title=""><span>帽子</span></a>
                	</li>
                </ul>
                <ul>
                	<li><a href="#" title=""><span>衣服</span></a>
                	</li>
                </ul>
                <ul>
                	<li><a href="#" title=""><span>裤子</span></a>
                	</li>
                </ul>
            </div>
    	
            <div class="index_banner1"><a href="#"><img src="images/index_adver3.jpg"/></a></div>
        	<div class="sales">
            	<div class="left_top"><span></span><a href="#" title="">&gt;&gt;</a></div>
                <div class="sales_box">
                123
                </div>
            </div>
        	<div class="buyer_com">
            	<div class="left_top"><span></span><a href="#" title="">&gt;&gt;</a></div>
                <div class="buy_box">  
                123 
                </div>
            </div>             
        </div>
</body>
</html>
