package com.sale.dao;

import java.util.List;

import com.sale.model.Custom;
import com.sale.model.ShoppingCart;

public interface ShopCartDao {
	
	public abstract ShoppingCart findShopCartById(int sid);

	public abstract void insertShopCart(ShoppingCart scart);

	public abstract List findShopCartByCustomId(String customId);

	public abstract void updateShopCart(ShoppingCart scart);
	
	public abstract void deleteShopCartById(ShoppingCart scart);
	
	public abstract void deleteShopCartByCustomId(String customId);
}
