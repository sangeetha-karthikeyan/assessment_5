package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testMax() {
        App math = new App();

        int result = math.max(10, 20);

        assertEquals(20, result, "Should return the larger of two numbers");
    }
}