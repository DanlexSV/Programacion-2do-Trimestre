package Ficheros;

import java.io.*;
import javax.swing.*;

public class Climograma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clima = new String [4][3];
		FileWriter fw;
		BufferedWriter bw = null;
		
		for (int fila = 0; fila < clima.length; fila++)
			for (int col = 0; col < clima[0].length; col++) {
				if (col == 0)
					clima[fila][col] = JOptionPane.showInputDialog("Escriba el nombre del mes");
				else if (col == 1)
					clima[fila][col] = JOptionPane.showInputDialog("Escriba la temperatura");
				else if (col == 2)
					clima[fila][col] = JOptionPane.showInputDialog("Escriba la precipitacion");
			}
		try {
			fw = new FileWriter("clima.txt", true);
			bw = new BufferedWriter(fw);
			for (int fila = 0; fila < clima.length; fila++)
				bw.write(clima[fila][0] + " ~ " + clima[fila][1] + " ~ " + clima[fila][2] + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}


}
