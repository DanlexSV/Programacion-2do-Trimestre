package Ficheros;

import java.io.*;
import javax.swing.*;

public class Nombre_Telefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "", telefono = "";
		FileWriter fw;
		BufferedWriter bw = null;
		escritura();
	}

	private static void escritura() {
		String nombre;
		String telefono;
		FileWriter fw;
		BufferedWriter bw;
		try {
			nombre = JOptionPane.showInputDialog("Escribe un nombre: ");
			telefono = JOptionPane.showInputDialog("Escribe un telefono: ");
			fw = new FileWriter("Agenda.txt", true);
			bw = new BufferedWriter(fw);
			bw.write(nombre + "," + telefono + "\n");
			bw.close();
		} catch (IOException e) {
			JOptionPane.showInputDialog(null, e.getMessage());
		} catch (Exception e) {
			JOptionPane.showInputDialog(null, e.getMessage());
		}
	}

}
