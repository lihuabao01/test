package com.sale.dao.impl;

import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sale.dao.GoodsDao;
import com.sale.model.Goods;
import com.sale.model.Seller;

public class GoodsDaoImpl implements GoodsDao {
	@Resource
	SessionFactory sessionFactory;
	
	public  int findPageCountAll(int size){
		Session session = null;
		int countPage=0;
		long count=0;
		String hql = "select count(goodsId) from Goods";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			count =(Long)query.uniqueResult();
			countPage=(int)count;
			if(countPage%10==0)
				countPage=countPage/size;
			else
				countPage=countPage/size+1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		sessionFactory.close();
		return countPage;
	}
	
	public  int findPageCountBySeller(int size,String sellerId){
		Session session = null;
		int countPage=0;
		long count=0;
		String hql = "select count(goodsId) from Goods where seller.sellerId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, sellerId);	
			count =(Long)query.uniqueResult();
			countPage=(int)count;
			if(countPage%10==0)
				countPage=countPage/size;
			else
				countPage=countPage/size+1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		sessionFactory.close();
		return countPage;
	}
	
	public List findGoodsListAll(int pageNo,int pageSize) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Goods";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
            query.setFirstResult((pageNo-1)*pageSize);
            query.setMaxResults(pageSize);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public List findGoodsListAllByTime() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List findGoodsListTop4ByTime(){
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Goods order by goodsTime desc";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
            query.setMaxResults(4);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}
	
	public List findGoodsListTop4BySaleNum(){
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Goods order by goodsSaleNum desc";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
            query.setMaxResults(4);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public List findGoodsListBySeller(String Id,int pageNo,int pageSize) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Goods where seller.sellerId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);
            query.setFirstResult((pageNo-1)*pageSize);
            query.setMaxResults(pageSize);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public List findGoodsListBySellerType(int Id ,String Type) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addGoodsBySeller(Goods goods){
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(goods);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}
	
	public Goods findGoodsBygoodsId(Integer goodsId){
		Session session = null;
		Goods goods=new Goods();
		List list=null;
		String hql = "from Goods where goodsId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, goodsId);	
			list = query.list();
			goods=(Goods)list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return goods;
	}
	
	public void updateGoods(Goods goods){
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(goods);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}
	
	public void deleteGoodsBygoodsId(Goods goods){
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.delete(goods);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}
}
