package dojo;

import org.junit.Assert;
import org.junit.Test;

public class LineCounterTest {
	
	
	LineCounter instance = new LineCounter();
	
	@Test
	public void testArquivoSemCodigoJava(){
		
		String conteudoArquivo = "\n\n\n\n //Teste\n";
		
		Integer numeroLinhas = instance.count( conteudoArquivo );
		
		Assert.assertEquals( 0 , numeroLinhas.intValue());
	}
	
	@Test
	public void testArquivoComDeclaracaoPackage(){
		
		String conteudoArquivo = "package dojo;\n\n\n\n //Teste\n";
		
		Integer numeroLinhas = instance.count( conteudoArquivo );
		
		Assert.assertEquals( 1, numeroLinhas.intValue());
	}
	
	@Test
	public void testArquivoComComentarioVariasLinhasEmUmaLinha(){
		
		String conteudoArquivo = "package dojo;\n" +
		"\n" +
		"import org.junit.Assert;\n" +
		"import org.junit.Test;\n" +
		"\n" +
		"/** Comentário JAva Comentário JAva linha dois */\n" +
		"public class LineCounterTest {}\n";
		
		Integer numeroLinhas = instance.count( conteudoArquivo );
		
		Assert.assertEquals( 4, numeroLinhas.intValue());
	}

	@Test
	public void testArquivoComComentarioVariasLinhasEmVariasLinhas(){
		
		String conteudoArquivo = "package dojo;\n" +
		"\n" +
		"import org.junit.Assert;\n" +
		"import org.junit.Test;\n" +
		"\n" +
		"/** Comentário JAva\n"
		+ " Comentário JAva linha dois */\n" +
		"public class LineCounterTest {}\n";
		
		Integer numeroLinhas = instance.count( conteudoArquivo );
		
		Assert.assertEquals( 4, numeroLinhas.intValue());
	}

	@Test
	public void devePassarNoCasoUmDaQuestao() {
		String codigo =
			"// This file contains 3 lines of code\n" +
			"public interface Dave {\n" +
			"/**\n" +
			"* count the number of lines in a file\n" +
			"*/\n" +
			"int countLines(File inFile); // not the real signature!\n" +
			"}\n" +
	        "\n";
			
			
		
		Integer numeroLinhas = instance.count( codigo );
		
		Assert.assertEquals( 3, numeroLinhas.intValue());
	}
	
	@Test
	public void devePassarNoCasoDoisDaQuestao() {
		String codigo = "/*****\n" +
				"* This is a test program with 5 lines of code\n" +
				"* \\/* no nesting allowed!\n" +
				"//*****//***/// Slightly pathological comment ending...\n" +
				"\n" +
				"public class Hello {\n" +
				"public static final void main(String [] args) { // gotta love Java\n" +
				"// Say hello\n" +
				"System./*wait*/out./*for*/println/*it*/(\"Hello/*\");\n" +
				"}\n" +
				"\n" +
				"}\n";
			
			
		
		Integer numeroLinhas = instance.count( codigo );
		
		Assert.assertEquals( 5, numeroLinhas.intValue());
	}
}
