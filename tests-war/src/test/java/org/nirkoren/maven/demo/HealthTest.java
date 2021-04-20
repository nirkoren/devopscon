package org.nirkoren.maven.demo;

import static org.junit.Assert.fail;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.nirkoren.maven.demo.TomcatPropsHandler;

public class HealthTest {

	private static String appurl;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		appurl = TomcatPropsHandler.getAppurl();
	}


	@Test
	public void testResponseCode() {
		URL url;
		try {
			System.out.println("Pinging URL: " + appurl);
			url = new URL(appurl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			int code = connection.getResponseCode();
			Assert.assertEquals(200, code);
		} catch (Exception e) {
			fail();
		}

	}

}
