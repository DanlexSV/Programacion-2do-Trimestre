package Matrices;

import java.util.*;

public class Tabla_Multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int fil = 12;
		final int colum = 3;
		Scanner sc = new Scanner(System.in);
		int[][] tabla = new int[fil][colum];
		int num;
		System.out.println("De qué número quieres ver la tabla de multiplicar?");
		num = sc.nextInt();

		for (int fila = 0; fila < tabla.length; fila++) {
			tabla[fila][0] = fila + 1;
			tabla[fila][1] = num;
			tabla[fila][2] = tabla[fila][0] * tabla[fila][1];
		}
		for (int fila = 0; fila < tabla.length; fila++)
			System.out.println(tabla[fila][0] + "x" + tabla[fila][1] + "=" + tabla[fila][2]);
	}
}