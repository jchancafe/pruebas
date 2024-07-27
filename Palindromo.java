import java.util.Scanner;

public class Main {
	// Para validar si un texto es paligromo
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre = entrada.nextLine();
		String[] posicionLetra = nombre.split("");
		for(int i=0; i< posicionLetra.length; i++) {
			if(esPalindromo(nombre)) {
				System.out.println("exito: " + nombre);
				return;
			}
			nombre = actualizarTexto(nombre, posicionLetra[i]);
		}
	}
	
	private static boolean esPalindromo(String texto) {
		//retirando los espacios en blanco
		texto = texto.replace(" ", "");
		//en mayusculas.
		texto = texto.toUpperCase();
		// Se invierte
		StringBuffer textoInvertido = new StringBuffer();
		textoInvertido.append(texto).reverse();
		// validando.
		return textoInvertido.toString().equals(texto);
	}
	
	private static String actualizarTexto(String texto, String letraEliminar) {
		return texto.replace(letraEliminar, "");
	}

}
