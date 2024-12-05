package com.example.producer;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * Servlet initializer
 */
public class ServletInitializer extends SpringBootServletInitializer {

	/*
	 * Configure
	 * 
	 * @param application Application
	 * 
	 * @return Application builder
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProducerApplication.class);
	}

}
