<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
<link type="text/css" rel="stylesheet" href="css/user.css" />
<script type="text/javascript" src="js/common.js"></script>
</head>
<body>
	<jsp:include page="indexheader.jsp" />
	<div class="main">
		<div class="user_content">
			<jsp:include page="seller_left.jsp" />
			<div class="con_right">
				<div class="pad_border">
					<div class="user_con">
						<div class="subject">
							<span>我的订单</span>
						</div>
						<form action="flow.php" method="post" name="theForm" id="theForm"
							onsubmit="return checkConsignee(this)">
							<table width="98%" align="center">
								<tr>
									<td width="19%">订单号</td>
									<td width="23%">下单时间</td>
									<td width="22%">订单总金额</td>
									<td width="20%">收件人</td>
									<td width="15%">操作</td>
								</tr>
								<s:iterator value="orderlist" status="status">
									<tr>
										<td><s:property value="orderId" /></td>
										<td><s:property value="orderTime" /></td>
										<td class="td2">￥<s:property value="orderSub" /></td>
										<td><s:property value="orderName" /></td>
										<td><a
											href="Order!findOrderInfoBySellerOrder.action?orderId=<s:property value="orderId"/>">详细信息</a></br>
											<a href="Order!deleteOrder?order.orderId=<s:property value="orderId" /> ">取消订单</a></td>
									</tr>
								</s:iterator>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
