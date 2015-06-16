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
			<div class="pad_border">
				<div class="user_con">
					<div class="subject">
						<span>商品信息</span>
					</div>
					<s:form action="Goods!updateGoods.action" method="post" theme="simple"
						enctype="multipart/form-data">
						<table width="98%" align="center">
						<tr>
								<td class="align_right">商品编号:</td>
								<td class="align_left"> <s:property
										value="goods.goodsId" /></td>
							</tr>
							<tr>
								<td class="align_right">商品名字:</td>
								<td class="align_left"> <s:textfield
										name="goods.goodsName" /></td>
							</tr>
							<tr>
								<td class="align_right">商品图片:</td>
								<td class="align_left"><img name="goods.goodsPic" id="pic"
									style="width:100px;height:100px;"
									src="upload/<s:property value="goods.goodsPic"/>" /> <s:file
										name="upload" label="形象" size="20"
										onchange="preImg(this.id,'pic');" /></td>
							</tr>
							<tr>
								<td class="align_right">商品类型:</td>
								<td valign="middle" class="align_left"><s:select
										name="goods.goodsType" list="{'帽子','衣服','裤子'}" />
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
								<td colspan="2"><s:submit value="确认修改" /></td>
							</tr>
						</table>
					</s:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
