package Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer1101 {
	
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
	
	public static boolean obterValores(String textoDigitado) {
		String[] valores = textoDigitado.split(" ");

		int primeiroValor = Integer.parseInt(valores[0]);
		int segundoValor = Integer.parseInt(valores[1]);
		
		if (primeiroValor <= 0 || segundoValor <= 0) {
			return true;
		} else if (primeiroValor > segundoValor) {
			resultado.add( calcularIntervalo( primeiroValor, segundoValor) );
			return false;
		} else {
			resultado.add( calcularIntervalo( segundoValor, primeiroValor) );
			return false;
		}

	}
	
	public static String calcularIntervalo(int maiorValor, int menorValor){
		int acumulo = 0;
		String texto = "";
		
		for (int i = menorValor; i <= maiorValor; i++) {
			texto += " "+ i;
			acumulo += i;
		}
		return String.valueOf( texto +" Sum="+ acumulo ).trim();
	}

}
