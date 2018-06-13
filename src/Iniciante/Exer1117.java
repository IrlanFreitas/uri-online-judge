package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer1117 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double media = 0.0;
		int aux = 0;
		DecimalFormat formatador = new DecimalFormat("#.##");
		while (true) {
			
			double nota = scan.nextDouble();
			if (nota >= 0 && nota <= 10) {
				media += nota;
				aux++;
			} else {
				System.out.println("nota invalida");
			}
			
			if (aux == 2) {
				media = media/2;
				System.out.println("media = "+ formatador.format(media));
				scan.close();
				break;
			}
			
		}
		
	}

}
