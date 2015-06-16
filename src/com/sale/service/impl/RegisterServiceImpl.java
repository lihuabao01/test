package com.sale.service.impl;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sale.dao.UserDao;
import com.sale.model.Adminer;
import com.sale.model.Custom;
import com.sale.model.Seller;
import com.sale.service.RegisterService;

@Transactional
public class RegisterServiceImpl implements RegisterService {
	@Resource
	UserDao userDao;

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public boolean addCustom(Custom custom) {
		if (userDao.checkCustomById(custom.getCustomId()).isEmpty()
				|| userDao.checkCustomByName(custom.getCustomName()).isEmpty()) {
			userDao.addCustom(custom);
			return true;
		}
		return false;
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public boolean addSeller(Seller seller) {
		if (userDao.checkCustomById(seller.getSellerId()).isEmpty()
				|| userDao.checkCustomByName(seller.getSellerName()).isEmpty()) {
			userDao.addSeller(seller);
			return true;
		}
		return false;
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public boolean addAdmin(Adminer admin) {
		if (userDao.checkCustomById(admin.getAdminerId()).isEmpty()
				|| userDao.checkCustomByName(admin.getAdminerName()).isEmpty()) {
			userDao.addAdmin(admin);
			return true;
		}
		return false;
	}
}
