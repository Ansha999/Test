package com.java.walmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.walmart.entity.Order;
import com.java.walmart.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@RequestMapping("/orders")
	public List<Order> getOrders() {
		return orderService.getAllOrders();
	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/orders/{id}")
	public void getOrdersByCustomerId(@PathVariable String id) {
		
	}
	@RequestMapping(method = RequestMethod.POST)
	public void addOrder(@RequestBody Order order) {
		
	}
}
