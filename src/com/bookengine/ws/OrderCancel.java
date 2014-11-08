package com.bookengine.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class OrderCancel {

	private String OrderID;
	private String status;
	
	public OrderCancel()
	{
	
	}

	public OrderCancel(String orderID, String status)

	{
		this.OrderID = orderID;
		this.status = status;
	}
	
	public String getOrderID() {
		return OrderID;
	}

	public void setOrderID(String orderID) {
		OrderID = orderID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}