package Iniciante;

import java.text.DecimalFormat;

public class Exer1098 {

	public static void main(String[] args) {
		
		//Um controle, e tres auxiliares
		double I = 0;
		double laco1 = 1;
		double laco2 = 2;
		double laco3 = 3;
		
		while(I < 2){
			
			for (int j2 = 0; j2 < 3; j2++) {
				switch (j2) {
				case 0:
					System.out.println("I=" + new DecimalFormat("#.#").format(I).replace(",", ".") + " J="+ new DecimalFormat("#.#").format(laco1).replace(",", ".") );
					laco1 += .2;
					break;
				case 1:
					System.out.println("I=" + new DecimalFormat("#.#").format(I).replace(",", ".") + " J="+ new DecimalFormat("#.#").format(laco2).replace(",", ".") );
					laco2 += .2;
					break;
				case 2:
					System.out.println("I=" + new DecimalFormat("#.#").format(I).replace(",", ".") + " J="+ new DecimalFormat("#.#").format(laco3).replace(",", ".") );
					laco3 += .2;
					break;
				}
			}
			I += .2;

		}
		
	}

}
