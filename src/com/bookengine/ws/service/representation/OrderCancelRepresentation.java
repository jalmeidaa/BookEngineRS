package com.bookengine.ws.service.representation;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "OrderCancel")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")

public class OrderCancelRepresentation {
	
	private String OrderID;
	private String status;
	
	public OrderCancelRepresentation()
	{
	
	}

	public OrderCancelRepresentation(String orderID, String status)

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
