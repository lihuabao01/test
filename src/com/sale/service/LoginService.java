package com.sale.service;

import javax.annotation.Resource;

import com.sale.dao.UserDao;
import com.sale.model.Adminer;
import com.sale.model.Custom;
import com.sale.model.Seller;

public interface LoginService {
public abstract Seller getSellerByIdPsd(String  Id ,String Password);

public abstract Custom getCustomByIdPsd(String  Id ,String Password);

public abstract Adminer getAdminByIdPsd(String  Id ,String Password);

public abstract Boolean checkSellerLogin(String  Id,String Password);

public abstract Boolean checkCustomLogin(String  Id,String Password);

public abstract Boolean checkAdminLogin(String  Id,String Password);
}
