package heinsohn.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) {
		final int numero1 = 3;
		final int numero2 = 2;
		final int numero3 = 1;
		obtenerNumMayor(numero1, numero2, numero3);
	}

	public static void obtenerNumMayor(final int numero1, final int numero2, final int numero3) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(numero1);
		lista.add(numero2);
		lista.add(numero3);
		Collections.sort(lista);
		System.out.println(lista.get(2));
	}

}
