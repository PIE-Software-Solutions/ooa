package com.piesoftsol.oneservice.common.util;

public class AppConstants {
	
	public static final String APP_SERVICE_NAME = "oauth";
	
	public static final String APP_PID_FILE_WRITER_NAME = "oneservice" + APP_SERVICE_NAME + ".pid";
	
	// Application constants
	public static final String[] APP_ALLOWED_SERVICE_PATHS = new String[] { "/oauth/**","/tokens/**","/oauth/token/revokeById/**" };

}
