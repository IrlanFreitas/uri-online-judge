package Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI1113 {

	public static List<String> resultado;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		resultado = new ArrayList<>();
	    while (true) {
	        if(obterValores(scanner.nextLine())){
	            break;
	        }
	    }
	    scanner.close();
	    resultado.forEach(System.out::println);
	}
	
	public static boolean obterValores( String textoDigitado ) {
		
		String[] valores = textoDigitado.split(" ");

		int primeiroValor = Integer.parseInt(valores[0]);
		int segundoValor = Integer.parseInt(valores[1]);
		
		if (primeiroValor == segundoValor) {
			return true;
		} else if (primeiroValor > segundoValor) {
			resultado.add( "Decrescente" );
			return false;
		} else {
			resultado.add( "Crescente" );
			return false;
		}
		
	}
	
}
