package com.sage.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAssert {

    @Test
    public void testBoolean() {
        String s1 = "Hello";
        assertTrue(s1.contains("l"));
    }

    @Test
    public void testNullable() { 
        String s1 = null;
        assertNull(s1);
    }

    @Test
    public void testEqual() {
        String s1 = "Hello";
        String s2 = "Hello";
        assertEquals(s1, s2);
    }
}
