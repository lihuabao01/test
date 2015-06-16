package com.sale.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.sale.model.Adminer;
import com.sale.model.Custom;
import com.sale.model.Seller;
import com.sale.service.RegisterService;

public class RegisterAction extends ActionSupport {
	
	@Resource
	RegisterService registerService;
	
	private String Id;
	private String Password;
	private String Name;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	public String addCustom(){
		Custom custom=new Custom();
		custom.setCustomId(Id);
		custom.setCustomPassword(Password);
		custom.setCustomName(Name);
		if(registerService.addCustom(custom))
		return "success";
		else
			return "input";
	}
	
	public String addSeller(){
		Seller seller=new Seller();
		seller.setSellerId(Id);
		seller.setSellerPassword(Password);
		seller.setSellerName(Name);
		if(registerService.addSeller(seller))
		return "success";
		else
			return "input";
	}
	
	public String addAdmin(){
		Adminer admin =new Adminer();
		admin.setAdminerId(Id);
		admin.setAdminerPassword(Password);
		admin.setAdminerName(Name);
		if(registerService.addAdmin(admin))
		return "success";
		else
			return "input";
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}

	/**
	 * @param id the id to set
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
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
}
