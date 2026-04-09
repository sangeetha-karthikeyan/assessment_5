package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testEcho() {
        App app = new App();
        String result = app.echo("Hello World");
        assertEquals("Echo: Hello World", result);
    }
}
