package dojo.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dojo.java.ApertarInterruptores;

public class ApertarInterruptoresTest {
	
	@Test
	public void testaUmCorredorSemLampadas(){
		List<String> estados =  ApertarInterruptores.percorrerCorredor(0);
		
		assertEquals(0, estados.size());
	}
	
	@Test
	public void testaUmCorredorComUmaLampada(){
		List<String> estados =  ApertarInterruptores.percorrerCorredor(1);
		
		assertEquals(1, estados.size());
		assertEquals("[on]",estados.toString());
	}
	
	@Test
	public void testaUmCorredorCom3Lampadas(){
		List<String> estados =  ApertarInterruptores.percorrerCorredor(3);
		assertEquals("[on, off, off]",estados.toString());
	}
	

}
