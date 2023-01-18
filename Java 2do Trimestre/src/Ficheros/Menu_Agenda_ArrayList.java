package Ficheros;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Menu_Agenda_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salir = false;
		ArrayList<String> agenda = new ArrayList<String>();
		
		while (!salir) {
			System.out.println("A ~ Alta de un nuevo contacto de la agenda" + "\n" + 
			"G ~ Guardar los contactos en un fichero" + "\n" + 
			"L ~ Mostrar los contactos guardados" + "\n" + "S ~ Salir");
			switch (JOptionPane.showInputDialog("Escribe una opcion").toUpperCase()) {
			case "A":
				alta(agenda); break;
			case "G":
				grabar(agenda); break;
			case "L":
				listar(agenda); break;
			case "B":
				borrar(agenda); break;
			case "S":
				salir = true; break;
			default:
				System.out.println("No has pulsado una tecla valida...");
			}
		}

	}

	private static void alta(ArrayList<String> agenda) {
		agenda.add(JOptionPane.showInputDialog("Escribe el nombre del contacto") + ", " + 
				JOptionPane.showInputDialog("Escribe el numero del telefono del contacto"));
	}
	private static void grabar (ArrayList<String> agenda) {
		FileWriter flw;
		BufferedWriter fw;
		try {
			flw = new FileWriter("Agenda1.txt", true);
			fw = new BufferedWriter(flw);
			for (String lista:agenda)
				fw.write(lista + "\n");
			fw.close();
			flw.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	private static void listar (ArrayList<String> agenda) {
		String linea = "", texto = "";
		FileReader flr;
		BufferedReader fr = null;
		try {
			flr = new FileReader("Agenda1.txt");
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
	private static void borrar (ArrayList<String> agenda) {
		boolean igual = false;
		String name;
	}
	
}
