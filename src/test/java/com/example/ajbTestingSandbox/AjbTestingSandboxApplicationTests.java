package com.example.ajbTestingSandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AjbTestingSandboxApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testCheckInteger(){
		assertEquals(42, Integer.sum(19, 23));
	}
	@Test
	public void testDivide() {
    	assertThrows(ArithmeticException.class, () -> {
        Integer.divideUnsigned(42, 0);
    });
};

public class CalculatorJUnit5Test {
    @Tag("slow")
    @Test
    public void testAddMaxInteger() {
        assertEquals(2147483646, Integer.sum(2147183646, 300000));
    }
 
    @Tag("fast")
    @Test
    public void testDivide() {
        assertThrows(ArithmeticException.class, () -> {
            Integer.divideUnsigned(42, 0);
        });
    }
}
};