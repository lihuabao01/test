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
							<span>商品信息</span>
						</div>
						<s:form action="Goods!addGoods.action" method="post"
							theme="simple" enctype="multipart/form-data">
							<table width="98%" align="center">
								<tr>
									<td class="align_right">商品名字:</td>
									<td class="align_left"><s:textfield name="goods.goodsName" />
									</td>
								</tr>
								<tr>
									<td class="align_right">商品图片:</td>
									<td class="align_left"><img name="Goods_Pic" id="pic"
										weight=80px height=80px src="" /> <s:file name="upload"
											label="形象" size="20" onchange="preImg(this.id,'pic');" /></td>
								</tr>
								<tr>
									<td class="align_right">商品类型:</td>
									<td valign="middle" class="align_left"><s:select
											name="goods.goodsType" list="{'帽子','衣服','裤子'}"/>
									</td>
								</tr>
								<tr>
									<td class="align_right">商品价格:</td>
									<td valign="middle" class="align_left"><s:textfield
											name="goods.goodsPrice" /></td>
								</tr>
								<tr>
									<td class="align_right">商品数量:</td>
									<td valign="middle" class="align_left"><s:textfield
											name="goods.goodsNum" />
									</td>
								</tr>
								<tr>
									<td class="align_right">所属商户:</td>
									<td valign="middle" class="align_left"><s:property
											value="#session.Name" /></td>
								</tr>
								<tr>
									<td class="align_right">商品描述:</td>
									<td valign="middle" class="align_left"><s:textarea
											rows="10" cols="50" name="goods.goodsDescribe" /></td>
								</tr>
								<tr>
									<td colspan="2"><s:submit value="确认上架" />
									</td>
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
