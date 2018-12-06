package ejercicios;

import java.util.Scanner;

public class ejercicio_10 {

	public static void main(String[] args) {
		
		int repeat=2, x=1, n;
		Scanner keyboard=new Scanner(System.in);
		
		/*Le pedimos al usuario un número*/
		
		System.out.println("inserta un número");
		n=keyboard.nextInt();
		
		/*El algoritmo se encara de realizar la operación del factorial*/
		
		while (repeat<=n) {
			x*=repeat;
			repeat++;
			
			
		}
		/*Mostramos por pantalla el resultado*/
		System.out.println(x);
		keyboard.close();
	}

}
