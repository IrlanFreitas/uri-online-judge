package Iniciante;

import java.util.Scanner;

public class URI1071 {

	public static void main(String[] args) {
			
		int num1, num2, totalImpares = 0;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num2++;
		while (num2 < num1) {
			if(num2 % 2 != 0){
				totalImpares += num2;
			}
			num2++;
		}
		System.out.println(totalImpares);
		sc.close();
	}

}
