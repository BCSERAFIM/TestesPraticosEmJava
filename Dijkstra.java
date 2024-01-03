package Whiteboard;

import java.util.Arrays;

public class Dijkstra {

	public static final int INFINITO = Integer.MAX_VALUE;
	
	public static void dijktra(int[][] grafo, int origem ) {
		int numVertices = grafo.length; 
		int[] distancia = new int[numVertices];
		boolean[] visitado = new boolean[numVertices];
		
		Arrays.fill(distancia, INFINITO);
		Arrays.fill(visitado, false);
		
		distancia[origem] = 0;
		
		for (int i = 0; i < numVertices - 1; i++) {
			int verticeMinDistancia = encontrarVerticeMinDistancia(distancia, visitado);
			visitado[verticeMinDistancia] = true;
			
			for (int v = 0; v < numVertices; v++) {
				if (!visitado[v] && grafo[verticeMinDistancia][v] != 0 &&
						distancia[verticeMinDistancia] !=INFINITO &&
						distancia[verticeMinDistancia] + grafo[verticeMinDistancia][v] < distancia[v]) {
					distancia[v] = distancia[verticeMinDistancia] + grafo[verticeMinDistancia][v];
				}
					
			}
			
			
		}
		
		imprimirDistancia(distancia);
	}
	
	
	




	private static int encontrarVerticeMinDistancia(int[] distancia, boolean[] visitado) {
		int minDistancia = INFINITO;
		int verticeMinDistancia = -1;
		
		for (int v = 0; v < distancia.length; v++) {
			if(!visitado[v] && distancia[v] <= minDistancia) {
				minDistancia = distancia[v];
				verticeMinDistancia = v;
			}
		}
		return verticeMinDistancia;
	}



	private static void imprimirDistancia(int[] distancia) {
		System.out.println("Distâncias a partir do vértice de origem:");
		for (int i = 0; i < distancia.length; i++) {
			System.out.println("Vértice " + i + ": " + distancia[i]);
		}
	}


	public static void main(String[] args) {
		int[][] grafo = {
				{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 0, 10, 0, 2, 0, 0},
                {0, 0, 0, 14, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}				
		};

		dijktra(grafo, 0);
	}

}
