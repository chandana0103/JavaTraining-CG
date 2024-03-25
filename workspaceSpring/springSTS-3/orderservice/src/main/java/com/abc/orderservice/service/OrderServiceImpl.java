package com.abc.orderservice.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abc.orderservice.entity.OrderEntity;
import com.abc.orderservice.exception.OrderNotFoundException;
import com.abc.orderservice.model.CustomerModel;
import com.abc.orderservice.model.OrderDetails;
import com.abc.orderservice.model.ProductModel;
import com.abc.orderservice.repository.OrderRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class OrderServiceImpl implements OrderService  {


	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomerService customerService;
	
//	@Autowired
//	private RestTemplate restTemplate;
//	
//	@HystrixCommand(fallbackMethod="productServiceFallback")
	@Override
	public OrderEntity saveOrder(OrderEntity order) {
	
       order.setOrderDate(LocalDate.now());
		
		
		int productId = order.getProductId();
//		
//		String resourceUrl = "http://localhost:8081/ecom/product/get/" + productId;
//		
//		ProductModel product = restTemplate.getForObject(resourceUrl, ProductModel.class);
//		
		ProductModel product= productService.getProductDetails(productId);
		double totalPrice = product.getProductPrice();
	    float orderPrice = (float) (order.getQuantity() * totalPrice);
		order.setOrderAmount(orderPrice);
		OrderEntity newOrder = orderRepository.save(order);
		return newOrder;
	}
		
	@Override
	public OrderDetails getOrderDetails(int orderId) {
		
		Optional<OrderEntity> optionalOrder = orderRepository.findById(orderId);
		if(optionalOrder.isEmpty()) {
			throw new OrderNotFoundException("Order not found with order id:" +orderId);
		}
		
		OrderEntity order =optionalOrder.get();
		ProductModel product =productService.getProductDetails(order.getProductId());
		CustomerModel customer = customerService.getCustomerDetals(order.getCustomerId());
	
		OrderDetails orderDetails=new OrderDetails();
		orderDetails.setCustomer(customer);
		orderDetails.setProduct(product);
		orderDetails.setOrder(order);
		return orderDetails;
	}
//	@SuppressWarnings("unused")
//	private OrderEntity productServiceallBack(OrderEntity order) {
//		System.out.println("product server is down ! fall back route enabled..");
//		return null;
//		
//	}
	
}
