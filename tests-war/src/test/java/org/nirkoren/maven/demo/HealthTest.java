package org.nirkoren.maven.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class HealthTest {

	private static String appurl;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		appurl = TomcatPropsHandler.getAppurl();
	}

	//Test Code response
	@Test
	public void testResponseCode() {
		URL url;
		try {
			System.out.println("Pinging URL: " + appurl);
			url = new URL(appurl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			int errCode = connection.getResponseCode();
			assertEquals(200, errCode);
		} catch (Exception e) {
			fail();
		}

	}

}
