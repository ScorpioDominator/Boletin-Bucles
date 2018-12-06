package ejercicios;

import java.util.Scanner;

public class ejercicio_9 {

	public static void main(String[] args) {
		
		int repeat=1, x, n, z;
		Scanner keyboard=new Scanner(System.in);
		
		/*1-Le pedimos al usuario el primer número*/
		System.out.println("inserta el número base");
		x=keyboard.nextInt();
		keyboard.nextLine();
		/*2-Le pedimos al usuario el segundo número*/
		System.out.println("Inserta el número exponente");
		n=keyboard.nextInt();
		
		z=x;
		
		/*3-El algoritmo se encararga de realizar el cálculo deseado*/
		
		while (repeat<=(n-1)) {
			x*=z; repeat++; 
			}
		/*4-Mostramos por pantalla el resultado de la operación*/
		System.out.println(x);
		keyboard.close();

	}

}
