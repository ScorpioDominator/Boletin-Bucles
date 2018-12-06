package ejercicios;

import java.util.Scanner;

public class ejercicio_12 {

	public static void main(String[] args) {
		
		int m, a0=0, a1=1, an=0;
		Scanner keyboard=new Scanner(System.in);
		
		/*1-Le pedimos al usuario un número*/

		System.out.println("inserta un número");
		m=keyboard.nextInt();
		keyboard.nextLine();
		
		/*2-El algoritmo se encarga de encontrar el número de la serie de Fibonacci superior al parámetrp introducido*/
		
		while (an<=m) {
			an=a0+a1;
			a0=a1;
			a1=an;
			
		}
		/*3-Imprimimos en pantalla el valor deseado*/

		keyboard.close();
		System.out.printf("el valor superior a m perteneciente a la serie de fibonacci es= %d %n", an);

	}

}
