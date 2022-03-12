package com.example.demo.SpringCache.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.SpringCache.Entity.OrderDetails;
import com.example.demo.SpringCache.Repo.OrderRepository;
import com.example.demo.SpringCache.RequResp.OrderRequest.OrderDetailsRequest;

@Service
public class OrderImplementation {

	@Autowired
	OrderRepository orderRepository;

	public List<String> saveData(List<OrderDetailsRequest> entity) {

		List<OrderDetails> listRequest = convertToOrderEntity(entity);
		List<OrderDetails> l = orderRepository.saveAll(listRequest);
		List<String> orderId = new ArrayList<>();
		if (l.size() != 0 && l != null) {
			l.stream().forEach(e -> {
				String id = "";
				id = e.getOrderID();
				orderId.add(id);
			});
		}

		return orderId;
	}

	private List<OrderDetails> convertToOrderEntity(List<OrderDetailsRequest> entity) {
		List<OrderDetails> listRequest = new ArrayList<>();
		entity.forEach(en -> {
			OrderDetails order = new OrderDetails();
			order.setOrderID(en.getOrderID());
			order.setOrderName(en.getOrderName());
			order.setProductName(en.getProductName());
			listRequest.add(order);
		});

		return listRequest;
	}

	@CacheEvict(value = "ten-second-cache", key = "'OrderCache+#ID'", condition = "#isCache==null && !#isCache")
	@Cacheable(value = "ten-second-cache", key = "'OrderCache+#ID'", condition = "#isCache!=null && #isCache")
	public List<OrderDetailsRequest> findById(boolean isCache) throws InterruptedException {
		Thread.sleep(1000);
		List<OrderDetails> requestList = orderRepository.findAll();
		List<OrderDetailsRequest> orderReq = convertToOrderRequest(requestList);
		return orderReq;
	}

	private List<OrderDetailsRequest> convertToOrderRequest(List<OrderDetails> list) {
		List<OrderDetailsRequest> orderList = new ArrayList<>();
		list.forEach(eOrd -> {
			OrderDetailsRequest request = new OrderDetailsRequest();
			request.setOrderID(eOrd.getOrderID());
			request.setOrderName(eOrd.getOrderName());
			request.setProductName(eOrd.getProductName());
			orderList.add(request);
		});
		return orderList;
	}
}
