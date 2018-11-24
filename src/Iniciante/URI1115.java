package Iniciante;

import java.util.Scanner;

public class URI1115 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    while (true) {
	        if(obterValores(scanner.nextLine())){
	            break;
	        }
	    }
	    scanner.close();
	    
	}
	
	public static boolean obterValores( String textoDigitado ) {
		
		String[] valores = textoDigitado.split(" ");

		int coordenadaX = Integer.parseInt(valores[0]);
		int coordenadaY = Integer.parseInt(valores[1]);
		
		if (coordenadaX == 0 || coordenadaY == 0) {
			return true;
		} else if (coordenadaX > 0 && coordenadaY > 0) {
			System.out.println("primeiro");
			return false;
		} else if (coordenadaX < 0 && coordenadaY > 0) {
			System.out.println("segundo");
			return false;
		} else if (coordenadaX < 0 && coordenadaY < 0) {
			System.out.println("terceiro");
			return false;
		} else {
			System.out.println("quarto");
			return false;
		}
		
	}

}
