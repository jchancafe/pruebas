import java.util.Scanner;
// Para evaluar si un texto es un palindromo
// ademas se retiran letras hasta tratar que el texto sea un palindromo.
public class Main {
	// Para validar si un texto es paligromo
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el texto a evaluar");
		String nombre = entrada.nextLine();
		String[] posicionLetra = nombre.split("");
		
		posicionLetra = obtenerLetrasUnicos(posicionLetra);
		
		// va a iterar hasta el texto tenga mas de dos letras.
		for(int i=0; i< posicionLetra.length; i++) {
			// 
			if(esPalindromo(nombre)) {
				System.out.println("exito: " + nombre);
				return;
			}
			nombre = actualizarTexto(nombre, posicionLetra[i]);
		}
		System.out.println("texto final: " + nombre);
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
	
	private static String[] obtenerLetrasUnicos(String[] arrayString) {
		String nuevoString = "";
		for(int i=0;i< arrayString.length; i++) {
			if(!nuevoString.contains(arrayString[i])) {
				nuevoString += arrayString[i];
			}
		}
		return nuevoString.split("");
	}

}
