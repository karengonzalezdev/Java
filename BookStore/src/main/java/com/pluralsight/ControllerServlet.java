package com.pluralsight;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Book> bookList = new ArrayList<Book>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        bookList.add(new Book("Lord of the files", "Leonard C.", 5.50f));
        bookList.add(new Book("1984", "Becca F.", 7.40f));
        bookList.add(new Book("Hush hush", "Robert J.", 6.30f));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo();
		if (action.equals("/new")) {
		addBook(request, response);
	} else {
		listBooks(request, response);
	}
	}

	private void listBooks(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("book_list", bookList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookList.jsp");
		dispatcher.forward(request, response);
		
	}

	private void addBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookForm.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo();
		if (action.equals("/insert")) {
		insertBook(request, response);
	}
	}

	private void insertBook(HttpServletRequest request, HttpServletResponse response) throws IOException {
	String title = request.getParameter("booktitle");
	String author = request.getParameter("bookauthor");
	String priceString = request.getParameter("bookprice");
	
	Book newBook = new Book(title, author, Float.parseFloat(priceString));
	bookList.add(newBook);
	
	response.sendRedirect("list");
		
	}
}
