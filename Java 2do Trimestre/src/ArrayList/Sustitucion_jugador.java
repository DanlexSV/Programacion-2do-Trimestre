package ArrayList;

import java.util.*;

import javax.swing.JOptionPane;

public class Sustitucion_jugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> plantilla = new ArrayList<String>();
		boolean salir = false, igual = false;
		while (!salir) {
			System.out.println("Opcion 1 ~ Pedir los nombres de los jugadores convocados");
			System.out.println("Opcion 2 ~ Buscar el numero de un jugador de la lista");
			System.out.println("Opcion 3 ~ Hacer un cambio en la plantilla");
			System.out.println("Opcion 4 ~ Lista de los jugadores convocados");
			System.out.println("Opcion 5 ~ Salir");
			System.out.println("");
			switch (JOptionPane.showInputDialog("Escribe una opcion").toLowerCase()) {
			case "opcion 1":
				plantilla.add(JOptionPane.showInputDialog("Escribe el nombre del jugador"));
				break;
			case "opcion 2":
				if (plantilla.size() > 0)
					for (String jug : plantilla)
						JOptionPane.showInputDialog(null, jug);
				break;
			case "opcion 3":
				sustitucion(plantilla);
				break;
			}
		}
	}

	private static void sustitucion(ArrayList<String> plantilla) {
		String jugador, newjugador;
		jugador = JOptionPane.showInputDialog("Escribe el nombre del jugador");
		newjugador = JOptionPane.showInputDialog("Escribe el nombre del nuevo jugador");
		int posicion = plantilla.indexOf(jugador);
		if (posicion >= 0)
			plantilla.set(posicion, newjugador);
		else
			JOptionPane.showInputDialog(null, "El jugador " + jugador + " no ha sido convocado");
	}
}
