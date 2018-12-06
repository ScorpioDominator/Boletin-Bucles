package ejercicios;

import java.util.Scanner;

public class ejercicio_7 {

	public static void main(String[] args) {
		
		int a, b, par=0, impar=0;
		
		Scanner keyboard=new Scanner(System.in);
		
		/*1-Le pedimos un número al usuario*/
		
		System.out.println("declara un número");
		
		a=keyboard.nextInt();
		keyboard.nextLine();
		
		/*2-Le pedimos un segundo número*/
		
		System.out.println("declara un número");
		b=keyboard.nextInt();
		
		/*3-El algoritmo se encarga de encontrar los pares y los impares comprendidos en el rango introducido*/
		
		while (a<=b) {
			
			if (a%2==0) {
				par++;
				}
			else if (a%2!=0) {
			impar++;
			}
			a++;
			
		}
		/*4-Mostramos en pantalla la cantidad de números pares e impares que se comprenden en el rango dado*/
			System.out.printf("el número de pares es=%d %n",par);
			System.out.printf("el número de pares es=%d %n",impar);
			keyboard.close();
	}

}
