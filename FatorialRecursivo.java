package TestesPraticos;

public class FatorialRecursivo {

	public static void main(String[] args) {

		int numero = 5;
		long resultado = calcularFatorial(numero);
		System.out.println("O fatorial de " + numero + " é: " + resultado);
		
	}

	// Método recursivo para calcular o fatorial
	private static long calcularFatorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			// Chamada recursiva para calcular o fatorial
			
			return n * calcularFatorial(n - 1);
		}		
	}
	
}

/*
 * Vamos analisar o cálculo passo a passo da expressão return n * calcularFatorial(n - 1); dentro do método calcularFatorial:
 * 1) Chamada Inicial:
 Suponha que você chama calcularFatorial(5)
 * 2) Cálculo para n = 5:
 A expressão return 5 * calcularFatorial(5 - 1); é avaliada.
 Isso se torna return 5 * calcularFatorial(4);
 * 3) Chamada Recursiva para n = 4:
 Agora, calcularFatorial(4) é chamado.
 Isso se torna return 4 * calcularFatorial(4 - 1);
 * 4) Retorno nas Chamadas Recursivas:
 A chamada calcularFatorial(0) retorna 1.
 A chamada calcularFatorial(1) retorna 1 * 1, ou seja, 1.
 A chamada calcularFatorial(2) retorna 2 * 1, ou seja, 2.
 A chamada calcularFatorial(3) retorna 3 * 2, ou seja, 6
 A chamada calcularFatorial(4) retorna 4 * 6, ou seja, 24.
 A chamada calcularFatorial(5) retorna 5 * 24, ou seja, 120.

 */