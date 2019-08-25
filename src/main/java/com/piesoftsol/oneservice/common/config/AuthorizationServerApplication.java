package com.piesoftsol.oneservice.common.config;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import static com.piesoftsol.oneservice.common.util.AppConstants.APP_SERVICE_NAME;
import static com.piesoftsol.oneservice.common.util.AppConstants.APP_PID_FILE_WRITER_NAME;
import static com.piesoftsol.oneservice.common.util.AppConstants.APP_ALLOWED_SERVICE_PATHS;
import static com.piesoftsol.oneservice.common.integration.util.CommonConstants.ALLOWED_SERVICE_PATHS;
import static com.piesoftsol.oneservice.common.integration.util.CommonConstants.SERVICE_NAME;

import com.piesoftsol.oneservice.common.integration.annotations.EnableJdbc;
import com.piesoftsol.oneservice.common.integration.annotations.EnableOAuth2JdbcServer;
import com.piesoftsol.oneservice.common.integration.annotations.IgnoreRequestValidation;
import com.piesoftsol.oneservice.common.integration.annotations.OneServiceInjector;
import com.piesoftsol.oneservice.common.integration.config.OneServiceInit;

//@SpringBootApplication(scanBasePackages = "com.piesoftsol.oneservice.common.config")
@OneServiceInjector
@EnableJdbc
@EnableOAuth2JdbcServer
@IgnoreRequestValidation
public class AuthorizationServerApplication extends SpringBootServletInitializer {

	static {
		ALLOWED_SERVICE_PATHS = APP_ALLOWED_SERVICE_PATHS;
		SERVICE_NAME = APP_SERVICE_NAME;
	}
	
	/**
	 * Spring boot application start run
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			OneServiceInit.initializeObject(AuthorizationServerApplication.class, APP_PID_FILE_WRITER_NAME, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}