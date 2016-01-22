package dojo;

import java.util.Arrays;
import java.util.List;

public class Scrabble {

	// Abordagem sugerida por Bráulio mas não implementada no DOJO devido Tempo (Documentado pós DOJO)
	static List<Integer> PESOS = Arrays.asList(1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10);

	public static int calculate(String palavra) {
		if (palavra == null) {
			return 0;
		}
		return palavra.toUpperCase().chars().map(letra -> PESOS.get(letra - 'A')).sum();
	}
	
	
	
	/* ======= Versão 1 ===============
	
	static Map<String, Integer> tabelaPesos = new HashMap<>();
	
	static {
		tabelaPesos.put("AEIOULNRST",1); //10
		tabelaPesos.put("DG",2); //4              
		tabelaPesos.put("BCMP",3); //12
		tabelaPesos.put("FHVWY",4); //20
		tabelaPesos.put("K",5);  //5
		tabelaPesos.put("JX",8); //16
		tabelaPesos.put("QZ",10); //20
	}
	
	public static int calculate(String palavra) {
		
		int pesoPalavra = 0;
		
		if(palavra == null){
			return pesoPalavra;
		}
		
		char[] caracteres = palavra.toCharArray();
		for ( char c : caracteres ){
			for(String key : tabelaPesos.keySet()){
				if(key.contains((c+"").toUpperCase())){
					pesoPalavra += tabelaPesos.get(key);
				}
			}
		}
		return pesoPalavra;
	}
	 */
	
	
	/* ========== Refatoração Solução 1 (Final do DOJO)  ============
	  
    static Map<String, Integer> tabelaPesos = new LinkedHashMap<>();
	
	static {
		tabelaPesos.put("AEIOULNRST",1); //10
		tabelaPesos.put("DG",2); //4              
		tabelaPesos.put("BCMP",3); //12
		tabelaPesos.put("FHVWY",4); //20
		tabelaPesos.put("K",5);  //5
		tabelaPesos.put("JX",8); //16
		tabelaPesos.put("QZ",10); //20
	}

	
	 // Bug no java?
	public static int calculate(String palavra) {
		if (palavra == null || palavra.trim().isEmpty()) {
			return 0;
		}		
		return asList( palavra.split("") )
					.stream()
					.mapToInt(Scrabble::pegarPesoLetra)
					.sum();
	}
	
	private static int pegarPesoLetra(String letra){
		for(String key : tabelaPesos.keySet()){
			if(key.contains(letra.toUpperCase())){						
				return tabelaPesos.get(key);
			}
		}
		return 0;
	}
	*/
}



