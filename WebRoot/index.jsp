<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/common.css" />
<link type="text/css" rel="stylesheet" href="css/index.css" />
<link type="text/css" rel="stylesheet" href="css/product.css" />
<script type="text/javascript">
	window.onload = function() {
		var load = "true";
<%if (request.getSession().getAttribute("load") == null) {
				request.getSession().setAttribute("load", "true");
			}%>
	
<%if (request.getSession().getAttribute("load") == "true") {%>
	load = "true";
<%} else {%>
	load = "false";
<%}%>
	if (load == "true") {
			window.location.href = "Goods!loadindex.action";
		} else {
<%request.getSession().setAttribute("load", "true");%>
	}
	}
</script>
</head>

<body>
	<jsp:include page="indexheader.jsp" />
	<div class="main">
		<div class="index_content">
			<jsp:include page="index-left.jsp" />
			<div class="con_right">
				<div class="index_box_3">
					<div class="index_box_1">
						<a href="#"><img src="images/index_adver1.jpg" alt="广告图" /> </a>
					</div>
					<div class="index_box_3">
						<div class="right_top">
							<span>热门推荐</span><a href="#" title="">查看更多热门推荐&gt;&gt;</a>
						</div>
						<s:iterator value="salelist" status="status">
							<div class="right_box4">
								<div class="con_pic4">
									<a href="Goods!findGoodsToCustom.action?goods.goodsId=<s:property value="goodsId" />" title=""><img
										src="upload/<s:property value="goodsPic"/>" alt="图片名称" /> </a>
								</div>
								<div class="con_txt3">
									<p Style="float: left;">
										<a href="#"><s:property value="goodsName" /> </a>
									</p>
									<s:hidden name="goodsId" />
									<p Style="float: right; margin-right: 3px;">
										￥
										<s:property value="goodsPrice" />
									</p>
								</div>
								<div class="con_txt4">
									<a
										href="ShopCart!addShopCartIndex.action?goods.goodsId=<s:property value="goodsId"/>&snum=1">
										<img style="text-align:center; width:95px;height:28px;"
										src="images/addcart.png" /> </a> <a href="#"> <img
										style="text-align:center; width:67px;height:28px;"
										src="images/shoucan.png" /> </a>
								</div>
							</div>
						</s:iterator>
					</div>
				</div>
				<div class="index_box_3">
					<div class="right_top">
						<span>新品推荐</span><a href="#" title="">查看更多新品推荐&gt;&gt;</a>
					</div>

					<s:iterator value="timelist" status="status">
					<div class="right_box4">
						<div class="con_pic4">
							<a href="#" title=""><img
								src="upload/<s:property value="goodsPic"/>" alt="图片名称" /> </a>
						</div>
						<div class="con_txt3">
							<p Style="float: left;">
								<a href="#"><s:property value="goodsName" /> </a>
							</p>
							<s:hidden name="goodsId" />
							<p Style="float: right; margin-right: 3px;">
								￥
								<s:property value="goodsPrice" />
							</p>
						</div>
						<div class="con_txt4">
							<a
								href="ShopCart!addShopCart.action?goods.goodsId=<s:property value="goodsId"/>">
								<img style="text-align:center; width:95px;height:28px;"
								src="images/addcart.png" /> </a> <a href="#"> <img
								style="text-align:center; width:67px;height:28px;"
								src="images/shoucan.png" /> </a>
						</div>
					</div>
					</s:iterator>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
