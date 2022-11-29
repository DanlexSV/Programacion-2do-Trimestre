package Matrices;

public class Creacion_Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] enteros = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int fila = 0; fila < enteros.length; fila++) {
			for (int col = 0; col < enteros[fila].length; col++)
				System.out.print(enteros[fila][col] + "");
			System.out.println();
		}

		for (int col = 0; col < enteros[0].length; col++) {
			for (int fila = 0; fila < enteros.length; fila++)
				System.out.print(enteros[fila][col] + "");
			System.out.println();
		}
	}
}