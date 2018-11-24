package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1116 {

	public static Double[] resultado;
	public static DecimalFormat formatador = new DecimalFormat("#.#");

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String casosTeste = scan.nextLine();
		int numeroCasosTeste = Integer.parseInt(casosTeste);
		resultado = new Double[numeroCasosTeste];

		for (int i = 0; i < numeroCasosTeste; i++) {
			obterValores(i, scan.nextLine());
		}
		scan.close();

		for (Double resultadoDivisao : resultado) {
			if (resultadoDivisao == null) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(resultadoDivisao);
			}
		}

	}

	public static void obterValores(int indice, String textoDigitado) {
		String[] valores = textoDigitado.split(" ");

		double dividendo = Double.parseDouble(valores[0]);
		double divisor = Double.parseDouble(valores[1]);

		if (divisor == 0) {
			resultado[indice] = null;
		} else if (dividendo == 0) {
			resultado[indice] = 0.0;
		} else {
			double valor = dividendo/divisor;
			resultado[indice] =  Double.parseDouble( formatador.format(valor).replace(",", ".") );
		} 

	}

}
