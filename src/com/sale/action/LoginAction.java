package com.sale.action;

import javax.annotation.Resource;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sale.model.Adminer;
import com.sale.model.Custom;
import com.sale.model.Seller;
import com.sale.service.LoginService;

public class LoginAction extends ActionSupport {
	@Resource
	LoginService loginService;
	private String Id;
	private String Password;
	private Custom custom;
	private Seller seller;
	private Adminer admin;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}

	public String sellerLogin() {
		if (loginService.checkSellerLogin(Id, Password)){
			seller=loginService.getSellerByIdPsd(Id, Password);
			ActionContext ac=ActionContext.getContext();
			ac.getSession().put("Id", seller.getSellerId());
			ac.getSession().put("Name", seller.getSellerName());
			ac.getSession().put("Type", "Seller");
			return "success";
		}
		else
			return "input";
	}

	public String customLogin() {
		if (loginService.checkCustomLogin(Id, Password)){
			custom=loginService.getCustomByIdPsd(Id, Password);
			ActionContext ac=ActionContext.getContext();
			ac.getSession().put("Id", custom.getCustomId());
			ac.getSession().put("Name", custom.getCustomName());
			ac.getSession().put("Type", "Custom");
			return "success";
		}
		else
			return "input";
	}

	public String adminLogin() {
		if (loginService.checkAdminLogin(Id, Password)){
			admin=loginService.getAdminByIdPsd(Id, Password);
			ActionContext ac=ActionContext.getContext();
			ac.getSession().put("Id", admin.getAdminerId());
			ac.getSession().put("Name", admin.getAdminerName());
			ac.getSession().put("Type", "Admin");
			return "success";
		}
		else
			return "input";
	}
	public String exit(){
		ActionContext ac=ActionContext.getContext();
		ac.getSession().remove("Id");
		ac.getSession().remove("Name");
		ac.getSession().remove("Type");
		return "success";
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
	 * @return the id
	 */
	public String getId() {
		return Id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		Id = id;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
}
