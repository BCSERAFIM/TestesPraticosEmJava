package TestesPraticos;

import java.util.List;

public class EncontrarMaiorElemento {

	public static int encontarMaiorElemento(List<Integer> lista) {
		if (lista == null || lista.isEmpty()) {
			throw new IllegalArgumentException("A lista não pode ser nula ou vazia!");
		}
		// Aqui, a variável maiorElemento é inicializada com o primeiro elemento da lista.
		int maiorElemento = lista.get(0);
		
		// Este é um loop for-each que itera sobre todos os elementos da lista. 
		for (int elemento : lista) {
			if (elemento > maiorElemento) {
				maiorElemento = elemento;
			}
		}
		
		return maiorElemento;
		
	}
		
	
	public static void main(String[] args) {
		
		// Exemplo de uso
		
		List<Integer> listaDeNumeros = List.of(10, 5, 8, 20, 40, 12);
		int maiorElemento = encontarMaiorElemento(listaDeNumeros);
		
		System.out.println("O maior elemento na lista é: " + maiorElemento);
	}

}
