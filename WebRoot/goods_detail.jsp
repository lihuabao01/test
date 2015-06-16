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
<body onload="margin_top_height();">
	<jsp:include page="indexheader.jsp" />
	<div class="main">
		<div class="location">
			<span class="icon"></span>你现在的位置：<a href="#">爱玛克</a>&gt;<a
				class="current_a" href="#">登录</a>
		</div>
		<div class="box5">
			<s:form action="ShopCart!addShopCart.action" method="post"
				theme="simple">
				<div class="con_left">
					<s:hidden name="goods.goodsId" />
					<img src="upload/<s:property value="goods.goodsPic"/>"
						Style="width:400px;height:350px" alt="产品图片" />
				</div>
				<ul class="con_right">
					<li class="title">123<s:property value="goods.goodsName" /></li>
					<li>促&nbsp;&nbsp;销&nbsp;&nbsp;价： <span class="txt1">￥<s:property
								value="goods.goodsPrice" /> </span></li>
					<li>类型：<span class="txt3"><s:property
								value="goods.goodsType" /> </span></li>
					<li>销量：<span class="txt3"><s:property
								value="goods.goodsSaleNum" />件</span></li>
					<li>剩余：<span class="txt3"><s:property
								value="goods.goodsNum" />件</span></li>
					<li>用户评论：<span>0&nbsp;条</span></li>
					<li>用户收藏：<span>0&nbsp;位</span></li>
					<li>数量：<s:textfield name="snum" size="4" value="1" />件</li>
					<li class="txt9"><input type="button" class="btn1"
						onclick="this.form.submit();" /> <!-- <li class="txt9"><input class="btn2" type="submit" value="" /> -->
					</li>
				</ul>
			</s:form>
		</div>
		<div class="box6">
			<div class="con_left">
				<div class="con_top">热门推荐</div>
				<div class="box_con">
					<s:iterator value="salelist" status="status">
						<ul class="con_ul">
							<li><a href="" title=""><img
									src="upload/<s:property value="goodsPic" />" alt="产品图片" /> </a></li>
							<li class="left_name"><a href="#" title=""><s:property
										value="goodsName" /> </a></li>
							<li class="left_price">单价：<span>￥<s:property
										value="goodsPic" /> </span></li>
						</ul>
					</s:iterator>
				</div>
			</div>
			<div class="con_right">
				<ul class="tabs">
					<li id="tb_1" class="hot" onmouseover="HoverLi(1,3,'tb_','in_')"><b></b><a
						class="hot1" href="#">商品详情</a><span></span></li>
					<li id="tb_2" class="normaltab"
						onmouseover="HoverLi(2,3,'tb_','in_')"><b></b><a class="hot2"
						href="#">用户评价</a><span></span></li>
					<li id="tb_3" class="normaltab"
						onmouseover="HoverLi(3,3,'tb_','in_')"><b></b><a class="hot3"
						href="#">商品销售记录</a><span></span>
					</li>
				</ul>
				<div class="box_con1">
					<div class="nohide" id="in_1">
						<%-- <div>
                        <p class="title">神奇变色杯，浪漫一"辈"子！</p>
                        <p> 通过国际食品安全资格认证</p>
                        <p> 特级出口品，严格筛选，100个杯子，只有30-40个能达到出口标准！</p>
                        <p>即"FDA"无毒测试），确保安全健康</p>
                        <p>品牌承诺：质量问题免费退换，购物更放心！</p>
                        <p>中国美院设计师原创设计，进口设备与耗材，完美品质非一般小作坊可比！</p>
                        <li><img src="images/product_pic4.jpg" alt="图片" /></li>
                        <p><span class="title">好消息：</span>变色杯升级至磨砂效果，遮盖效果更佳，升级不加价！</p>
                        <li><img src="images/product_pic5.jpg" alt="图片" /></li>
                    </div> --%>
						<s:property value="goods.goodsDescribe" />
						哈哈哈哈啊哈哈哈啊哈哈哈啊哈哈哈哈啊哈哈哈啊哈哈哈
					</div>
					<div class="hide" id="in_2">
						<div class="box_con2">
							<div class="com_con">
								<div class="title_user">
									<a href="#" title="">alleny *** 说：</a>
								</div>
								<div class="com_con1">
									<div class="com_txt">蛮不错，就是黑的时候图案有点明显，还有手柄那没图片，总体来说还不错，给个好评吧</div>
									<div class="com_time">2010/8/24/ 21:51</div>
								</div>
							</div>

						</div>
						<div class="box_con3">
							<div class="page2">
								<a class="prev" href="#">首页</a><a class="prev" href="#">上一页</a><a
									class="next" href="#">下一页</a><a class="prev" href="#">尾页</a>
							</div>
						</div>
					</div>
					<div class="hide" id="in_3">
						<table>
							<tr>
								<th width="10%">买家</th>
								<th width="60%">宝贝名称</th>
								<th width="10%">购买数量</th>
								<th width="20%">成交时间</th>
							</tr>
							<tr>
								<td align="center"><strong>kjioupp</strong></td>
								<td>[1001－2000个买家信用积分，请点击查看详情] /O2 氧气生活/ 田园风格天然草编布艺收纳筐
									大小2个入套装</td>
								<td align="center">1</td>
								<td align="center">2010-09-13 22:36:07</td>
							</tr>
						</table>
						<div class="box_con3">
							<div class="page2">
								<a class="prev" href="#">首页</a><a class="prev" href="#">上一页</a><a
									class="next" href="#">下一页</a><a class="prev" href="#">尾页</a>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
