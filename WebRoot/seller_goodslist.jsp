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
<link type="text/css" rel="stylesheet" href="css/user.css" />
<script type="text/javascript" src="js/common.js"></script>
</head>

<body>
	<jsp:include page="indexheader.jsp" />
	<div class="main">
		<div class="user_content">
			<jsp:include page="seller_left.jsp" />
			<div class="con_right">
				<div class="user_con">
					<div class="user_pub">
						<a href="" onClick="product_style(2)">商品浏览</a> <select
							name="goodsType">
							<option>查看全部</option>
							<option>类型</option>
							<option>款式</option>
						</select>
					</div>
					<form id="formCart" name="formCart" method="post" action="">
						<table width="100%" align="center">
							<tr>
								<td>商品图片</td>
								<td>商品名字</td>
								<td>商品价格</td>
								<td>商品销量</td>
								<td>商品数量</td>
								<td>操作</td>
							</tr>

							<s:iterator value="list" status="status">
								<tr>
									<td><a href="#" title=""><img name="Goods_Pic"
											id="pic" style="width:100px;height:100px;"
											src="upload/<s:property value="goodsPic"/>" /> </a></td>
									<td><s:hidden name="goodsId" /> <s:property
											value="goodsName" /></td>
									<td><span class="font_2">￥<s:property
												value="goodsPrice" /> </span></td>
									<td><span class="font_2"><s:property
												value="goodsSaleNum" /> </span></td>
									<td><span class="font_2"><s:property
												value="goodsNum" /> </span></td>
									<td><a
										href="Goods!findGoods.action?goods.goodsId=<s:property value="goodsId"/>"
										Style="color: red; font-weight: bold;">商品详情</a> <br> <a
										href="Goods!deleteGoods.action?goods.goodsId=<s:property value="goodsId"/>"
										Style="color: red; font-weight: bold;">删除商品</a></td>
							</s:iterator>
							<tr>
						</table>
						<table border="0" align="left" cellpadding="0" cellspacing="0">
							<th><span>&nbsp;&nbsp;当前第<s:property
									value="pageNo" /> / <s:property value="pageCount" />页</span></th>
						</table>
						<table border="0" align="right" cellpadding="0" cellspacing="0">
							<tr>
								<td width="40"><a
									href="Goods!findGoodsListBySeller.action?pageNo=1">首页</a></td>
								<td width="45"><a
									href="Goods!findGoodsListBySeller.action?pageNo=<s:property value="pageNo-1"/>">上页</a>
								</td>
								<td width="45"><a
									href="Goods!findGoodsListBySeller.action?pageNo=<s:property value="pageNo+1"/>">下页</a>
								</td>
								<td width="40"><a
									href="Goods!findGoodsListBySeller.action?pageNo=<s:property value="pageCount"/>">尾页</a>
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
