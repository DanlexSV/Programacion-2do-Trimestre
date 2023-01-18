package Ficheros;

import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Lectura_Notas_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> notas = new ArrayList<String>();
		FileReader fr;
		BufferedReader br = null;
		String linea = "";
		
		try {
			fr = new FileReader("notas.txt");
			br = new BufferedReader(fr);
			while (linea != null) {
				linea = br.readLine();
				if (linea != null)
					notas.add(linea);
			}
			br.close();
			fr.close();
			if(notas.size() != 0)
				for (String line:notas)
					JOptionPane.showMessageDialog(null, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
