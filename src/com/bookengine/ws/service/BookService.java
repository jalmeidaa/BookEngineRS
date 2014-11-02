package com.bookengine.ws.service;

import java.util.Set;

import javax.jws.WebService;

import com.bookengine.ws.service.representation.BookRepresentation;


@WebService
public interface BookService {

	public Set<BookRepresentation> getBooks();
	public BookRepresentation getBook(String bookId);

}
