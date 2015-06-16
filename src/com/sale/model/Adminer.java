package com.sale.model;

/**
 * Adminer entity. @author MyEclipse Persistence Tools
 */

public class Adminer implements java.io.Serializable {

	// Fields

	private String adminerId;
	private String adminerPassword;
	private String adminerName;
	private String adminerBorn;
	private String adminerPic;
	private String adminerSex;
	private String adminerQq;
	private String adminerPhone;
	private String adminerHometown;
	private String adminerLocation;
	private String adminerDescribe;

	// Constructors

	/** default constructor */
	public Adminer() {
	}

	/** minimal constructor */
	public Adminer(String adminerId, String adminerPassword, String adminerName) {
		this.adminerId = adminerId;
		this.adminerPassword = adminerPassword;
		this.adminerName = adminerName;
	}

	/** full constructor */
	public Adminer(String adminerId, String adminerPassword,
			String adminerName, String adminerBorn, String adminerPic,
			String adminerSex, String adminerQq, String adminerPhone,
			String adminerHometown, String adminerLocation,
			String adminerDescribe) {
		this.adminerId = adminerId;
		this.adminerPassword = adminerPassword;
		this.adminerName = adminerName;
		this.adminerBorn = adminerBorn;
		this.adminerPic = adminerPic;
		this.adminerSex = adminerSex;
		this.adminerQq = adminerQq;
		this.adminerPhone = adminerPhone;
		this.adminerHometown = adminerHometown;
		this.adminerLocation = adminerLocation;
		this.adminerDescribe = adminerDescribe;
	}

	// Property accessors

	public String getAdminerId() {
		return this.adminerId;
	}

	public void setAdminerId(String adminerId) {
		this.adminerId = adminerId;
	}

	public String getAdminerPassword() {
		return this.adminerPassword;
	}

	public void setAdminerPassword(String adminerPassword) {
		this.adminerPassword = adminerPassword;
	}

	public String getAdminerName() {
		return this.adminerName;
	}

	public void setAdminerName(String adminerName) {
		this.adminerName = adminerName;
	}

	public String getAdminerBorn() {
		return this.adminerBorn;
	}

	public void setAdminerBorn(String adminerBorn) {
		this.adminerBorn = adminerBorn;
	}

	public String getAdminerPic() {
		return this.adminerPic;
	}

	public void setAdminerPic(String adminerPic) {
		this.adminerPic = adminerPic;
	}

	public String getAdminerSex() {
		return this.adminerSex;
	}

	public void setAdminerSex(String adminerSex) {
		this.adminerSex = adminerSex;
	}

	public String getAdminerQq() {
		return this.adminerQq;
	}

	public void setAdminerQq(String adminerQq) {
		this.adminerQq = adminerQq;
	}

	public String getAdminerPhone() {
		return this.adminerPhone;
	}

	public void setAdminerPhone(String adminerPhone) {
		this.adminerPhone = adminerPhone;
	}

	public String getAdminerHometown() {
		return this.adminerHometown;
	}

	public void setAdminerHometown(String adminerHometown) {
		this.adminerHometown = adminerHometown;
	}

	public String getAdminerLocation() {
		return this.adminerLocation;
	}

	public void setAdminerLocation(String adminerLocation) {
		this.adminerLocation = adminerLocation;
	}

	public String getAdminerDescribe() {
		return this.adminerDescribe;
	}

	public void setAdminerDescribe(String adminerDescribe) {
		this.adminerDescribe = adminerDescribe;
	}

}