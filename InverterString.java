package TestesPraticos;

public class InverterString {

	public static void main(String[] args) {
		String original = "Hello, World";
		String invertida = inverterString(original);

		System.out.println("Original: " + original);
		System.out.println("Invertida: " + invertida);
	}

	// Método para inverter uma string
	public static String inverterString(String str) {
		char[] caracteres =str.toCharArray();
		int inicio = 0;
		int fim = str.length() - 1;
		
		// Troca os caracteres da extremidade até o centro
		
		while (inicio < fim) {
			char temp = caracteres[inicio];
			caracteres[inicio] = caracteres[fim];
			caracteres[fim] = temp;
			
			inicio++;
			fim--;
		}
		
		// Constrói uma nova string a partir do array de caracteres invertidos
		
		return new String (caracteres);
	}
	


}
