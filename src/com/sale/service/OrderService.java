package com.sale.service;

import java.util.List;

import com.sale.model.Orders;

public interface OrderService {
	public abstract void addOrder(List sinfolist,Orders orderA,String customId);
	
	public abstract void deleteOrder(int orderId);
	
	public abstract List getOrderListByCustomId(String customId);
	
	public abstract List getOrderListBySellerId(String sellerId);
	
	public abstract List getOrderInfoByOrderId(int OrderId);
	
	public abstract Orders getOrdersById(int OrderId);
}
