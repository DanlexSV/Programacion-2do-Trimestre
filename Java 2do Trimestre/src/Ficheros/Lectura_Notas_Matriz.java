package Ficheros;

import java.io.*;

import javax.swing.JOptionPane;

public class Lectura_Notas_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] notas = new String[4][1];
		FileReader fr;
		BufferedReader br = null;
		String linea = "";
		int fila = 0;
		
		try {
			fr = new FileReader("notas.txt");
			br = new BufferedReader(fr);
			while (linea != null) {
				linea = br.readLine();
				if (linea != null) {
					notas[fila][0] = linea;
					fila++;
				}
			}
			br.close();
			fr.close();
			for (int fil = 0; fil < notas.length; fil++)
				JOptionPane.showMessageDialog(null, notas[fil][0]);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
