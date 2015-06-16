package com.sale.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sale.model.Adminer;
import com.sale.model.Custom;
import com.sale.model.Seller;

public interface UserService {
	
	public abstract Custom getCustomById(String customId);
	
	public abstract Seller getSellerById(String sellerId);
	
	public abstract Adminer getAdminerById(String adminId);
	
	public abstract void updateCustom(Custom custom);

	public abstract void updateSeller(Seller seller);

	public abstract void updateAdmin(Adminer admin);
	
	public abstract boolean checkCustomPsd(String Id, String Password);

	public abstract boolean checkSellerPsd(String Id, String Password);

	public abstract boolean checkAdminPsd(String Id, String Password);
}
