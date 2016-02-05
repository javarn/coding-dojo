package dojo;

public class GeradorMatrizEspiral {	
	int linhaAtual = 0;
	int valorAtual = 1;
	int colunaAtual = 0;
	int [][] matriz;
	int colunas;
	int linhas;
	
	public int[][] gerarMatrizEspiral(int colunas, int linhas) {
		this.linhas = linhas;
		this.colunas = colunas;
		valorAtual = 1;
		matriz = new int [linhas][colunas];
		
		
		int valorMaximo = linhas * colunas;

		
		while(valorAtual <= valorMaximo) {
			
			montarLinhaEsquerdaDireita();
			montarColunaCimaBaixo();
			montarLinhaDireitaEsquerda();
//			montarColunaBaixoCima(valorAtual);
		}
		
		return matriz;
	}

	private void montarColunaBaixoCima(int valorAtual) {
		while (permiteIrDireita()) {
			 
			 matriz[linhaAtual][colunaAtual] = valorAtual;
			 valorAtual++;
			 colunaAtual++;
			}
	}

	private void montarLinhaDireitaEsquerda() {
		while (permiteIrEsquerda()) {
			 
			 matriz[linhaAtual][colunaAtual] = valorAtual;
			 valorAtual++;
			 colunaAtual--;
			}	
	}

	private boolean permiteIrEsquerda() {
		// TODO Auto-generated method stub
		return colunaAtual > 0 && isPosicaoVisitada();
	}

	private void montarColunaCimaBaixo() {
		while (permiteIrBaixo()) {
			 
			 matriz[linhaAtual][colunaAtual] = valorAtual;
			 valorAtual++;
			 linhaAtual++;
			}
	}

	private boolean permiteIrBaixo() {
		// TODO Auto-generated method stub
		return isPosicaoVisitada() && linhaAtual < linhas-1;
	}

	private void montarLinhaEsquerdaDireita() {
		while (permiteIrDireita()) {
		 
		 matriz[linhaAtual][colunaAtual] = valorAtual;
		 valorAtual++;
		 colunaAtual++;
		}
	}

	private boolean permiteIrDireita() {
		return (isPosicaoVisitada() && colunaAtual < colunas-1);
		
	}

	private boolean isPosicaoVisitada() {
		return matriz[linhaAtual][colunaAtual] == 0;
	}

}
