package Ficheros;

import java.io.*;

import javax.swing.JOptionPane;

public class Lectura_Climograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clima = new String [4][3];
		FileReader fr;
		BufferedReader br = null;
		String linea = "";
		int fila = 0;
		
		try {
			fr = new FileReader("clima.txt");
			br = new BufferedReader(fr);
			while (linea != null) {
				linea = br.readLine();
				if (linea != null) {
					clima[fila][0] = linea;
					fila++;
				}
			}
			br.close();
			fr.close();
			for (int fil = 0; fil < clima.length; fil++)
				JOptionPane.showMessageDialog(null, clima[fil][0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
