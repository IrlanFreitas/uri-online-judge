package Iniciante;

import java.util.Scanner;

public class URI1871 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		
		String[] valores = line.split(" ");
		
		int total = Integer.parseInt(valores[0]) + Integer.parseInt(valores[1]);
		
		if (total != 0)
		System.out.println( String.valueOf(total).replaceAll("0", ""));
		
		scan.close();
		
	}
	
}
