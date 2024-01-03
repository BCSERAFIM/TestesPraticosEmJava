package Whiteboard;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase para verificar se é um palíndromo:");
		String input = scanner.nextLine();
		
		if (isPalindrome(input)) {
			System.out.println("A frase é um palíndromo.");
		} else {
			System.out.println("A frase não é um palíndromo.");
		}
		
		scanner.close();

	}

	
	
	
	private static boolean isPalindrome(String str) {
		// Remove espaços, pontuações e torna todas as letras minúsculas
		String cleanStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		int left = 0;
		int right = cleanStr.length() - 1;
		
		while (left < right) {
			if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
				return false;
			}
			
			 left++;
	         right--;
		}
		
		return true;
		
	}

}
