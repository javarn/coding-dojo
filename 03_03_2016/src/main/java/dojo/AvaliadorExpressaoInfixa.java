package dojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AvaliadorExpressaoInfixa {

	public static int avaliarExpressaoInfixa(String expressaoInfixa) {
		String expr = expressaoInfixa;
		
		expr = expr.replaceAll("\\(", "( ");
		expr = expr.replaceAll("\\)", " )");
		
		String[] itens = expr.split(" ");
		
		return calcularRecursivo(itens);
	}
	
	// Solução feita durante o dojo
	private static int calcular(String[] itens) {
		if (itens.length == 1) {
			return Integer.parseInt(itens[0]);
		} else {
			
			List<String> operandos = new ArrayList<String>();
			String operador = "+";
			int resultado = 0;
			for (String operadorOperando : itens) {

				if(!isOperador(operadorOperando)) {
					operandos.add(operadorOperando);
				} else {
					operador = operadorOperando;
				}
				
				if (operandos.size() == 2) {
					int operando1 = Integer.parseInt(operandos.get(0));
					int operando2 = Integer.parseInt(operandos.get(1));
					
					if (operador.charAt(0) == '+')
						resultado = soma(operando1, operando2);
					else if(operador.charAt(0) == '-')
						resultado = subtrai(operando1, operando2);
					else if(operador.charAt(0) == '*')
						resultado = operando1 * operando2;
					else if(operador.charAt(0) == '/')
						resultado = operando1 / operando2;
					
					operandos.clear();
					operandos.add(resultado+"");
				}
			}
			
			return resultado;
		}
	}
	
	// Solução recursiva
	private static int calcularRecursivo(String[] itens) {
		if (itens.length == 1){
			return Integer.parseInt(itens[0]);
		} else {
			int op1 = Integer.parseInt(itens[0]);
			char operador = itens[1].charAt(0);
			int op2 = calcularRecursivo(Arrays.copyOfRange(itens, 2, itens.length));
			
			if (operador == '+')
				return op1 + op2;
			if (operador == '-')
				return op1 - op2;
			if (operador == '*')
				return op1 * op2;
			if (operador == '/')
				return op1 / op2;
		}
		return 0;
	}

	private static int subtrai(int operando1, int operando2) {
		return operando1 - operando2;
	}

	private static int soma(int operando1, int operando2) {
		return operando1 + operando2;
	}
	
	private static boolean isOperador(String valor) {
		if (valor.equals("+") || valor.equals("-") || valor.equals("*") || valor.equals("/"))
			return true;
		return false;
	}
}



//  1 + 1 * 3 + 4

