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
<link type="text/css" rel="stylesheet" href="css/flow.css" />
<script type="text/javascript" src="js/common.js"></script>
<%-- <script>
	function updateScartNum() {
		formCart.action = ""
		document.getElementById("formCart").submit();
	}
</script> --%>
</head>
<body>
	<jsp:include page="indexheader.jsp" />
	<div class="main">
		<div class="user_content">
			<div class="flowBox">
				<h6>
					<span>商品列表</span>
				</h6>
				<s:form id="formCart" name="formCart" method="post"
					action="ShopCart!updateShopCart.action" theme="simple">
					<table width="99%" align="center">
						<tr>
							<th>商品名称</th>
							<th>类型</th>
							<th>价格</th>
							<th>购买数量</th>
							<th>小计</th>
							<th>操作</th>
						</tr>
						<s:iterator value="sinfolist" status="status">
							<tr>
								<td><a href="#"> <img
										src="upload/<s:property value="goodsPic"/>" border="0"
										width="90" height="90" /> </a><br /> <a href="#" class="f6"><s:property
											value="goodsName" /> </a>
								</td>
								<td><s:property value="goodsType" />
								</td>
								<td><span>￥</span> <s:property value="goodsPrice" />
								</td>
								<td><s:property value="shoppingNum" />
								</td>
								<td><s:property value="shoppingSub" /></td>
								<td><a
									href="ShopCart!deleteShopCartById.action?sid=<s:property value="shoppingCartId"/>"
									class="red_a">删除</a></td>
							</tr>
						</s:iterator>
					</table>
					<table width="99%" align="center" border="0" cellpadding="5"
						cellspacing="1" bgcolor="#dddddd">
						<tr>
							<td class="align_left">购物金额总额￥<span class="color2"><s:property
										value="scartsub" /> </span>
							</td>
							<td class="align_right"><a
								href="ShopCart!deleteShopCartByCustomId.action">清空全部</a>
							</td>
						</tr>
					</table>
					<input type="hidden" name="step" value="update_cart" />
				</s:form>
			</div>
		</div>
		<s:form action="Order!addOrder.action" method="post" name="orderform" id="orderform" theme="simple">
			<div class="flowBox">
				<h6>
					<span>收货人信息</span>
				</h6>
				<table width="99%" align="center">
					<tr>
						<td class="align_left">收货人姓名:</td>
						<td class="align_left"><s:textfield name="order.orderName" /><span>*</span>
						</td>

					</tr>
					<tr>
						<td class="align_left">电话:</td>
						<td class="align_left"><s:textfield name="order.orderPhone" /><span>*</span>
						</td>
					</tr>
					<tr>
						<td class="align_left">收货地址:</td>
						<td class="align_left"><s:textfield name="order.orderAddress"
								Style="width:300px" /><span>*</span>
						</td>
					</tr>
				</table>
			</div>
			<div class="flowBox">
				<table width="99%" align="center">
					<tr>
						<td><input type="button" style="background: url('images/cart_btn4.jpg');width:145px;height:40px;"
							onclick="this.form.submit();" /></td>
					</tr>
				</table>
			</div>
		</s:form>
	</div>
</body>
</html>
