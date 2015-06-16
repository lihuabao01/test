package com.sale.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sale.model.Adminer;
import com.sale.model.Custom;
import com.sale.model.Seller;
import com.sale.service.UserService;

public class UserAction extends ActionSupport {
	@Resource
	UserService userService;
	private Custom custom;
	private Seller seller;
	private Adminer admin;
	private String OldPassword;
	private String NewPassword;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public String findCustomInfo() {
		ActionContext ac = ActionContext.getContext();
		custom = userService.getCustomById((String) ac.getSession().get("Id"));
		return "custominfo";
	}

	public String findSellerInfo() {
		ActionContext ac = ActionContext.getContext();
		seller = userService.getSellerById((String) ac.getSession().get("Id"));
		return "sellerinfo";
	}

	public String findAdminInfo() {
		ActionContext ac = ActionContext.getContext();
		admin = userService.getAdminerById((String) ac.getSession().get("Id"));
		return "admininfo";
	}

	public String updateCustomInfo() {
		userService.updateCustom(custom);
		return "updatecustom";
	}

	public String updateSellerInfo() {
		userService.updateSeller(seller);
		return "updateseller";
	}

	public String updateAdminInfo() {
		userService.updateAdmin(admin);
		return "updateadmin";
	}

	public String updateCustomPsd() {
		ActionContext ac = ActionContext.getContext();
		if (userService.checkCustomPsd((String) ac.getSession().get("Id"),
				OldPassword)) {
			custom = userService.getCustomById((String) ac.getSession().get(
					"Id"));
			custom.setCustomPassword(NewPassword);
			userService.updateCustom(custom);
			ac.getSession().remove("error");
		}else{
			ac.getSession().put("error", "旧密码错误！");
		}
		return "updatecustomPsd";
	}

	public String updateSellerPsd() {
		ActionContext ac = ActionContext.getContext();
		if (userService.checkSellerPsd((String) ac.getSession().get("Id"),
				OldPassword)) {
			seller = userService.getSellerById((String) ac.getSession().get(
					"Id"));
			seller.setSellerPassword(NewPassword);
			userService.updateSeller(seller);
			ac.getSession().remove("error");
		}else{
			ac.getSession().put("error", "旧密码错误！");
		}
		return "updatesellerPsd";
	}

	public String updateAdminPsd() {
		ActionContext ac = ActionContext.getContext();
		if (userService.checkAdminPsd((String) ac.getSession().get("Id"),
				OldPassword)) {
			admin = userService.getAdminerById((String) ac.getSession().get(
					"Id"));
			admin.setAdminerPassword(NewPassword);
			userService.updateAdmin(admin);
			ac.getSession().remove("error");
		}else{
			ac.getSession().put("error", "旧密码错误！");
		}
		return "updateadminPsd";
	}

	/**
	 * @return the custom
	 */
	public Custom getCustom() {
		return custom;
	}

	/**
	 * @param custom
	 *            the custom to set
	 */
	public void setCustom(Custom custom) {
		this.custom = custom;
	}

	/**
	 * @return the seller
	 */
	public Seller getSeller() {
		return seller;
	}

	/**
	 * @param seller
	 *            the seller to set
	 */
	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	/**
	 * @return the admin
	 */
	public Adminer getAdmin() {
		return admin;
	}

	/**
	 * @param admin
	 *            the admin to set
	 */
	public void setAdmin(Adminer admin) {
		this.admin = admin;
	}

	/**
	 * @return the oldPassword
	 */
	public String getOldPassword() {
		return OldPassword;
	}

	/**
	 * @param oldPassword
	 *            the oldPassword to set
	 */
	public void setOldPassword(String oldPassword) {
		OldPassword = oldPassword;
	}

	/**
	 * @return the newPassword
	 */
	public String getNewPassword() {
		return NewPassword;
	}

	/**
	 * @param newPassword
	 *            the newPassword to set
	 */
	public void setNewPassword(String newPassword) {
		NewPassword = newPassword;
	}
}
