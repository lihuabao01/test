package com.sale.model;

/**
 * ShoppingCart entity. @author MyEclipse Persistence Tools
 */

public class ShoppingCart implements java.io.Serializable {

	// Fields

	private Integer shoppingCartId;
	private Custom custom;
	private Goods goods;
	private Integer shoppingNum;
	private Double shoppingSub;

	// Constructors

	/** default constructor */
	public ShoppingCart() {
	}

	/** minimal constructor */
	public ShoppingCart(Integer shoppingCartId, Custom custom, Goods goods,
			Integer shoppingNum) {
		this.shoppingCartId = shoppingCartId;
		this.custom = custom;
		this.goods = goods;
		this.shoppingNum = shoppingNum;
	}

	/** full constructor */
	public ShoppingCart(Integer shoppingCartId, Custom custom, Goods goods,
			Integer shoppingNum, Double shoppingSub) {
		this.shoppingCartId = shoppingCartId;
		this.custom = custom;
		this.goods = goods;
		this.shoppingNum = shoppingNum;
		this.shoppingSub = shoppingSub;
	}

	// Property accessors

	public Integer getShoppingCartId() {
		return this.shoppingCartId;
	}

	public void setShoppingCartId(Integer shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public Custom getCustom() {
		return this.custom;
	}

	public void setCustom(Custom custom) {
		this.custom = custom;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Integer getShoppingNum() {
		return this.shoppingNum;
	}

	public void setShoppingNum(Integer shoppingNum) {
		this.shoppingNum = shoppingNum;
	}

	public Double getShoppingSub() {
		return this.shoppingSub;
	}

	public void setShoppingSub(Double shoppingSub) {
		this.shoppingSub = shoppingSub;
	}

}