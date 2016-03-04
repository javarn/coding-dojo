package dojo;

import org.junit.Test;

import static org.junit.Assert.*;

public class AvaliadorExpressoesInfixaTest {
	
	@Test
	public void testExpressaoNegativo() {
		String expressaoInfixa = "-5";
		assertEquals(-5, AvaliadorExpressaoInfixa.avaliarExpressaoInfixa(expressaoInfixa));
	}
	
	@Test
	public void testExpressaoZero() {
		String expressaoInfixa = "0";
		assertEquals(0, AvaliadorExpressaoInfixa.avaliarExpressaoInfixa(expressaoInfixa));
	}
	
	@Test
	public void testExpressaoUm() {
		String expressaoInfixa = "1";
		assertEquals(1, AvaliadorExpressaoInfixa.avaliarExpressaoInfixa(expressaoInfixa));
	}
	
	@Test
	public void testExpressaoSomaDoisOperandos() {
		String expressaoInfixa = "1 + 1";
		assertEquals(2, AvaliadorExpressaoInfixa.avaliarExpressaoInfixa(expressaoInfixa));
	}
	
	@Test
	public void testExpressaoSubtraiDoisOperandos() {
		String expressaoInfixa = "5 - 2";
		assertEquals(3, AvaliadorExpressaoInfixa.avaliarExpressaoInfixa(expressaoInfixa));
	}
	
	@Test
	public void testExpressaoMultiplicaDoisOperandos() {
		String expressaoInfixa = "5 * 2";
		assertEquals(10, AvaliadorExpressaoInfixa.avaliarExpressaoInfixa(expressaoInfixa));
	}
	
	@Test
	public void testExpressaoDivideDoisOperandos() {
		String expressaoInfixa = "24 / 2";
		assertEquals(12, AvaliadorExpressaoInfixa.avaliarExpressaoInfixa(expressaoInfixa));
	}
	
	@Test
	public void testExpressaoComNNumeros() {
		String expressaoInfixa = "3 + 3 + 19 - 2";
		assertEquals(23, AvaliadorExpressaoInfixa.avaliarExpressaoInfixa(expressaoInfixa));
	}
}
