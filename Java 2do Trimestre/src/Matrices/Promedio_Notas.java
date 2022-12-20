package Matrices;

import java.util.*;

public class Promedio_Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int asig = 3;
		final int alumn = 4;

		double[][] notas = new double[asig][alumn];
		double acum = 0, acum1 = 0, acum2 = 0;
		double al = 0, al1 = 0, al2 = 0;

		for (int col = 0; col < notas[0].length; col++)
			for (int fila = 0; fila < notas.length; fila++) {
				if (fila == 0) {
					System.out.println("Escribe la nota del alumno" + (col + 1) + " en Matemáticas");
					notas[fila][col] = new Scanner(System.in).nextDouble();
				} else if (fila == 1) {
					System.out.println("Escribe la nota del alumno" + (col + 1) + " en Lengua");
					notas[fila][col] = new Scanner(System.in).nextDouble();
				} else {
					System.out.println("Escribe la nota del alumno" + (col + 1) + " en Geografía");
					notas[fila][col] = new Scanner(System.in).nextDouble();
				}
			}
		for (int fila = 0; fila < notas.length; fila++) {
			al += notas[fila][0];
			al1 += notas[fila][1];
			al2 += notas[fila][2];
		}
		for (int col = 0; col < notas[0].length; col++)
			for (int fila = 0; fila < notas.length; fila++) {
				if (fila == 0)
					acum += notas[fila][col];
				else if (fila == 1)
					acum1 += notas[fila][col];
				else
					acum2 += notas[fila][col];
			}
		for (int fila = 0; fila < notas.length; fila++) {
			if (fila == 0)
				System.out.println("La nota media en Matematicas es de " + (acum / alumn));
			else if (fila == 1)
				System.out.println("La nota media en Lengua es de " + (acum1 / alumn));
			else
				System.out.println("La nota media en Geografía es de " + (acum2 / alumn));
		}
		for (int col = 0; col < notas[0].length; col++) {
			if (col == 0)
				System.out.println("La nota media del alumno" + (col + 1) + " es de " + (al / asig));
			else if (col == 1)
				System.out.println("La nota media del alumno" + (col + 1) + " es de " + (al1 / asig));
			else
				System.out.println("La nota media del alumno" + (col + 1) + " es de " + (al2 / asig));
		}
	}
}