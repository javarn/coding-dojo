package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeradorMatrizEspiralTest {

	@Test
	public void deveGerarMatrizUnitaria() {
		GeradorMatrizEspiral gerador = new GeradorMatrizEspiral();
		assertEquals(new int [][]{{1,  2 ,3}},gerador.gerarMatrizEspiral(3,1));
		
	}
	
	@Test
	public void deveGerarMatriz2x2() {
		GeradorMatrizEspiral gerador = new GeradorMatrizEspiral();
		assertEquals(new int [][]{{1,  2},{4, 3}},gerador.gerarMatrizEspiral(2,2));
		
	}
	
	@Test
	public void testGerarMatrizEspiral34() {
		
		GeradorMatrizEspiral geradorME = new GeradorMatrizEspiral();
		assertEquals(new int [][]{
			{1,  2 ,3}, 
			{10,11,4},
			{9,12,5},
			{8,7,6}
			},geradorME.gerarMatrizEspiral(3,4));
		
	}

}
