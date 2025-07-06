package com.trinay.app.librarymanagement2;

import com.trinay.app.librarymanagement2.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LibraryManagement2Application {


		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

			BookService bookService = (BookService) context.getBean("bookService");
			bookService.displayBook();
		}

}
