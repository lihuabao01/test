package com.sale.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Custom entity. @author MyEclipse Persistence Tools
 */

public class Custom implements java.io.Serializable {

	// Fields

	private String customId;
	private String customPassword;
	private String customName;
	private String customBorn;
	private String customPic;
	private String customSex;
	private String customQq;
	private String customPhone;
	private String customHometown;
	private String customLocation;
	private String customDescribe;
	private Set shoppingCarts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Custom() {
	}

	/** minimal constructor */
	public Custom(String customId, String customPassword, String customName) {
		this.customId = customId;
		this.customPassword = customPassword;
		this.customName = customName;
	}

	/** full constructor */
	public Custom(String customId, String customPassword, String customName,
			String customBorn, String customPic, String customSex,
			String customQq, String customPhone, String customHometown,
			String customLocation, String customDescribe, Set shoppingCarts) {
		this.customId = customId;
		this.customPassword = customPassword;
		this.customName = customName;
		this.customBorn = customBorn;
		this.customPic = customPic;
		this.customSex = customSex;
		this.customQq = customQq;
		this.customPhone = customPhone;
		this.customHometown = customHometown;
		this.customLocation = customLocation;
		this.customDescribe = customDescribe;
		this.shoppingCarts = shoppingCarts;
	}

	// Property accessors

	public String getCustomId() {
		return this.customId;
	}

	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public String getCustomPassword() {
		return this.customPassword;
	}

	public void setCustomPassword(String customPassword) {
		this.customPassword = customPassword;
	}

	public String getCustomName() {
		return this.customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public String getCustomBorn() {
		return this.customBorn;
	}

	public void setCustomBorn(String customBorn) {
		this.customBorn = customBorn;
	}

	public String getCustomPic() {
		return this.customPic;
	}

	public void setCustomPic(String customPic) {
		this.customPic = customPic;
	}

	public String getCustomSex() {
		return this.customSex;
	}

	public void setCustomSex(String customSex) {
		this.customSex = customSex;
	}

	public String getCustomQq() {
		return this.customQq;
	}

	public void setCustomQq(String customQq) {
		this.customQq = customQq;
	}

	public String getCustomPhone() {
		return this.customPhone;
	}

	public void setCustomPhone(String customPhone) {
		this.customPhone = customPhone;
	}

	public String getCustomHometown() {
		return this.customHometown;
	}

	public void setCustomHometown(String customHometown) {
		this.customHometown = customHometown;
	}

	public String getCustomLocation() {
		return this.customLocation;
	}

	public void setCustomLocation(String customLocation) {
		this.customLocation = customLocation;
	}

	public String getCustomDescribe() {
		return this.customDescribe;
	}

	public void setCustomDescribe(String customDescribe) {
		this.customDescribe = customDescribe;
	}

	public Set getShoppingCarts() {
		return this.shoppingCarts;
	}

	public void setShoppingCarts(Set shoppingCarts) {
		this.shoppingCarts = shoppingCarts;
	}

}