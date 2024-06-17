package org.nirkoren.maven.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HelloHandlerTest {

    @Test
    public void validateNameNotNull() {
        HelloHandler handler = new HelloHandler();
        String response = handler.sayHello();
        // Due to the code: This test will never fail :)
        assertNotNull(response);

        boolean checkHelllo = response.contains("Hello");
        Assert.assertTrue(checkHelllo);

    }

}
