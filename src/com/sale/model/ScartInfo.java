package com.sale.model;

public class ScartInfo implements java.io.Serializable{
	private Integer shoppingCartId;
	private Integer goodsId;
	private String customId;
	private Integer shoppingNum;
	private Double shoppingSub;
    private String customName;
    private String goodsName;
    private String goodsPic;
    private Double goodsPrice;
    private String goodsType;
    private String sellerId;
	/**
	 * @return the shoppingCartId
	 */
	public Integer getShoppingCartId() {
		return shoppingCartId;
	}
	/**
	 * @param shoppingCartId the shoppingCartId to set
	 */
	public void setShoppingCartId(Integer shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}
	/**
	 * @return the goodsId
	 */
	public Integer getGoodsId() {
		return goodsId;
	}
	/**
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * @return the customId
	 */
	public String getCustomId() {
		return customId;
	}
	/**
	 * @param customId the customId to set
	 */
	public void setCustomId(String customId) {
		this.customId = customId;
	}
	/**
	 * @return the shoppingNum
	 */
	public Integer getShoppingNum() {
		return shoppingNum;
	}
	/**
	 * @param shoppingNum the shoppingNum to set
	 */
	public void setShoppingNum(Integer shoppingNum) {
		this.shoppingNum = shoppingNum;
	}
	/**
	 * @return the shoppingSub
	 */
	public Double getShoppingSub() {
		return shoppingSub;
	}
	/**
	 * @param shoppingSub the shoppingSub to set
	 */
	public void setShoppingSub(Double shoppingSub) {
		this.shoppingSub = shoppingSub;
	}
	/**
	 * @return the customName
	 */
	public String getCustomName() {
		return customName;
	}
	/**
	 * @param customName the customName to set
	 */
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	/**
	 * @return the goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * @param goodsName the goodsName to set
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * @return the goodsPic
	 */
	public String getGoodsPic() {
		return goodsPic;
	}
	/**
	 * @param goodsPic the goodsPic to set
	 */
	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}
	/**
	 * @return the goodsPrice
	 */
	public Double getGoodsPrice() {
		return goodsPrice;
	}
	/**
	 * @param goodsPrice the goodsPrice to set
	 */
	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	/**
	 * @return the goodsType
	 */
	public String getGoodsType() {
		return goodsType;
	}
	/**
	 * @param goodsType the goodsType to set
	 */
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	/**
	 * @return the sellerId
	 */
	public String getSellerId() {
		return sellerId;
	}
	/**
	 * @param sellerId the sellerId to set
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
}
