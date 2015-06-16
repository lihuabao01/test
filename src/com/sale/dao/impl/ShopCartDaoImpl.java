package com.sale.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.sale.dao.ShopCartDao;
import com.sale.model.Custom;
import com.sale.model.Goods;
import com.sale.model.ScartInfo;
import com.sale.model.Seller;
import com.sale.model.ShoppingCart;

public class ShopCartDaoImpl implements ShopCartDao {
	@Resource
	SessionFactory sessionFactory;

	public void insertShopCart(ShoppingCart scart) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(scart);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}
	
	public ShoppingCart findShopCartById(int sid){
		Session session = null;
		List list=null;
		ShoppingCart scart = new ShoppingCart();
		String hql = "from ShoppingCart where shoppingCartId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, sid);
			list = query.list();
			scart=(ShoppingCart)list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return scart;
	}

	public List findShopCartByCustomId(String customId) {
		Session session = null;
		List list=null;
		List<ScartInfo> sinfolist = new ArrayList<ScartInfo>();
		String hql = "select ct,gd,sc from ShoppingCart sc inner join sc.goods gd inner join sc.custom ct where ct.customId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, customId);	
			list = query.list();
			Iterator it=list.iterator();
			while(it.hasNext()){
				Object[] obj = (Object[]) it.next();
				Custom custom = (Custom)obj[0];
				Goods goods = (Goods)obj[1];
				ShoppingCart scart = (ShoppingCart)obj[2];
				ScartInfo sinfo=new ScartInfo();
				sinfo.setCustomId(custom.getCustomId());
				sinfo.setCustomName(custom.getCustomName());
				sinfo.setGoodsId(goods.getGoodsId());
				sinfo.setGoodsName(goods.getGoodsName());
				sinfo.setGoodsPic(goods.getGoodsPic());
				sinfo.setGoodsPrice(goods.getGoodsPrice());
				sinfo.setGoodsType(goods.getGoodsType());
				sinfo.setSellerId(goods.getSeller().getSellerId());
				sinfo.setShoppingCartId(scart.getShoppingCartId());
				sinfo.setShoppingNum(scart.getShoppingNum());
				sinfo.setShoppingSub(scart.getShoppingSub());
				sinfolist.add(sinfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sessionFactory.close();
		return sinfolist;
	}
	
	public void updateShopCart(ShoppingCart scart){
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(scart);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}
	
	public void deleteShopCartById(ShoppingCart scart){
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.delete(scart);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}
	
	public void deleteShopCartByCustomId(String customId){
		Session session = null;
		Transaction tx = null;
		String hql="delete from ShoppingCart where custom.customId=?";
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(hql);
		    query.setParameter(0, customId);   
		    query.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}
}
