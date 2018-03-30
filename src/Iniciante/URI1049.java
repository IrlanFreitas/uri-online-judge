package Iniciante;

import java.util.Scanner;

public class URI1049 {

	public static void main(String[] args) {

	}

	public static void resolvidoSimples() {
		String tipo1, tipo2, tipo3;
		
		Scanner sc = new Scanner(System.in);
		tipo1 = sc.nextLine();
		tipo2 = sc.nextLine();
		tipo3 = sc.nextLine();
		
		if (tipo1.equals("vertebrado")) {
			if (tipo2.equals("ave")) {
				if (tipo3.equals("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (tipo3.equals("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if (tipo2.equals("inseto")) {
				if (tipo3.equals("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (tipo3.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		}
		
		sc.close();
	}
	
	public static void resolvidoComplicado(){
		
		/*String tipo1, tipo2, tipo3;
		
		Scanner sc = new Scanner(System.in);
		tipo1 = sc.nextLine();
		tipo2 = sc.nextLine();
		tipo3 = sc.nextLine();
		
		System.out.println();
		
		sc.close();*/
	}

}	
