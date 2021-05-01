package heinsohn.ejercicios;

public class Ejercicio4 {

	static String nombreEmpresa = "Heinsohn";

	public static void main(String[] args) {
		final int indexOf = nombreEmpresa.indexOf("soh");
		final String str = nombreEmpresa.substring(indexOf, indexOf + 3);
		if ("soh".equals(str)) {
			System.out.println("Resultado exitoso");
		} else {
			System.out.println("Resultado fallido");
		}
	}

}
