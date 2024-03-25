package com.abc.ecom.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abc.ecom.entity.OrderEntity;
import com.abc.ecom.exception.OrderNotFoundException;
import com.abc.ecom.model.ProductModel;
import com.abc.ecom.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService  {


	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public OrderEntity saveOrder(OrderEntity order){
		
		order.setOrderDate(LocalDate.now());
		
		
		int productId = order.getProductId();
		
		String resourceUrl = "http://localhost:8081/ecom/product/get/" + productId;
		
		ProductModel product = restTemplate.getForObject(resourceUrl, ProductModel.class);
		
		double totalPrice = product.getProductPrice();
	    float orderPrice = (float) (order.getQuantity() * totalPrice);
		order.setOrderAmount(orderPrice);
		
		OrderEntity newOrder = orderRepository.save(order);
		return newOrder;
		
	}

	@Override
	public OrderEntity getOrderDetails(int orderId) {
		
		Optional<OrderEntity> optionalOrder = orderRepository.findById(orderId);
		if(optionalOrder.isEmpty()) {
			throw new OrderNotFoundException("Order not found with order id:" +orderId);
		}
		
		return optionalOrder.get();
	}
}
