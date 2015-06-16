package com.sale.service;

import com.sale.model.Adminer;
import com.sale.model.Custom;
import com.sale.model.Seller;

public interface RegisterService {
	
	public abstract boolean addCustom(Custom custom);
	
	public abstract boolean addSeller(Seller seller);
	
	public abstract boolean addAdmin(Adminer admin);
	
	
}
