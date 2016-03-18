package dojo.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApertarInterruptores {

	public static List<String> percorreCorredor(int N) {
		if (N == 0)
			return Collections.emptyList();
		
		List<Boolean> estadosLampadas = new ArrayList<>();
		for (int i = 0; i < N; i++) 
			estadosLampadas.add(false);
		
		for (int caminhadaIndex = 0; caminhadaIndex < N; caminhadaIndex++) { 
			for (int lampadaIndex = 0; lampadaIndex < estadosLampadas.size(); lampadaIndex++){
				if ((lampadaIndex+1)%(caminhadaIndex+1) == 0)
					estadosLampadas.set(lampadaIndex, !estadosLampadas.get(lampadaIndex));
			}			
		}
		
		List<String> estadosLampadasOnOff =  new ArrayList<>();
		for (Boolean estradoLampada : estadosLampadas)
			estadosLampadasOnOff.add(estradoLampada ? "on" : "off");
		return estadosLampadasOnOff;
	}

	private static List<String> converterEstadosLampadaParaOnOff(boolean [] estadosLampadas) {
		List<String> estadosLampadasOnOff =  new ArrayList<>();
		for (Boolean estradoLampada : estadosLampadas)
			estadosLampadasOnOff.add(estradoLampada ? "on" : "off");
		return estadosLampadasOnOff;
	}
	
	public static List<String> percorrerCorredor(int totalLampadas) {
		boolean [] estadosLampadas = new boolean[totalLampadas];
		
		for (int caminhadaIndex = 0; caminhadaIndex < totalLampadas; caminhadaIndex++) { 
			for (int lampadaIndex = 0; lampadaIndex < estadosLampadas.length; lampadaIndex++){
				if ((lampadaIndex+1)%(caminhadaIndex+1) == 0)
					estadosLampadas[lampadaIndex] = !estadosLampadas[lampadaIndex];
			}			
		}
		
		return converterEstadosLampadaParaOnOff(estadosLampadas);
	}
}
