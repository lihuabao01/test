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
			<jsp:include page="custom_left.jsp" />
			<div class="con_right">
				<div class="pad_border">
					<div class="user_con">
						<div class="subject">
							<span>订单详情</span>
						</div>
						<s:form action="flow.php" method="post" name="theForm"
							id="theForm" theme="simple">
							<table width="100%" align="center">
								<tr>
									<td>商品图片</td>
									<td>商品名字</td>
									<td>商品类型</td>
									<td>商品价格</td>
									<td>购买数量</td>
									<td>小计</td>
								</tr>
								<s:iterator value="oinfolist" status="status">
									<tr>
										<td><img src="upload/<s:property value="oinfoPic"/>" Style="width:80px;height:80px;"/>
										</td>
										<td><s:property value="oinfoName" />
										</td>
										<td><s:property value="oinfoType" />
										</td>
										<td>￥<s:property value="oinfoPrice" />
										</td>
										<td><s:property value="oinfoNum" />
										</td>
										<td>￥<s:property value="oinfoSub" />
										</td>
									</tr>
								</s:iterator>
							</table>
							<table width="100%" align="center" border="0" cellpadding="5"
						cellspacing="1" bgcolor="#dddddd">
						<tr>
							<td class="align_left"><p Style="margin-left: 20px">购物金额总额￥<s:property
										value="order.orderSub" /> </p>
							</td>
							
						</tr>
					</table>
						</s:form>
						<div class="subject">
							<span>订单信息</span>
						</div>
						<s:form action="#" method="post" name="theForm" id="theForm"
							theme="simple">
							<table width="100%" align="center">
								<tr>
									<td width="40%" class="align_left">订单号:</td>
									<td class="align_left"><s:property value="order.orderId" />
									</td>
								</tr>
								<tr>
									<td width="40%" class="align_left">订购时间:</td>
									<td class="align_left"><s:property value="order.orderTime" />
									</td>
								</tr>
								<tr>
									<td width="40%" class="align_left">收货人姓名:</td>
									<td class="align_left"><s:property value="order.orderName" />
									</td>
								</tr>
								<tr>
									<td width="40%" class="align_left">电话:</td>
									<td class="align_left"><s:property
											value="order.orderPhone" /></td>
								</tr>
								<tr>
									<td width="40%" class="align_left">收货地址:</td>
									<td class="align_left"><s:property
											value="order.orderAddress" /></td>
								</tr>
							</table>
						</s:form>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
