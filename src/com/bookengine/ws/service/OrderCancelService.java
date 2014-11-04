package com.bookengine.ws.service;

import java.util.Set;

import javax.jws.WebService;

import com.bookengine.ws.service.representation.OrderCancelRepresentation;


@WebService
public interface OrderCancelService {

	public Set<OrderCancelRepresentation> getOrder();
	public OrderCancelRepresentation getOrder(String orderID);

}
