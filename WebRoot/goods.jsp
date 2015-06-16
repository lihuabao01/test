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
</head>

<body>
	<jsp:include page="indexheader.jsp" />
	<div class="main">
		<div class="index_content">
			<jsp:include page="index-left.jsp" />
			<div id="pro_box" class="box_3">
				<div class="index_box_3">
					<div class="right_top">
						<span>商品浏览</span><a href="#" title=""></a>
					</div>
					<s:iterator value="list" status="status">

						<div class="right_box4">
							<div class="con_pic4">
								<a
									href="Goods!findGoodsToCustom.action?goods.goodsId=<s:property value="goodsId" />"
									title=""><img src="upload/<s:property value="goodsPic"/>"
									alt="图片名称" /> </a>
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
									href="ShopCart!addShopCart.action?goods.goodsId=<s:property value="goodsId" />&snum=1">
									<img style="text-align:center; width:95px;height:28px;"
									src="images/addcart.png" /> </a> <a href="#"> <img
									style="text-align:center; width:67px;height:28px;"
									src="images/shoucan.png" /> </a>
							</div>
						</div>


					</s:iterator>
				</div>
				<table border="0" align="left" cellpadding="0" cellspacing="0">
					<span Style="font-size:5px;">&nbsp;&nbsp;当前第<s:property
							value="pageNo" /> / <s:property value="pageCount" />页</span>
				</table>
				<table border="1" align="right" cellpadding="0" cellspacing="0">
					<tr>
						<td width="40"><a href="Goods!findGoodsListAll?pageNo=1">首页</a>
						</td>
						<td width="45"><a
							href="Goods!findGoodsListAll?pageNo=<s:property value="pageNo-1"/>">上页</a>
						</td>
						<td width="45"><a
							href="Goods!findGoodsListAll?pageNo=<s:property value="pageNo+1"/>">下页</a>
						</td>
						<td width="40"><a
							href="Goods!findGoodsListAll?pageNo=<s:property value="pageCount"/>">尾页</a>
						</td>
					</tr>
				</table>

			</div>
		</div>
	</div>
</body>
</html>
