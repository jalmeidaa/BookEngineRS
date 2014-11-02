package com.bookengine.ws.service;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.bookengine.ws.service.representation.BookRepresentation;
import com.bookengine.ws.service.workflow.BookActivity;

@Path("/bookservice/")
public class BookResource implements BookService {

	@GET
	@Produces({ "application/xml", "application/json" })
	@Path("/book")
	public Set<BookRepresentation> getBooks() {
		System.out
				.println("GET METHOD Request for all employees .............");
		BookActivity bookActivity = new BookActivity();
		return bookActivity.getBooks();
	}

	@GET
	@Produces({ "application/xml", "application/json" })
	@Path("/book/{bookId}")
	public BookRepresentation getBook(@PathParam("bookId") String bookId) {
		System.out
				.println("GET METHOD Request from Client with employeeRequest String ............."
						+ bookId);
		BookActivity bookActivity = new BookActivity();
		return bookActivity.getBook(bookId);
	}

}
