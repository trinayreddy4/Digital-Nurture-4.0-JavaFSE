package com.cognizant.springcoreloadcountryproject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreLoadCountryProjectApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringCoreLoadCountryProjectApplication.class);

	public static void main(String[] args) {
		LOGGER.debug("START Main");

		displayCountry();

		LOGGER.debug("END Main");
	}

	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = context.getBean("country", Country.class);

		LOGGER.debug("Country: {}", country.toString());
	}
}
