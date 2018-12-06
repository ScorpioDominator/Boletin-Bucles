package ejercicios;

import java.util.Scanner;

public class ejercicio_8 {

	public static void main(String[] args) {
		
		
		int a, b, número1, número2;
		Scanner keyboard=new Scanner(System.in);
		
		/*1-Le pedimos al usuario el primer número*/
		System.out.println("inserta el primer número");
		número1=keyboard.nextInt();
		keyboard.nextLine();
		/*2-Le pedimos al usuario un segundo número*/
		System.out.println("Inserta el segundo número");
		número2=keyboard.nextInt();
		
		
		/*El algoritmo se encarga de duplicar el primer número y de poner a la mitad el segundo*/
		for (a=número1, b=número2; a<=b; a*=2, b/=2){
			/*Mostramos en pantalla el proceso*/
			System.out.printf("a=%d b=%d %n",a,b);
			}
		
//		while (a<b) {
//			
//			a*=2; b/=2;
//			
//			System.out.printf("a=%d b=%d %n", a,b);
//			}
		
		keyboard.close();
		
	}
}

