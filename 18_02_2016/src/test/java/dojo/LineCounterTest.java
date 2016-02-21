package dojo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.higorae.impl.LineCounter;

@RunWith(Parameterized.class)
public class LineCounterTest {

	LineCounter instance = new LineCounter();
	
	private int expected;
	
	@Parameters
	public static Collection<Object[]> data(){
		 return Arrays.asList(new Object[][] {
				 {0,
					 "\n\n\n\n //Teste\n" 
				 },
				 {1,
					 "package dojo;\n\n\n\n //Teste\n" 
				 },
				 {4,
					 "package dojo;\n" +
								"\n" +
								"import org.junit.Assert;\n" +
								"import org.junit.Test;\n" +
								"\n" +
								"/** Comentário JAva Comentário JAva linha dois */\n" +
								"public class LineCounterTest {}\n" 
				 },
				 {3,
					 "// This file contains 3 lines of code\n" +
								"public interface Dave {\n" +
								"/**\n" +
								"* count the number of lines in a file\n" +
								"*/\n" +
								"int countLines(File inFile); // not the real signature!\n" +
								"}\n" +
						        "\n"
				 },
				 {5,
					 "/*****\n" +
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
								"}\n" 
				 }
		 });
	}
	
	public LineCounterTest(int expected, String input) {
		this.expected = expected;
		instance.setText(input);
	}
	
	@Test
	public void test() {
		assertEquals( expected, instance.count());
	}
}
