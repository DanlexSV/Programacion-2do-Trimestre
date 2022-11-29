package Matrices;

import java.util.*;

public class Ejercicio1_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] enteros = new int[2][3];
		
		for (int fila = 0; fila < enteros.length; fila++)
			for (int col = 0; col < enteros[fila].length; col++) {
				System.out.println("Escribe un valor numerico:");
				enteros[fila][col] = sc.nextInt();
			}
		
		for (int fila = 0; fila < enteros.length; fila++) {
			for (int col = 0; col < enteros[fila].length; col++)
				System.out.print(enteros[fila][col] + "");
			System.out.println();
		}
	}
}