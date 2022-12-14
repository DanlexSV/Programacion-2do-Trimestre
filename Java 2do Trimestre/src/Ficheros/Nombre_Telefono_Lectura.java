package Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class Nombre_Telefono_Lectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lectura();
	}

	public static void lectura() {
		String linea = "", texto = "";
		FileReader flr;
		BufferedReader fr = null;
		try {
			flr = new FileReader("Agenda.txt");
			fr = new BufferedReader(flr);
			while (linea != null) {
				linea = fr.readLine();
				if (linea != null)
					texto += linea + "\n";
			}
			fr.close();
			flr.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		JOptionPane.showMessageDialog(null, texto);
	}

}
