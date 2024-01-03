package TestesPraticos;
import java.util.LinkedList;
import java.util.Queue;

public class filaQueue {

	public static void main(String[] args) {
		
		// Criando uma fila usando LinkedList
		
		Queue<String> fila = new LinkedList<>();
		
		// Adicionando elementos à fila
		fila.offer("Elemento 1");
		fila.offer("Elemento 2");
		fila.offer("Elemento 3");
		
		// Exibindo a fila
		System.out.println("Fila: " + fila);
		
		// Removendo e exibindo elementos da fila (usando poll)
		
		System.out.println("Removendo da fila: " + fila.poll());
		System.out.println("Fila após remoção: " + fila);
		
		// Obtendo o elemento da frente da fila sem removê-lo (usando peek)
		
		System.out.println("Elemento da frente da fila: " + fila.peek());
		System.out.println("Fila após peek: " + fila);
	}

}


/*
 * A interface Queue em Java pode ser implementada usando classes como LinkedList ou ArrayDeque.
 * Abaixo está um exemplo de como criar uma fila simples usando LinkedList:
*/

/*
 * LinkedList é uma implementação da interface List e da interface Deque em Java. 
 * Ela representa uma lista duplamente encadeada, o que significa que cada elemento da lista
 * contém uma referência tanto para o próximo quanto para o anterior na sequência. 
 * Isso contrasta com estruturas de dados como arrays, que são estruturas de acesso direto,
 * onde os elementos estão localizados em posições contidas na memória.
*/

/*
 * offer: Adiciona um elemento ao final da fila.
 * poll: Remove e retorna o elemento da frente da fila. Retorna null se a fila estiver vazia.
 * peek: Retorna o elemento da frente da fila sem removê-lo. Retorna null se a fila estiver vazia.
 */

/*
 * 1) Inserção e Remoção Eficientes:
 * A inserção e remoção de elementos em uma LinkedList é eficiente, especialmente quando comparada a um array tradicional.
 * Isso ocorre porque, para adicionar ou remover um elemento no meio da lista, apenas as referências aos nós adjacentes precisam ser ajustadas.
 
 * 2) Acesso Ineficiente por Índice: 
 * O acesso direto aos elementos por índice é menos eficiente em uma LinkedList em comparação com um array.
 * A busca por um elemento específico requer percorrer a lista a partir do início ou do final, dependendo da proximidade do índice de destino.
 
 * 3) Uso de Memória: LinkedList:
 * tende a consumir mais memória em comparação com arrays devido às referências adicionais necessárias para encadear os nós.
 
 * 4) Implementação das Interfaces:
 * Além das interfaces List e Deque, LinkedList implementa outras interfaces, como Queue, 
 * o que a torna adequada para muitas operações relacionadas a filas.
*/

