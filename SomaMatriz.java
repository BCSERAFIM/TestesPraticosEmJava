package TestesPraticos;

public class SomaMatriz {

	public static void main(String[] args) {
		// representadno matriz [i] linha e [j] coluna
		int[][] matriz = {
				{1, 2, 3},
				{4 ,5 ,6 },
				{7, 8, 9}
		};
		
		int soma = calcularSomaMatriz(matriz);
		
		System.out.println("A soma dos elementos da matriz é:" + soma);
	}

	// Método para calcular a soma de todos os elementos de uma matriz
	public static int calcularSomaMatriz(int[][] matriz) {
		
		int soma = 0;
		 // Percorre as linhas da matriz
		for (int i = 0; i < matriz.length; i++) {
			 // Percorre as colunas da matriz
			for(int j =0; j< matriz[i].length; j++) {
				  // Acumula o valor do elemento na soma
				soma += matriz[i][j];
			}
		}
		
		return soma;
	}

}
