package com.sale.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sale.dao.UserDao;
import com.sale.model.Adminer;
import com.sale.model.Custom;
import com.sale.model.Seller;

public class UserDaoImpl implements UserDao {
	@Resource
	private SessionFactory sessionFactory;
	
	public List findSellerByIdPsd(String Id, String Password) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Seller where sellerId=? and sellerPassword=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);
			query.setParameter(1, Password);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public List findCustomByIdPsd(String  Id, String Password) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Custom where customId=? and customPassword=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);
			query.setParameter(1, Password);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public List findAdminByIdPsd(String  Id, String Password) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Adminer where adminerId=? and adminerPassword=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);
			query.setParameter(1, Password);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public Seller findSellerById(String Id) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Seller where sellerId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);			
			list = query.list();
			seller=(Seller)list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return seller;
	}

	public Custom findCustomById(String  Id) {
		Session session = null;
		List list=null;
		Custom custom = new Custom();
		String hql = "from Custom where customId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);			
			list = query.list();
			custom=(Custom)list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return custom;
	}

	public Adminer findAdminById(String  Id) {
		Session session = null;
		List list=null;
		Adminer admin = new Adminer();
		String hql = "from Adminer where adminerId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);			
			list = query.list();
			admin=(Adminer)list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return admin;
	}
	
	public List checkSellerById(String Id) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Seller where sellerId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public List checkCustomById(String  Id) {
		Session session = null;
		List list=null;
		Custom custom = new Custom();
		String hql = "from Custom where customId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public List checkAdminById(String  Id) {
		Session session = null;
		List list=null;
		Adminer admin = new Adminer();
		String hql = "from Adminer where adminerId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}
	
	public List checkSellerByName(String Name){
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Seller where sellerName=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Name);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public List checkCustomByName(String Name){
		Session session = null;
		List list=null;
		Custom custom = new Custom();
		String hql = "from Custom where customName=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Name);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public List checkAdminByName(String Name){
		Session session = null;
		List list=null;
		Adminer admin = new Adminer();
		String hql = "from Adminer where adminerName=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Name);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}
	
	public void updateCustom(Custom custom){
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(custom);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}

	public void updateSeller(Seller seller){
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(seller);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}

	public void updateAdmin(Adminer admin){
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(admin);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}
	
	public void addCustom(Custom custom){
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(custom);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}

	public void addSeller(Seller seller){
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(seller);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}

	public void addAdmin(Adminer admin){
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(admin);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}
}
