package Iniciante;

import java.util.Scanner;

public class URI1114 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    while (true) {
	    	
	        if(scanner.nextLine().equals("2002")){
	        	System.out.println("Acesso Permitido");
	            break;
	        } else {
	        	System.out.println("Senha Invalida");
	        }
	    }
	    
	    scanner.close();
	    
	}
	
	
	

}
