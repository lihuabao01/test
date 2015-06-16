package com.sale.service;

import java.util.List;

import com.sale.model.Goods;

public interface GoodsService {
	
	public abstract int  getPageCountAll(int size);
	
	public abstract int  getPageCountBySeller(int size,String sellerId);
	
	public abstract List getGoodsListAll(int pageNo,int pageSize);
	
	public abstract List getGoodsListAllByTime();
	
	public abstract List getGoodsListTop4ByTime();
	
	public abstract List getGoodsListTop4BySaleNum();
	
	public abstract List getGoodsListBySeller(String Id,int pageNo,int pageSize);
	
	public abstract List getGoodsListBySellerType(int Id ,String Type);

	public abstract void addGoodsBySeller(Goods goods);
	
	public abstract Goods getGoodsBygoodsId(Integer goodsId);

	public abstract void updateGoods(Goods goods);
	
	public abstract void deleteGoodsBygoodsId(Goods goods);
}
