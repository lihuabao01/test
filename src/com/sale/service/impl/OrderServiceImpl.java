package com.sale.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.sale.dao.OrderDao;
import com.sale.model.OrderInfo;
import com.sale.model.Orders;
import com.sale.model.ScartInfo;
import com.sale.service.OrderService;

@Transactional
public class OrderServiceImpl implements OrderService {
	@Resource
	OrderDao orderDao;

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public void addOrder(List sinfolist, Orders orderA, String customId) {
		List sellerlist = orderDao.findSellerIdByScart(customId);
		for (int i = 0; i < sellerlist.size(); i++) {
			Orders order = new Orders();
			order.setOrderAddress(orderA.getOrderAddress());
			order.setOrderName(orderA.getOrderName());
			order.setOrderPhone(orderA.getOrderPhone());
			order.setCustomId(customId);
			order.setOrderTime(new java.sql.Timestamp(new java.util.Date()
					.getTime()));
			order.setSellerId((String) sellerlist.get(i));
			Double sub = 0.0;
			for (int m = 0; m < sinfolist.size(); m++) {
				ScartInfo sinfoA = new ScartInfo();
				sinfoA = (ScartInfo) sinfolist.get(m);
				if (order.getSellerId().equals(sinfoA.getSellerId())) {
					sub += sinfoA.getShoppingSub();
				}
			}
			order.setOrderSub(sub);
			orderDao.addOrder(order);
			for (int j = 0; j < sinfolist.size(); j++) {
				OrderInfo oinfo = new OrderInfo();
				ScartInfo sinfo = new ScartInfo();
				sinfo = (ScartInfo) sinfolist.get(j);
				if (order.getSellerId().equals(sinfo.getSellerId())) {
					oinfo.setOinfoName(sinfo.getGoodsName());
					oinfo.setOinfoNum(sinfo.getShoppingNum());
					oinfo.setOinfoPrice(sinfo.getGoodsPrice());
					oinfo.setOinfoSub(sinfo.getShoppingSub());
					oinfo.setOinfoType(sinfo.getGoodsType());
					oinfo.setOinfoPic(sinfo.getGoodsPic());
					oinfo.setOrders(order);
					orderDao.addOrderInfo(oinfo);
				}
			}
		}
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public void deleteOrder(int orderId){
		Orders order=new Orders();
		order=orderDao.findOrdersById(orderId);
		orderDao.deleteOinfoByOrderId(orderId);
		orderDao.deleteOrder(order);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getOrderListByCustomId(String customId) {
		return orderDao.findOrderListByCustomId(customId);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getOrderListBySellerId(String sellerId) {
		return orderDao.findOrderListBySellerId(sellerId);
		
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getOrderInfoByOrderId(int OrderId){
		return orderDao.findOrderInfoByOrderId(OrderId);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Orders getOrdersById(int OrderId){
		return orderDao.findOrdersById(OrderId);
	}

}
