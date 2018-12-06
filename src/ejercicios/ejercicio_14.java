package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_14 {

	public static void main(String[] args) {
		
		int repeat=1, x, n, y, z, a, random;
		boolean acierto=false;
		Scanner keyboard=new Scanner(System.in);
		/*1-Le pedimos al usuario el primer número del rango*/

		System.out.println("inserta el primer número");
		x=keyboard.nextInt();
		keyboard.nextLine();
		/*2-Le pedimos al usuario el segundo número del rango*/
		System.out.println("Inserta el segundo número");
		n=keyboard.nextInt();
		keyboard.nextLine();
		
		Random numaleatorio= new Random(); 
		
		
		/*3-Una vez dados los rangos donde la máquina debe adivinar el número esta intenta adivinarlo*/
		
		while (repeat<=4) {
			
			y=n-x;
			Math.abs(y);
			random=numaleatorio.nextInt(y+1)+x;
			
			/*4-La máquina nos ofrece un número y debemos decirle si ha acertado o no*/
			System.out.printf("¿Es el número %d?, introduce 0 si es el número correcto o "
					+ "introduce 1 si no es correcto  %n", random );
			z=keyboard.nextInt();
			
			if (z==0) {
				/*4.1-En caso de acertar nos manda un mensaje diciendo que nos ha ganado*/
				System.out.println("¡Oh si, puedo leerte la mente insignificante humano!");
				repeat=5; acierto=true;
			}
			else if (z==1) {
				/*4.2-En caso de no acertar nos preguntará si es mayor o menor que el número que debe adivinar y volverá a intentarlo*/
				System.out.printf("¿Es menor o mayor que %d?, introduce 0 para mayor y 1 "
						+ "para menor %n", random);
				a=keyboard.nextInt();
				
				if (a==0) {
					x=random;
				}
				else if (a==1) {
					n=random;
				}
				repeat++;
			if (repeat==5 && acierto==false) {
				/*4.3-En caso de no haberlo acertado en 4 intentos nos comunicará que ha perdido*/

			System.out.println("No puede ser que pierda, has hecho trampa fijo");
				}
				
				}
			
			}
			
			keyboard.close();
			
		}

	

}
