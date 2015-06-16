package com.sale.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sale.dao.GoodsDao;
import com.sale.model.Goods;
import com.sale.service.GoodsService;
@Transactional
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsDao goodsDao;
    
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public int getPageCountAll(int size) {
		return goodsDao.findPageCountAll(size);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public int getPageCountBySeller(int size, String sellerId) {
		return goodsDao.findPageCountBySeller(size, sellerId);
	};

    
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getGoodsListAll(int pageNo,int pageSize) {
		return goodsDao.findGoodsListAll(pageNo,pageSize);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getGoodsListAllByTime() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getGoodsListTop4ByTime(){
		return goodsDao.findGoodsListTop4ByTime();
	};
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getGoodsListTop4BySaleNum(){
		return goodsDao.findGoodsListTop4BySaleNum();
	};
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getGoodsListBySeller(String Id,int pageNo,int pageSize) {
		return goodsDao.findGoodsListBySeller(Id,pageNo, pageSize);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getGoodsListBySellerType(int Id, String Type) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)	
	public Goods getGoodsBygoodsId(Integer goodsId){
		return (Goods)goodsDao.findGoodsBygoodsId(goodsId);
	}
	
	public void addGoodsBySeller(Goods goods){
		goodsDao.addGoodsBySeller(goods);
	}
	
	public void updateGoods(Goods goods){
		goodsDao.updateGoods(goods);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)		
	public void deleteGoodsBygoodsId(Goods goods){
		goods=(Goods)goodsDao.findGoodsBygoodsId(goods.getGoodsId());
		goodsDao.deleteGoodsBygoodsId(goods);
	}
}
