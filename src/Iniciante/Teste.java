package Iniciante;

public class Teste {
	
	public static void main(String[] args) {
		
		double[] lista = { 3, 8, 4, 2, 6, 13, 9, 10, 12,  5 };
		double[] lista2 = new double[lista.length];
		
		for (int i = 0; i < lista.length; i++) {
			if ( i % 2 == 0 ) {
				lista2[i] = lista[i] * 3;
			} else {
				lista2[i] = lista[i] / 2;
			}
		}
		
		System.out.println("Lista 1");
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i]+ " ");
		}
		
		System.out.println("\nLista 2");
		for (int i = 0; i < lista2.length; i++) {
			System.out.print(lista2[i]+ " ");
		}
		
	}

}
