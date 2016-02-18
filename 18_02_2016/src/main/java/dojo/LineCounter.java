package dojo;


public class LineCounter {
 
	/**
	 * Remover comentários /* e *\/
	 */
	static String regex = "/\\*(.|\\n)*\\*/";
	
	public Integer count(String conteudoArquivo) {
		int numeroLinhas = 0;
		String conteudoArquivoSemComentarios = removeComentariosDeVariasLinhas(conteudoArquivo);
		
		String[] linhas = conteudoArquivoSemComentarios.split("\\n");
		for (String linha : linhas) {
			String linhaTrim = linha.trim();
			if(linhaTrim.isEmpty()){
				continue;
			}
			if (linha.trim().startsWith("//")){
				continue;
			}
			numeroLinhas++;
				
		}
		return numeroLinhas;
	}

	private String removeComentariosDeVariasLinhas(String conteudoArquivo) {
		return conteudoArquivo.replaceAll(regex, "");
	}
	
	
	
 

}
