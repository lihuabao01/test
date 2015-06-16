package com.sale.service.impl;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sale.dao.UserDao;
import com.sale.model.Adminer;
import com.sale.model.Custom;
import com.sale.model.Seller;
import com.sale.service.LoginService;
@Transactional
public class LoginServiceImpl implements LoginService {
	@Resource
	UserDao userDao;
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Seller getSellerByIdPsd(String  Id, String Password) {
		return (Seller) userDao.findSellerByIdPsd(Id, Password).get(0);
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Custom getCustomByIdPsd(String  Id, String Password) {
		return (Custom) userDao.findCustomByIdPsd(Id, Password).get(0);
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Adminer getAdminByIdPsd(String  Id, String Password) {
		return (Adminer) userDao.findAdminByIdPsd(Id, Password).get(0);
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Boolean checkSellerLogin(String  Id, String Password) {
		if (userDao.findSellerByIdPsd(Id, Password).isEmpty())
			return false;
		else
			return true;
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Boolean checkCustomLogin(String  Id, String Password) {
		if (userDao.findCustomByIdPsd(Id, Password).isEmpty())
			return false;
		else
			return true;
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Boolean checkAdminLogin(String  Id, String Password) {
		if (userDao.findAdminByIdPsd(Id, Password).isEmpty())
			return false;
		else
			return true;
	}
}
