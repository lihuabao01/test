package com.sale.action;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.Order;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sale.model.OrderInfo;
import com.sale.model.Orders;
import com.sale.model.ScartInfo;
import com.sale.model.ShoppingCart;
import com.sale.service.OrderService;

public class OrderAction extends ActionSupport {
	@Resource
	OrderService orderService;
	private Orders order;
	private List orderlist;
	private List oinfolist;
	private int orderId;
	private String refresh;

	@Override
	public String execute() throws Exception {
		if(refresh.equals("deleteorder"))
			return findOrderListBySeller();
		else
			return null;
	}

	public String addOrder() {
		ActionContext ac = ActionContext.getContext();
		List list = (List) ac.getSession().get("sinfolist");
		String customId = (String) ac.getSession().get("Id");
		orderService.addOrder(list, order, customId);
		return "addOrder";
	}
	
	public String deleteOrder(){
		orderService.deleteOrder(order.getOrderId());
		return "deleteOrder";
	}

	public String findOrderListBySeller() {
		ActionContext ac = ActionContext.getContext();
		orderlist = orderService.getOrderListBySellerId((String) ac
				.getSession().get("Id"));
		return "sellerorder";
	}

	public String findOrderListByCustom() {
		ActionContext ac = ActionContext.getContext();
		orderlist = orderService.getOrderListByCustomId((String) ac
				.getSession().get("Id"));
		return "customorder";
	}

	public String findOrderInfoBySellerOrder() {
		oinfolist = orderService.getOrderInfoByOrderId(orderId);
		order=orderService.getOrdersById(orderId);
		return "selleroinfo";
	}
	
	public String findOrderInfoByCustomOrder() {
		oinfolist = orderService.getOrderInfoByOrderId(orderId);
		order=orderService.getOrdersById(orderId);
		return "customoinfo";
	}

	/**
	 * @return the order
	 */
	public Orders getOrder() {
		return order;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(Orders order) {
		this.order = order;
	}

	/**
	 * @return the orderlist
	 */
	public List getOrderlist() {
		return orderlist;
	}

	/**
	 * @param orderlist
	 *            the orderlist to set
	 */
	public void setOrderlist(List orderlist) {
		this.orderlist = orderlist;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the oinfolist
	 */
	public List getOinfolist() {
		return oinfolist;
	}

	/**
	 * @param oinfolist
	 *            the oinfolist to set
	 */
	public void setOinfolist(List oinfolist) {
		this.oinfolist = oinfolist;
	}

	/**
	 * @return the refresh
	 */
	public String getRefresh() {
		return refresh;
	}

	/**
	 * @param refresh the refresh to set
	 */
	public void setRefresh(String refresh) {
		this.refresh = refresh;
	}
}
