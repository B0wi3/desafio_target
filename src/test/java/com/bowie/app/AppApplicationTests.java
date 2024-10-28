package com.bowie.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppApplicationTests {

	// Testes para FibonacciChecker
	@Test
	public void testIsFibonacci_TrueCases() {
		assertTrue(FibonacciChecker.isFibonacci(0));
		assertTrue(FibonacciChecker.isFibonacci(1));
		assertTrue(FibonacciChecker.isFibonacci(5));
		assertTrue(FibonacciChecker.isFibonacci(13));
		assertTrue(FibonacciChecker.isFibonacci(21));
	}

	@Test
	public void testIsFibonacci_FalseCases() {
		assertFalse(FibonacciChecker.isFibonacci(4));
		assertFalse(FibonacciChecker.isFibonacci(6));
		assertFalse(FibonacciChecker.isFibonacci(10));
		assertFalse(FibonacciChecker.isFibonacci(100));
	}

	// Testes para StringAnalyzer
	@Test
	public void testContarLetraA() {
		assertEquals(3, ContaLetraA.contarLetras("Banana"));
		assertEquals(0, ContaLetraA.contarLetras("Hello"));
		assertEquals(1, ContaLetraA.contarLetras("Apple"));
		assertNotEquals(2, ContaLetraA.contarLetras("Amanda"));
		assertEquals(0, ContaLetraA.contarLetras("BCDEFGH"));
	}
}
