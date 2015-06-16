package com.sale.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private Seller seller;
	private String goodsName;
	private String goodsPic;
	private Double goodsPrice;
	private Integer goodsNum;
	private Integer goodsSaleNum;
	private String goodsType;
	private String goodsDescribe;
	private Timestamp goodsTime;
	private Set shoppingCarts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** minimal constructor */
	public Goods(Integer goodsId, String goodsName, Double goodsPrice,
			Integer goodsNum) {
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsNum = goodsNum;
	}

	/** full constructor */
	public Goods(Integer goodsId, Seller seller, String goodsName,
			String goodsPic, Double goodsPrice, Integer goodsNum,
			Integer goodsSaleNum, String goodsType, String goodsDescribe,
			Timestamp goodsTime, Set shoppingCarts) {
		this.goodsId = goodsId;
		this.seller = seller;
		this.goodsName = goodsName;
		this.goodsPic = goodsPic;
		this.goodsPrice = goodsPrice;
		this.goodsNum = goodsNum;
		this.goodsSaleNum = goodsSaleNum;
		this.goodsType = goodsType;
		this.goodsDescribe = goodsDescribe;
		this.goodsTime =goodsTime;
		this.shoppingCarts = shoppingCarts;
	}

	// Property accessors

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsPic() {
		return this.goodsPic;
	}

	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}

	public Double getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public Integer getGoodsSaleNum() {
		return this.goodsSaleNum;
	}

	public void setGoodsSaleNum(Integer goodsSaleNum) {
		this.goodsSaleNum = goodsSaleNum;
	}

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getGoodsDescribe() {
		return this.goodsDescribe;
	}

	public void setGoodsDescribe(String goodsDescribe) {
		this.goodsDescribe = goodsDescribe;
	}

	public Set getShoppingCarts() {
		return this.shoppingCarts;
	}

	public void setShoppingCarts(Set shoppingCarts) {
		this.shoppingCarts = shoppingCarts;
	}

	public Timestamp getGoodsTime() {
		return goodsTime;
	}

	public void setGoodsTime(Timestamp goodsTime) {
		this.goodsTime = goodsTime;
	}

}