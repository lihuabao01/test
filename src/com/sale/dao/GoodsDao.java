package com.sale.dao;

import java.util.List;

import com.sale.model.Goods;

public interface GoodsDao {
	
	public abstract int findPageCountAll(int size);
	
	public abstract int findPageCountBySeller(int size,String sellerId);
	
	public abstract List findGoodsListAll(int pageNo,int pageSize);
	
	public abstract List findGoodsListAllByTime();
	
	public abstract List findGoodsListTop4ByTime();
	
	public abstract List findGoodsListTop4BySaleNum();
	
	public abstract List findGoodsListBySeller(String Id,int pageNo,int pageSize);
	
	public abstract List findGoodsListBySellerType(int Id ,String Type);
	
	public abstract void addGoodsBySeller(Goods goods);
	
	public abstract Goods findGoodsBygoodsId(Integer goodsId);
	
	public abstract void updateGoods(Goods goods);
	
	public abstract void deleteGoodsBygoodsId(Goods goods);
}
