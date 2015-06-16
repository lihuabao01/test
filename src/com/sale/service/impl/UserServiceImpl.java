package com.sale.service.impl;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sale.dao.UserDao;
import com.sale.model.Adminer;
import com.sale.model.Custom;
import com.sale.model.Seller;
import com.sale.service.LoginService;
import com.sale.service.UserService;

@Transactional
public class UserServiceImpl implements UserService {
	@Resource
	UserDao userDao;

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Custom getCustomById(String customId) {
		return (Custom) userDao.findCustomById(customId);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Seller getSellerById(String sellerId) {
		return (Seller) userDao.findSellerById(sellerId);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Adminer getAdminerById(String sellerId) {
		return (Adminer) userDao.findAdminById(sellerId);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public void updateCustom(Custom custom) {
		userDao.updateCustom(custom);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public void updateSeller(Seller seller) {
		userDao.updateSeller(seller);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public void updateAdmin(Adminer admin) {
		userDao.updateAdmin(admin);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public boolean checkCustomPsd(String Id, String Password) {
		if (userDao.findCustomByIdPsd(Id, Password).isEmpty())
			return false;
		else
			return true;
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public boolean checkSellerPsd(String Id, String Password) {
		if (userDao.findSellerByIdPsd(Id, Password).isEmpty())
			return false;
		else
			return true;
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public boolean checkAdminPsd(String Id, String Password) {
		if (userDao.findAdminByIdPsd(Id, Password).isEmpty())
			return false;
		else
			return true;
	}
	
}
