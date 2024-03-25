
package com.abc.orderservice.model;

import com.abc.orderservice.entity.OrderEntity;

public class OrderDetails {
	
	private OrderEntity order;
	private ProductModel product;
	private CustomerModel customer;
	
	public OrderEntity getOrder() {
		return order;
	}
	public void setOrder(OrderEntity order) {
		this.order = order;
	}
	public ProductModel getProduct() {
		return product;
	}
	public void setProduct(ProductModel product) {
		this.product = product;
	}
	public CustomerModel getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}
	

}
