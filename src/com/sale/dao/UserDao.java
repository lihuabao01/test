package com.sale.dao;

import java.util.List;

import com.sale.model.Adminer;
import com.sale.model.Custom;
import com.sale.model.Seller;

public interface UserDao {
public abstract List findSellerByIdPsd(String Id,String Password);

public abstract List findCustomByIdPsd(String Id,String Password);

public abstract List findAdminByIdPsd(String Id,String Password);

public abstract Seller findSellerById(String Id);

public abstract Custom findCustomById(String Id);

public abstract Adminer findAdminById(String Id);

public abstract List checkSellerById(String Id);

public abstract List checkCustomById(String Id);

public abstract List checkAdminById(String Id);

public abstract List checkSellerByName(String Name);

public abstract List checkCustomByName(String Name);

public abstract List checkAdminByName(String Name);

public abstract void updateCustom(Custom custom);

public abstract void updateSeller(Seller seller);

public abstract void updateAdmin(Adminer admin);

public abstract void addCustom(Custom custom);

public abstract void addSeller(Seller seller);

public abstract void addAdmin(Adminer admin);


}
