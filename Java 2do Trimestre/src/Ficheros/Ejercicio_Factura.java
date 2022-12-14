package Ficheros;

import java.io.*;
import javax.swing.*;

public class Ejercicio_Factura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		escritura();
	}

	private static void escritura() {
		String producto = "", cantidad = "", precio = "";
		FileWriter fw;
		BufferedWriter bw;
		try {
			fw = new FileWriter("factura.txt", true);
			bw = new BufferedWriter(fw);
			do {
				producto = JOptionPane.showInputDialog("Escribe el nombre del producto");
				if (producto.length() > 0) {
					cantidad = JOptionPane.showInputDialog("Escribe la cantidad del producto");
					precio = JOptionPane.showInputDialog("Escribe el precio del producto");
					bw.write(producto + "," + cantidad + "," + precio + "\n");
				}
			} while (producto.length() > 0);
			bw.close();
			fw.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
