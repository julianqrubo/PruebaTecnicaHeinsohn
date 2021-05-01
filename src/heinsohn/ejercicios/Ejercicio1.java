package heinsohn.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		final Integer[] array = { 1, 0, 1, 0, 0, 0, 1, 1 };
		final int permutador = 2;
		List<Integer> calcularAlgoritmo = calcularAlgoritmo(array, permutador);
		System.out.println(calcularAlgoritmo);
	}

	public static List<Integer> calcularAlgoritmo(final Integer[] array, final int permutador) {
		List<Integer> listaFinal = new ArrayList<Integer>();
		Integer[] array_aux = array;
		for (int i = 0; i < permutador; i++) {
			listaFinal.clear();
			for (int j = 0; j < array_aux.length; j++) {
				if (j == 0) {
					if (0 == array_aux[j + 1]) {
						listaFinal.add(j, 0);
					} else {
						listaFinal.add(j, 1);
					}
				} else if (j == array_aux.length - 1) {
					if (array_aux[j - 1] == 0) {
						listaFinal.add(j, 0);
					} else {
						listaFinal.add(j, 1);
					}
				} else {
					if (array_aux[j - 1] == array_aux[j + 1]) {
						listaFinal.add(j, 0);
					} else {
						listaFinal.add(j, 1);
					}
				}
			}
			array_aux = listaFinal.toArray(new Integer[0]);
		}
		return listaFinal;
	}

}
