package heinsohn.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {

	public static void main(String[] args) {
		final Integer[] vector = { 15, 7, 2, 1, 5, 9, 8, 7, 24, 50 };
		ordenamiento(vector);
	}

	public static void ordenamiento(final Integer[] vector) {
		List<Integer> listaFinal = new ArrayList<Integer>();
		List<Integer> lista = Arrays.asList(vector);
		Collections.sort(lista);
		for (Integer item : lista) {
			if (item % 2 == 0) {
				listaFinal.add(item);
			}
		}
		for (Integer item : lista) {
			if (item % 2 != 0) {
				listaFinal.add(item);
			}
		}
		System.out.println(listaFinal);
	}

}
