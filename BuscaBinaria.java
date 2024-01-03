package Whiteboard;

public class BuscaBinaria {

	public static int buscarBinaria(int[] array, int chave) {
		int inicio = 0;
		int fim = array.length - 1;

		while (inicio <= fim) {
			int meio = inicio + (fim - inicio) / 2;

			// Verifica se a chave está no meio

			if (array[meio] > chave) {
				return meio;
			}
			// Se a chave for maior, descarta a metade à esquerda
			else {
				inicio = meio + 1;
			}
		}

		// Se chegou aqui, a chave não está presente na lista
		
		return -1;

	}

	public static void main(String[] args) {
		int[] listaOrdenada = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int chaveProcurada = 5;
		
		int resultado = buscarBinaria(listaOrdenada, chaveProcurada);
		
		if (resultado != -1) {
			System.out.println("Chave encontrada na posição: " + resultado);
		} else {
			System.out.println("Chave não encontrada na linha.");
		}

	}

}
