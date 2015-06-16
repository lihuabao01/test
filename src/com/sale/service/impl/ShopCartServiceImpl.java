package com.sale.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sale.dao.GoodsDao;
import com.sale.dao.ShopCartDao;
import com.sale.dao.UserDao;
import com.sale.model.Custom;
import com.sale.model.Goods;
import com.sale.model.ShoppingCart;
import com.sale.service.ShopCartService;

@Transactional
public class ShopCartServiceImpl implements ShopCartService {
	@Resource
	ShopCartDao shopCartDao;
	@Resource
	GoodsDao goodsDao;

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public void addShopCart(ShoppingCart scart,int snum, int goodsId, String customId) {
		Custom custom = new Custom();
		custom.setCustomId(customId);
		Goods goods = new Goods();
		scart.setCustom(custom);
		goods = (Goods) goodsDao.findGoodsBygoodsId(goodsId);
		scart.setGoods(goods);
		scart.setShoppingNum(snum);
		scart.setShoppingSub(goods.getGoodsPrice() * scart.getShoppingNum());
		shopCartDao.insertShopCart(scart);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getShopCartByCustomId(String customId) {
		return shopCartDao.findShopCartByCustomId(customId);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public void updateShopCart(int sid, int snum) {
		ShoppingCart scart = new ShoppingCart();
		Goods goods = new Goods();
		scart = shopCartDao.findShopCartById(sid);
		goods = goodsDao.findGoodsBygoodsId(scart.getGoods().getGoodsId());
		if (snum <= 0) {
			snum = 1;
		} else if (snum > goods.getGoodsNum()) {
			snum = goods.getGoodsNum();
		}
		scart.setShoppingNum(snum);
		scart.setShoppingSub(scart.getShoppingNum() * goods.getGoodsPrice());
		shopCartDao.updateShopCart(scart);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public void deleteShopCartById(int ScartId) {
		ShoppingCart scart = new ShoppingCart();
		scart = shopCartDao.findShopCartById(ScartId);
		shopCartDao.deleteShopCartById(scart);
	}
	
	public void deleteShopCartByCustomId(String customId){
		shopCartDao.deleteShopCartByCustomId(customId);
	}
	
	
}
