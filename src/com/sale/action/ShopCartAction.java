package com.sale.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sale.model.Custom;
import com.sale.model.Goods;
import com.sale.model.ScartInfo;
import com.sale.model.ShoppingCart;
import com.sale.service.ShopCartService;

public class ShopCartAction extends ActionSupport {
	@Resource
	ShopCartService shopCartService;
	private String refresh; 
	private Goods goods;
	private Custom custom;
	private ShoppingCart scart;
	private List sinfolist;
	private Double scartsub = 0.0;
	private List list;
	private int snum;
	private int sid;

	@Override
	public String execute() throws Exception {
		if(refresh.equals("updatecart"))
			return findShopCart();
		else if(refresh.equals("deletecart"))
			return findShopCart();
		else
			return null;
	}

	public String addShopCart() {
		ActionContext ac = ActionContext.getContext();
		ShoppingCart scart1 = new ShoppingCart();
		scart1.setShoppingNum(1);
		shopCartService.addShopCart(scart1,snum, goods.getGoodsId(), (String) ac
				.getSession().get("Id"));
		return "addShopCart";
	}
	
	public String addShopCartIndex() {
		ActionContext ac = ActionContext.getContext();
		ShoppingCart scart1 = new ShoppingCart();
		scart1.setShoppingNum(1);
		shopCartService.addShopCart(scart1,snum, goods.getGoodsId(), (String) ac
				.getSession().get("Id"));
		return "index";
	}
	
	public String addShopCartDetail() {
		ActionContext ac = ActionContext.getContext();
		ShoppingCart scart1 = new ShoppingCart();
		scart1.setShoppingNum(1);
		shopCartService.addShopCart(scart1,snum, goods.getGoodsId(), (String) ac
				.getSession().get("Id"));
		return "addShopCart";
	}

	public String findShopCart() {
		scartsub=0.0;
		ActionContext ac = ActionContext.getContext();
		sinfolist = shopCartService.getShopCartByCustomId((String) ac
				.getSession().get("Id"));
		for (int i = 0; i < sinfolist.size(); i++) {
			ScartInfo sinfo = (ScartInfo) sinfolist.get(i);
			scartsub += sinfo.getShoppingSub();
		}
		return "shopcart";
	}
	
	public String findShopCartToOrder() {
		scartsub=0.0;
		ActionContext ac = ActionContext.getContext();
		sinfolist = shopCartService.getShopCartByCustomId((String) ac
				.getSession().get("Id"));
		for (int i = 0; i < sinfolist.size(); i++) {
			ScartInfo sinfo = (ScartInfo) sinfolist.get(i);
			scartsub += sinfo.getShoppingSub();
		}
		ac.getSession().put("sinfolist", sinfolist);
		return "order";
	}

	public String updateShopCart(){
		shopCartService.updateShopCart(sid, snum);
		return "success";
	}
	
	public String deleteShopCart(){
		shopCartService.deleteShopCartById(sid);
		return "deleteShopCart";
	}
	
	public String deleteShopCartByCustom(){
		ActionContext ac=ActionContext.getContext();
		shopCartService.deleteShopCartByCustomId((String)ac.getSession().get("Id"));
		return "deleteShopCart";
	}

	/**
	 * @return the goods
	 */
	public Goods getGoods() {
		return goods;
	}

	/**
	 * @param goods
	 *            the goods to set
	 */
	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	/**
	 * @return the shoppingCart
	 */
	public ShoppingCart getShoppingCart() {
		return scart;
	}

	/**
	 * @param shoppingCart
	 *            the shoppingCart to set
	 */
	public void setShoppingCart(ShoppingCart scart) {
		this.scart = scart;
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
	 * @return the scart
	 */
	public ShoppingCart getScart() {
		return scart;
	}

	/**
	 * @param scart
	 *            the scart to set
	 */
	public void setScart(ShoppingCart scart) {
		this.scart = scart;
	}

	/**
	 * @return the sinfolist
	 */
	public List getSinfolist() {
		return sinfolist;
	}

	/**
	 * @param sinfolist
	 *            the sinfolist to set
	 */
	public void setSinfolist(List sinfolist) {
		this.sinfolist = sinfolist;
	}

	/**
	 * @return the scartsub
	 */
	public Double getScartsub() {
		return scartsub;
	}

	/**
	 * @param scartsub
	 *            the scartsub to set
	 */
	public void setScartsub(Double scartsub) {
		this.scartsub = scartsub;
	}

	/**
	 * @return the list
	 */
	public List getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List list) {
		this.list = list;
	}

	/**
	 * @return the snum
	 */
	public int getSnum() {
		return snum;
	}

	/**
	 * @param snum the snum to set
	 */
	public void setSnum(int snum) {
		this.snum = snum;
	}

	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}

	/**
	 * @return the refresh
	 */
	public String getRefresh() {
		return refresh;
	}

	/**
	 * @param refresh the refresh to set
	 */
	public void setRefresh(String refresh) {
		this.refresh = refresh;
	}
}
