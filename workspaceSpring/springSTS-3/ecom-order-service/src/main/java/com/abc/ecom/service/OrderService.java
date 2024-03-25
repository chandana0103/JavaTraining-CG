package com.abc.ecom.service;

import com.abc.ecom.entity.OrderEntity;

public interface OrderService {
	
	//public Order addOrder(Order order);
	
	public OrderEntity saveOrder(OrderEntity order);
	
	public  OrderEntity getOrderDetails(int orderId);

}
