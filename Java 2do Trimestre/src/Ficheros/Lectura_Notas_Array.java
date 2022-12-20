package Ficheros;

import java.io.*;
import javax.swing.JOptionPane;

public class Lectura_Notas_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] notas = new String [4];
		FileReader fr;
		BufferedReader br = null;
		String linea = "";
		int i = 0;
		
		try {
			fr = new FileReader("notas.txt");
			br = new BufferedReader(fr);
			while (linea != null) {
				linea = br.readLine();
				if (linea != null) {
					notas[i] = linea;
					i++;
				}
			}
			br.close();
			fr.close();
			for (int j = 0; j < notas.length; j++)
				JOptionPane.showMessageDialog(null, notas[j]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
