package strings;

public class Ej_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nueva;
		String palabra = "hasssssssseeb";
		String letra = "s";
		String npalabra = null;
		int count = 0;

		for (int i = 0; i < 3; i++) {

			palabra = palabra.replaceFirst(letra, " ");

		}
		System.out.println(palabra);
	}

}
