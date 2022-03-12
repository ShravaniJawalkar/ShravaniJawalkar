package com.example.demo.SpringCache.RequResp;

import java.io.Serializable;
import java.util.List;

public class OrderRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3416137574101482804L;
	
	private List<OrderDetailsRequest> orderRequests;

	public static class OrderDetailsRequest {

		private String orderID;

		private String orderName;

		private String productName;

		public String getOrderID() {
			return orderID;
		}

		public void setOrderID(String orderID) {
			this.orderID = orderID;
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
	}

	public List<OrderDetailsRequest> getOrderRequests() {
		return orderRequests;
	}

	public void setOrderRequests(List<OrderDetailsRequest> orderRequests) {
		this.orderRequests = orderRequests;
	}
}
