package com.sale.model;

/**
 * OrderInfo entity. @author MyEclipse Persistence Tools
 */

public class OrderInfo implements java.io.Serializable {

	// Fields

	private Integer oinfoId;
	private Orders orders;
	private String oinfoName;
	private String oinfoPic;
	private String oinfoType;
	private Double oinfoPrice;
	private Double oinfoSub;
	private Integer oinfoNum;

	// Constructors

	/** default constructor */
	public OrderInfo() {
	}

	/** minimal constructor */
	public OrderInfo(Integer oinfoId, Orders orders, String oinfoName,
			String oinfoType, Double oinfoPrice, Integer oinfoNum) {
		this.oinfoId = oinfoId;
		this.orders = orders;
		this.oinfoName = oinfoName;
		this.oinfoType = oinfoType;
		this.oinfoPrice = oinfoPrice;
		this.oinfoNum = oinfoNum;
	}

	/** full constructor */
	public OrderInfo(Integer oinfoId, Orders orders, String oinfoName,
			String oinfoPic, String oinfoType, Double oinfoPrice,Double oinfoSub,
			Integer oinfoNum) {
		this.oinfoId = oinfoId;
		this.orders = orders;
		this.oinfoName = oinfoName;
		this.oinfoPic = oinfoPic;
		this.oinfoType = oinfoType;
		this.oinfoPrice = oinfoPrice;
		this.oinfoSub = oinfoSub;
		this.oinfoNum = oinfoNum;
	}

	// Property accessors

	public Integer getOinfoId() {
		return this.oinfoId;
	}

	public void setOinfoId(Integer oinfoId) {
		this.oinfoId = oinfoId;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public String getOinfoName() {
		return this.oinfoName;
	}

	public void setOinfoName(String oinfoName) {
		this.oinfoName = oinfoName;
	}

	public String getOinfoPic() {
		return this.oinfoPic;
	}

	public void setOinfoPic(String oinfoPic) {
		this.oinfoPic = oinfoPic;
	}

	public String getOinfoType() {
		return this.oinfoType;
	}

	public void setOinfoType(String oinfoType) {
		this.oinfoType = oinfoType;
	}

	public Double getOinfoPrice() {
		return this.oinfoPrice;
	}

	public void setOinfoPrice(Double oinfoPrice) {
		this.oinfoPrice = oinfoPrice;
	}

	public Integer getOinfoNum() {
		return this.oinfoNum;
	}

	public void setOinfoNum(Integer oinfoNum) {
		this.oinfoNum = oinfoNum;
	}

	/**
	 * @return the oinfoSub
	 */
	public Double getOinfoSub() {
		return oinfoSub;
	}

	/**
	 * @param oinfoSub the oinfoSub to set
	 */
	public void setOinfoSub(Double oinfoSub) {
		this.oinfoSub = oinfoSub;
	}

}