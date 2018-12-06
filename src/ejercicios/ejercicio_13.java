package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_13 {

	public static void main(String[] args) {

		int repeat = 1, x, n, y, z, random;
		boolean acierto = false;
		Scanner keyboard = new Scanner(System.in);
		/*1-Le pedimos al usuario el primer número del rango*/
		System.out.println("inserta el primer número");
		x = keyboard.nextInt();
		keyboard.nextLine();
		/*2-Le pedimos al usuario el segundo número del rango*/
		System.out.println("Inserta el segundo número");
		n = keyboard.nextInt();
		keyboard.nextLine();

		Random numaleatorio = new Random();
		y = n - x;
		Math.abs(y); /*Math.abs es para dar un número en valor absoluto*/

		random = numaleatorio.nextInt(y + 1) + x;
		
		/*3-Le comunicamos al usuario que debe adivinar un número dentro de dicho rango*/

		while (repeat <= 4) {
			System.out.println("Adivina un número entre el primer número dado y el segundo");
			z = keyboard.nextInt();
			keyboard.nextLine();
			/*3.1- En caso de adivinar le decimos que ha ganado*/
			if (z == random) {
				System.out.println("¡Has ganado!");
				repeat = 5;
				acierto = true;
			} else if (z > random) {
				/*En caso de que el número introducido sea mayor que el que debe adivinar se le avisa de esto mismo*/
				System.out.println("El número dado es mayor que el que debes adivinar");
				/*En caso de que el número introducido sea menor que el que debe adivinar se le avisa de esto mismo*/
			} else if (z < random) {
				System.out.println("El número dado es menor que el que debes adivinar");
			}
			repeat++;
			/*En caso de no haberlo acertado en 5 intentos le comunicamos que ha perdido*/
			if (repeat == 5 && acierto == false) {
				System.out.println("Ha perdido, hoyga");
			}
		}
			
		keyboard.close();    
		
	}

}
