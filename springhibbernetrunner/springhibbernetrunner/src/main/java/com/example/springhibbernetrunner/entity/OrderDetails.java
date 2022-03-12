package com.example.springhibbernetrunner.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "orderdetails")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class OrderDetails {

	@Id
	@Column(name = "orderid")
	private String orderId;
	@Column(name = "ordername")
	private String orderName;
	@Column(name = "productname")
	private String productName;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", orderName=" + orderName + ", productName=" + productName + "]";
	}

}
