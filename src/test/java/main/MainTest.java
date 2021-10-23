package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	@Test
	public void testSomar() {
		int resultado = Main.somar(1, 1);
		assertEquals(2, resultado);
	}

	@Test
	public void testSubtrair() {
		int resultado = Main.subtrair(1, 1);
		assertEquals(0, resultado);
	}

	@Test
	public void testMultiplicar() {
		int resultado = Main.multiplicar(1, 1);
		assertEquals(1, resultado);
	}

	@Test
	public void testDividir() {
		int resultado = Main.dividir(1, 1);
		assertEquals(1, resultado);
	}

}
