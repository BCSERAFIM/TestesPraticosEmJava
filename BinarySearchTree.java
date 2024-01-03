package Whiteboard;

class Node {
	int Key;
	Node left, right;
	
	public Node(int item) {
		Key = item;
		left = right = null;
	}
	
}

/*
 * Node:  é a classe que representa um nó na árvore.
 *  Cada nó possui um valor (key) e duas referências, uma para o nó à esquerda (left) e outra para o nó à direita (right).
 * O construtor public Node(int item) inicializa um nó com o valor passado como parâmetro e nenhuma referência
 * para os nós à esquerda ou à direita.
 * */



// --------------------//----------------------------// ---------------------//----------------//----------------//----------

public class BinarySearchTree {

	private Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	/*
	 * BinarySearchTree é a classe que representa a árvore binária de busca.
	 * Ela possui uma referência para o nó raiz (root), que é inicializado como null quando a árvore é criada.
	 * O construtor public BinarySearchTree() inicializa a árvore com uma raiz nula.
	 * */
	
	
	// Método para inserir um novo elemento na árvore
	
	public void insert(int key) {
		root = insertRec(root, key);
	}
	
/*
 * O método insert é usado para inserir um novo valor na árvore.
 * Ele chama o método insertRec passando a raiz da árvore e o valor a ser inserido.
 * O método insertRec é recursivo e realiza a inserção de acordo com as propriedades de uma árvore binária de busca.
 * Se o nó atual (root) for nulo, isso significa que encontramos o local de inserção e criamos um novo nó com o valor desejado.
 * Se o valor a ser inserido for menor que o valor do nó atual, a inserção é feita na subárvore à esquerda; caso contrário, na subárvore à direita.
 * A recursão continua até encontrar o local adequado para a inserção.
 * */
	
	
	// Método auxiliar para inserir um novo elemento (recursivo)
	
	private Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		
		if (key < root.Key)
			root.left = insertRec(root.left, key);
		else if (key > root.Key)
			root.right = insertRec(root.right, key);
		
		return root;
	}

	// Método para percorrer a árvore em ordem
	
	public void inOrderTraversal() {
		inOrderTraversal(root);
	}
	
	// Método auxiliar para percorrer a árvore em ordem (recursivo)
	
	private void inOrderTraversal(Node root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.println(root.Key + " ");
			inOrderTraversal(root.right);
		}
		
	}
	
	
	/*
	 * inOrderTraversal é um método público que inicia a travessia em ordem da árvore.
	 * Ele chama o método privado inOrderTraversal passando a raiz da árvore como ponto de partida.
	 * inOrderTraversal é um método recursivo que percorre a árvore em ordem, visitando os nós na ordem esquerda-raiz-direita.
	 * Cada nó é impresso durante a travessia.
	 * */

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		 // Inserindo elementos na árvore
		
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		
		// Percorrendo a árvore em ordem e imprimindo os elementos
		
		System.out.println("Árvore em Ordem:");
		tree.inOrderTraversal();
	}

}
