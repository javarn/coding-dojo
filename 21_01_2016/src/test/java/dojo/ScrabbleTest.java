package dojo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ScrabbleTest {
	
	private String palavra;
	
	private int pesoEsperado;
	
	@Parameters(name = "Palavra {0} tem peso {1}")
	public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
        	{"cabbage", 14},
        	{"", 0},
        	{null, 0},
        	{"aDbFKJQ", 33},
        	{"AEIOULNRSTDGBCMPFHVWYKJXQZ",87}
        });		
	}
	
	public ScrabbleTest(String palavra, int peso){
		this.palavra = palavra;
		this.pesoEsperado = peso;
	}

	@Test
	public void testScrabble() {
		Assert.assertEquals( pesoEsperado, Scrabble.calculate( palavra ));
		
	}
	/*
	@Test
	public void testStringVazia() {
		Assert.assertEquals(0, Scrabble.calculate(""));
	}
	
	@Test
	public void testNull() {
		Assert.assertEquals(0, Scrabble.calculate(null));
	}
	
	@Test
	public void testUmaDeCadaValor() {
		Assert.assertEquals(33, Scrabble.calculate("aDbFKJQ"));
	}
	
	@Test
	public void testAlfabetoInteiro() {
		Assert.assertEquals(87, Scrabble.calculate("AEIOULNRSTDGBCMPFHVWYKJXQZ"));
	}	
*/	
}
