package com.bookengine.ws.service.workflow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.bookengine.ws.Book;
import com.bookengine.ws.OrderCancel;
import com.bookengine.ws.OrderCancelDAO;
import com.bookengine.ws.service.representation.BookRepresentation;
import com.bookengine.ws.service.representation.OrderCancelRepresentation;

public class OrderCancelActivity {	
	
	private static OrderCancelDAO dao = new OrderCancelDAO();	

	public OrderCancelRepresentation getOrder(String id) {

		OrderCancel ordercancel = dao.getOrder(id);
		
		OrderCancelRepresentation ocRep = new OrderCancelRepresentation();
		ocRep.setOrderID(ordercancel.getOrderID());		
		return ocRep;
	}
	
	public OrderCancelRepresentation getStatus(String id) {

		OrderCancel ordercancel = dao.cancelOrder(id);		
		OrderCancelRepresentation ocRep = new OrderCancelRepresentation();
		ocRep.setStatus(ordercancel.getStatus());	
		return ocRep;
	}

}
