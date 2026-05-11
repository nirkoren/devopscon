package org.nirkoren.maven.demo;

public class TomcatPropsHandler {

	private static String appurl = System.getProperty("appurl");

	public static String getAppurl() {
		return appurl;
	}


}