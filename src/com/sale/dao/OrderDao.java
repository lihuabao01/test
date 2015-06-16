package com.sale.dao;

import java.util.List;

import com.sale.model.OrderInfo;
import com.sale.model.Orders;

public interface OrderDao {
	public abstract List findSellerIdByScart(String customId);
	
	public abstract void addOrder(Orders order);
	
	public abstract void addOrderInfo(OrderInfo oinfo);
	
	public abstract void deleteOrder(Orders order);
	
	public abstract void deleteOinfoByOrderId(int orderId);	
	
	public abstract List findOrderListByCustomId(String customId);
	
	public abstract List findOrderListBySellerId(String sellerId);

	public abstract List findOrderInfoByOrderId(int OrderId);
	
	public abstract Orders findOrdersById(int OrderId);
}
