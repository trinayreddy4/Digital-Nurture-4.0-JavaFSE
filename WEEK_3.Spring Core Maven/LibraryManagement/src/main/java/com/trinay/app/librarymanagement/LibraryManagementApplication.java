package com.trinay.app.librarymanagement;

import com.trinay.app.librarymanagement.service.BookService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LibraryManagementApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BookService bookService = (BookService) context.getBean("bookService");
		bookService.displayBook();
	}
}