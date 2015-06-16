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
							<span>基本信息</span>
						</div>
						<s:form action="User!updateSellerInfo.action"
							method="post" name="theForm" id="theForm" theme="simple">
							<table width="98%" align="center">
								<tr>
									<td class="align_right">用户名：</td>
									<td class="align_left"><s:hidden
											name="seller.sellerPassword" />
										<s:property value="seller.sellerId" /></td>
								</tr>
								<tr>
									<td class="align_right">姓名：</td>
									<td class="align_left"><s:textfield
											name="seller.sellerName" />
									</td>
								</tr>
								<tr>
									<td class="align_right">性 别：</td>
									<td class="align_left"><s:radio name="seller.sellerSex"
											list="{'男','女'}" /></td>
								</tr>
								<tr>
									<td class="align_right">生日：</td>
									<td class="align_left"><s:textfield
											name="seller.sellerBorn" />
									</td>
								</tr>
								<tr>
									<td class="align_right">电话：</td>
									<td valign="middle" class="align_left"><s:textfield
											name="seller.sellerPhone" />
									</td>
								</tr>
								<tr>
									<td class="align_right">QQ：</td>
									<td class="align_left"><s:textfield name="seller.sellerQq" />
									</td>
								</tr>
								<tr>
									<td class="align_right">故乡：</td>
									<td class="align_left"><s:textfield
											name="seller.sellerHometown" size="40" />
									</td>
								</tr>
								<tr>
									<td class="align_right">所在地：</td>
									<td class="align_left"><s:textfield
											name="seller.sellerLocation" size="40" />
									</td>
								</tr>
								<tr>
									<td class="align_right">个人说明：</td>
									<td class="align_left"><s:textfield
											name="seller.sellerDescribe" size="80" />
									</td>
								</tr>
								<tr>
									<td colspan="2"><s:submit value="修改信息" /></td>
								</tr>
							</table>
						</s:form>
						<s:form id="formPassword" name="formPassword"
							action="User!updateSellerPsd.action" method="post"
							theme="simple">
							<table width="98%" align="center">
								<tr>
									<td width="67" class="align_right">原密码：</td>
									<td class="align_left"><s:password name="OldPassword" />
									</td>
								</tr>
								<tr>
									<td class="align_right">新密码：</td>
									<td class="align_left"><s:password name="NewPassword" />
									</td>
								</tr>
								<tr>
									<td class="align_right">确认密码：</td>
									<td class="align_left"><s:password name="ReNewPassword" />
									</td>
								</tr>
								<tr>
									<td colspan="2"><s:submit value="修改密码" /></td>
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
