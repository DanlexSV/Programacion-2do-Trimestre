package Ficheros;

import java.io.*;
import javax.swing.*;

public class Nombre_Telefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		escritura();
	}

	private static void escritura() {
		String nombre = "", telefono = "";
		FileWriter flw;
		BufferedWriter fw;
		try {
			flw = new FileWriter("Agenda.txt", true);
			fw = new BufferedWriter(flw);
			do {
				nombre = JOptionPane.showInputDialog("Escribe un nombre: ");
				if (nombre.length() > 0) {
					telefono = JOptionPane.showInputDialog("Escribe un telefono: ");
					fw.write(nombre + "," + telefono + "\n");
				}
			} while (nombre.length() > 0);
			fw.close();
			flw.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
