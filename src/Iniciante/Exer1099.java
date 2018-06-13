package Iniciante;

import java.util.Scanner;

public class Exer1099 {

	public static int[] resultado;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String casosTeste = scan.nextLine();
		int numeroCasosTeste = Integer.parseInt(casosTeste);
		resultado = new int[numeroCasosTeste];
		
		for (int i = 0; i < numeroCasosTeste; i++) {
			obterValores(i, scan.nextLine());
		}
		scan.close();
		
		for (int somaImpares : resultado) {
			System.out.println(somaImpares);
		}
		
	}

	public static void obterValores(int indice, String textoDigitado) {
		String[] valores = textoDigitado.split(" ");

		int primeiroValor = Integer.parseInt(valores[0]);
		int segundoValor = Integer.parseInt(valores[1]);
		
		if (primeiroValor == segundoValor) {
			resultado[indice] = 0;
		} else if (primeiroValor > segundoValor) {
			resultado[indice] = calcularIntervalo( primeiroValor, segundoValor);
		} else {
			resultado[indice] = calcularIntervalo( segundoValor, primeiroValor);
		}

	}
	
	public static int calcularIntervalo(int maiorValor, int menorValor){
		int acumulo = 0;
		
		for (int i = (menorValor+1); i < maiorValor; i++) {
			if(i % 2 != 0){
				acumulo += i;
			}
		}
		return acumulo;
	}

}
