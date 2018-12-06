package ejercicios;

import java.util.Scanner;

public class Ejercicio_20_1 {

	public static void main(String[] args) {
		
		
		int numFilas;
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Deme un número hoyga");
		numFilas=keyboard.nextInt();
		
		for (int fila=1; fila<=numFilas; fila++) {
			
			for (int i=1; i<=numFilas-fila;i++) {
				System.out.print(' ');
			}
			for (int i=1; i<=fila; i++) {
				System.out.print(i);
				
			}
			for (int i=fila-1; i>=1; i--) {
				System.out.print(i);
				
			}
			System.out.println();
			
		}
		
		keyboard.close();
	}


}
