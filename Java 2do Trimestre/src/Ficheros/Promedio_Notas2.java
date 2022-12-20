package Ficheros;

import java.io.*;
import javax.swing.JOptionPane;

public class Promedio_Notas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int asig = 4;
		final int alum = 4;
		String[][] notas = new String[asig][alum];
		FileWriter fw;
		BufferedWriter bw = null;
		
		for (int col= 0; col < notas[0].length; col++)
			for (int fila = 0; fila < notas.length; fila++) {
				if (fila == 0)
					notas[fila][col] = JOptionPane.showInputDialog("Escribe el nombre del alumno");
				if (fila == 1)
					notas[fila][col] = JOptionPane.showInputDialog("Escribe la nota de " + notas[0][col] + " en Matematicas");
				if (fila == 2)
					notas[fila][col] = JOptionPane.showInputDialog("Escribe la nota de " + notas[0][col] + " en Lengua");
				if (fila == 3)
					notas[fila][col] = JOptionPane.showInputDialog("Escribe la nota de " + notas[0][col] + " en Geografia");
			}
		try {
			fw = new FileWriter("notas.txt", true);
			bw = new BufferedWriter(fw);
			for (int col = 0; col < notas[0].length; col++)
				bw.write(notas[0][col] + ": " + notas[1][col] + ", " + notas[2][col] + ", " + notas[3][col] + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
