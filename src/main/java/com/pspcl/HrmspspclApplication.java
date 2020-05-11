package com.pspcl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class HrmspspclApplication extends SpringBootServletInitializer{
	private static final Logger LOGGER = LogManager.getLogger(HrmspspclApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(HrmspspclApplication.class, args);
//		 LOGGER.info("Info level log message");
//	     LOGGER.debug("Debug level log message");
//	     LOGGER.error("Error level log message");
//	     LOGGER.warn("Hey, This is a warning!");
//	     LOGGER.fatal("Damn! Fatal error. Please fix me.");
	}

}
