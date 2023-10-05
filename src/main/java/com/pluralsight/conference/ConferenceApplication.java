package com.pluralsight.conference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ConferenceApplication extends SpringBootServletInitializer {

	// Creates a Dispatcher Servlet to look for Controllers. application.properties interacts with the DispatcherServlet.

	public static void main(String[] args) {
		SpringApplication.run(ConferenceApplication.class, args);
	}

}
