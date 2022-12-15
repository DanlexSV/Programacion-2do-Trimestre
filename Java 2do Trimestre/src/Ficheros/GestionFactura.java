package Ficheros;

import java.io.*;
import javax.swing.*;

public class GestionFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea;
		boolean salir = false;
		while (!salir) {
			JOptionPane.showMessageDialog(null, "Opcion A ~ Alta de productos" + "\n"
					+ "Opcion L ~ Listado de productos" + "\n" + "Opcion S ~ Salir");
			switch (JOptionPane.showInputDialog("Escribe una de las opciones del menu").toUpperCase()) {
			case "A":
				linea = JOptionPane.showInputDialog("");
				salir = true;
				break;
			}
		}
	}
}