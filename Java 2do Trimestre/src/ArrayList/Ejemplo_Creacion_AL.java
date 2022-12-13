package ArrayList;

import java.util.*;

public class Ejemplo_Creacion_AL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<String> ListaCompra = new ArrayList<String>();
		String producto = "";
		for (int i = 0; i < 5; i++) {
			System.out.println("Escribe un producto");
			producto = sc.nextLine();
			ListaCompra.add(producto);
		}
		//System.out.println("Producto que está en la posicion 3 " + ListaCompra.get(3));
		//ListaCompra.remove(2)
		/*int posicion = ListaCompra.indexOf("ab");
		ListaCompra.set(posicion, "zz");*/
		
		for (int posicion = 0; posicion < ListaCompra.size(); posicion++)
			System.out.println(ListaCompra.get(posicion));
		
		for (String product:ListaCompra)
			System.out.println(product);
	}
}
