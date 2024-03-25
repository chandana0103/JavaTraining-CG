package com.abc.ecom1.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.abc.ecom1.entity.Order;
import com.abc.ecom1.entity.Product;
import com.abc.ecom1.repository.OrderRepository;
import com.abc.ecom1.repository.ProductRepository;

public class OrderServiceTest {
	@InjectMocks
	OrderService orderService=new OrderServiceImpl();
	
	@Mock
	OrderRepository orderRepository;

	@Mock
	private ProductRepository productRepository;
	
	@Test
	public void testSaveOrder() {
			
		Product product=new Product();
		
		product.setProductName("dummyname");
		product.setProductId(1);
		product.setProductPrice(1000);
		product.setTime(LocalDate.of(2022,02,01));
		product.setProductCategory("dummy");
		
		Optional<Product> optionalProduct=Optional.of(product);
		when(productRepository.findById(1)).thenReturn(optionalProduct);
		
		Order order=new Order();
		order.setOrderId(10001);
		order.getOrderAmount();
		order.setOrderDate(LocalDate.of(2022,10,22));
		order.setProductId(product.getProductId());
		order.setCustomerId(101);
		order.setQuantity(2);
		
		double total=order.getQuantity()*product.getProductPrice();
		
		when(orderRepository.save(order)).thenReturn(order);
		Order newOrder=orderService.saveOrder(order);
		assertEquals(2000,newOrder.getOrderAmount());
	//	verify(orderRepository,times(1)).save(order);
		
	}
}
	/*@Test
	public void testgetOrderDetails() {
		Order order=new Order();
		order.setOrderId(102);
		order.getOrderAmount();
		order.setOrderDate(LocalDate.of(2020,10,22));
		order.setProductId(301);
		order.setCustomerId(301);
		order.setQuantity(3);
		
		int orderId=102;
		Optional<Order> option=Optional.of(order);
		
		when(orderRepository.findById(102)).thenReturn(option);
		
		Order existing=orderService.getOrderDetails(orderId);
		
		assertEquals(order.getOrderAmount(),existing.getOrderAmount());
		assertEquals(order.getOrderId(),existing.getOrderId());
		
		
	}
	
}*/

