package com.sale.service;

import java.util.List;

import com.sale.model.Custom;
import com.sale.model.ShoppingCart;

public interface ShopCartService {

	public abstract void addShopCart(ShoppingCart scart,int snum,int goodsId,String customId);
	
	public abstract List getShopCartByCustomId(String customId);
	
	public abstract void updateShopCart(int sid ,int snum);
	
	public abstract void deleteShopCartById(int ScartId);
	
	public abstract void deleteShopCartByCustomId(String customId);
}
