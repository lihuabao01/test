package com.sale.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Seller entity. @author MyEclipse Persistence Tools
 */

public class Seller implements java.io.Serializable {

	// Fields

	private String sellerId;
	private String sellerPassword;
	private String sellerName;
	private String sellerBorn;
	private String sellerPic;
	private String sellerSex;
	private String sellerQq;
	private String sellerPhone;
	private String sellerHometown;
	private String sellerLocation;
	private String sellerDescribe;
	private Set goodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Seller() {
	}

	/** minimal constructor */
	public Seller(String sellerId, String sellerPassword, String sellerName) {
		this.sellerId = sellerId;
		this.sellerPassword = sellerPassword;
		this.sellerName = sellerName;
	}

	/** full constructor */
	public Seller(String sellerId, String sellerPassword, String sellerName,
			String sellerBorn, String sellerPic, String sellerSex,
			String sellerQq, String sellerPhone, String sellerHometown,
			String sellerLocation, String sellerDescribe, Set goodses) {
		this.sellerId = sellerId;
		this.sellerPassword = sellerPassword;
		this.sellerName = sellerName;
		this.sellerBorn = sellerBorn;
		this.sellerPic = sellerPic;
		this.sellerSex = sellerSex;
		this.sellerQq = sellerQq;
		this.sellerPhone = sellerPhone;
		this.sellerHometown = sellerHometown;
		this.sellerLocation = sellerLocation;
		this.sellerDescribe = sellerDescribe;
		this.goodses = goodses;
	}

	// Property accessors

	public String getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerPassword() {
		return this.sellerPassword;
	}

	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}

	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerBorn() {
		return this.sellerBorn;
	}

	public void setSellerBorn(String sellerBorn) {
		this.sellerBorn = sellerBorn;
	}

	public String getSellerPic() {
		return this.sellerPic;
	}

	public void setSellerPic(String sellerPic) {
		this.sellerPic = sellerPic;
	}

	public String getSellerSex() {
		return this.sellerSex;
	}

	public void setSellerSex(String sellerSex) {
		this.sellerSex = sellerSex;
	}

	public String getSellerQq() {
		return this.sellerQq;
	}

	public void setSellerQq(String sellerQq) {
		this.sellerQq = sellerQq;
	}

	public String getSellerPhone() {
		return this.sellerPhone;
	}

	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public String getSellerHometown() {
		return this.sellerHometown;
	}

	public void setSellerHometown(String sellerHometown) {
		this.sellerHometown = sellerHometown;
	}

	public String getSellerLocation() {
		return this.sellerLocation;
	}

	public void setSellerLocation(String sellerLocation) {
		this.sellerLocation = sellerLocation;
	}

	public String getSellerDescribe() {
		return this.sellerDescribe;
	}

	public void setSellerDescribe(String sellerDescribe) {
		this.sellerDescribe = sellerDescribe;
	}

	public Set getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}

}