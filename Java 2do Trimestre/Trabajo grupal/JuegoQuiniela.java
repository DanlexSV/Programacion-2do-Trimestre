import java.util.*;

public class JuegoQuiniela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[][] apuesta = { { "Atleti - Madrid", "" }, { "Betis - Sevilla", "" }, { "Athletic - Real Sociedad", "" },
				{ "Barca - Espanyol", "" }, { "Valencia - Elche", "" } };
		String[][] resultado = { { "Atleti - Madrid", "" }, { "Betis - Sevilla", "" },
				{ "Athletic - Real Sociedad", "" }, { "Barca - Espanyol", "" }, { "Valencia - Elche", "" } };
		boolean salir = false;
		int cont = 0;

		while (!salir) {

			System.out.println("A ~ Escribe los resultados de la tabla");
			System.out.println("B ~ Escribe la apuesta del usuario");
			System.out.println("C ~ Mostrar lo que ha ganado el usuario");
			System.out.println("S ~ Salir");
			System.out.println("Escribe una letra");

			switch (sc.nextLine().toUpperCase()) {

			case "A":
				for (int fila = 0; fila < resultado.length; fila++) {
					System.out.println("Escribe los resultados de la semana");
					System.out.print(resultado[fila][0] + " = ");
					resultado[fila][1] = sc.nextLine().toUpperCase();
				}
				break;
			case "B":
				cont = 0;
				for (int fila = 0; fila < apuesta.length; fila++) {
					System.out.println("Escribe tu apuesta de este partido");
					System.out.print(apuesta[fila][0] + " = ");
					apuesta[fila][1] = sc.nextLine().toUpperCase();
				}
				break;
			case "C":
				boolean esigual = false, lleno = false;
				for (int fil = 0; fil < apuesta.length; fil++)
					if (apuesta[fil][1].length() > 0 && resultado[fil][1].length() > 0)
						lleno = true;
				if (lleno) {
					for (int fila = 0; fila < apuesta.length; fila++)
						if (apuesta[fila][1].equals(resultado[fila][1])) {
							esigual = true;
							cont++;
						}
					if (esigual) {
						System.out.println("Has acertado " + cont + " veces");
						if (cont == 5)
							System.out.println("Ganas 600.000 Euros.");
						else if (cont == 4)
							System.out.println("Ganas 220.000 Euros.");
						else if (cont == 3)
							System.out.println("Ganas 3000 Euros.");
						else if (cont == 2)
							System.out.println("Ganas 320 Euros.");
						else
							System.out.println("No has ganado nada.");
					}
					else
						System.out.println("No has acertado nada.");
				} else
					System.out.println("No has pulsado A y/o B");
				break;
			case "S":
				salir = true;
				System.out.println("Saliendo del menu...");
				break;
			default:
				salir = true;
				System.out.println("Saliendo del menu...");
				break;
			}
		}
	}
}
