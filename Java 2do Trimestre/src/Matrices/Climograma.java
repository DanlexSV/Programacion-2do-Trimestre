package Matrices;

import java.util.*;

public class Climograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int acum = 0, acum1 = 0, tem, pre;
		String[][] clima = { { "Enero", "1", "100" }, { "Febrero", "2", "150" }, { "Marzo", "10", "100" },
				{ "Abril", "9", "160" }, { "Mayo", "21", "140" }, { "Junio", "22", "40" }, { "Julio", "30", "20" },
				{ "Agosto", "35", "25" } };

		for (int fila = 0; fila < clima.length; fila++)
			for (int col = 0; col < clima[fila].length; col++) {
				if (col == 1) {
					if (clima[fila][col].length() == 1) {
						tem = Integer.parseInt("" + clima[fila][col].charAt(0));
						acum += tem;
					} else if (clima[fila][col].length() == 2) {
						tem = Integer.parseInt("" + clima[fila][col].charAt(0) + clima[fila][col].charAt(1));
						acum += tem;
					}
				} else if (col == 2) {
					if (clima[fila][col].length() == 3) {
						pre = Integer.parseInt("" + clima[fila][col].charAt(0) + clima[fila][col].charAt(1)
								+ clima[fila][col].charAt(2));
						acum1 += pre;
					} else if (clima[fila][col].length() == 2) {
						pre = Integer.parseInt("" + clima[fila][col].charAt(0) + clima[fila][col].charAt(1));
						acum1 += pre;
					}
				}
			}
		System.out.println("La media de temperatura es de " + (acum / 8));
		System.out.println("La media de precipitacion es de " + (acum1 / 8));
	}
}
