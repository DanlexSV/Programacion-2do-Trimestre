package Ficheros;

import java.io.*;
import javax.swing.JOptionPane;

public class Lista_Videojuegos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] game = new String[3][3];
		for (int fil = 0; fil < game.length; fil++)
			for (int col = 0; col < game[0].length; col++) {
				if (col == 0)
					game[fil][col] = JOptionPane.showInputDialog("Escribe tu nombre de jugador");
				if (col == 1)
					game[fil][col] = JOptionPane.showInputDialog("Escribe tu puntaje");
				if (col == 2)
					game[fil][col] = JOptionPane.showInputDialog("Escribe el tiempo de juego en minutos");
			}
		
		FileWriter fw;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("juegos.txt", true);
			bw = new BufferedWriter(fw);
			for (int fil = 0; fil < game.length; fil++)
				bw.write(game[fil][0] + ": " + game[fil][1] + ", " + game[fil][2] + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
