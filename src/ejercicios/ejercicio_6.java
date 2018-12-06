package ejercicios;

import java.util.Scanner;

public class ejercicio_6 {

	public static void main(String[] args) {
		
		int number1, number2,operation, increase=1, continue1, continue2=1;
	
		
		Scanner keyboard=new Scanner(System.in);
		
		while (continue2<=2) {
			while (increase<=2) {
				
	/*1-Le pedimos el primer número al usuario*/
		
		{System.out.println("Introduzca el primer número");
		number1=keyboard.nextInt();
		keyboard.nextLine();
		/*Le pedimos el segundo número al usuario*/
		System.out.println("Introduzca el segundo número");
		number2=keyboard.nextInt();
		keyboard.nextLine();
		/*Le hacemos elegir entre varias opciones para la operación que desea realizar*/
		System.out.println("Introduzca 1, para sumar, introduzca 2 para restar, introduzca 3"
				+"para multiplicar, introduzca 4 para dividir");
		operation=keyboard.nextInt();
		
		/*2-Realizamos la operación deseada*/
		
			if (operation==1) {
				System.out.println(number1+number2);
				increase+=2;
				}
			else if (operation==2) {
				System.out.println(number1-number2);
				increase+=2;
			}
			else if (operation==3) {
				System.out.println(number1*number2);
				increase+=2;
			}
			else if (operation==4) {
				System.out.println(number1/number2);
				increase+=2;
			}
			else {
				System.out.println("Operador no disponible");
				increase+=2;
				
			}
		}
		/*3-Le preguntamos al usuario si desea continuar operando*/
		System.out.println("pulsa 0 para continuar y 1 para finalizar");
		continue1=keyboard.nextInt();
		
		/*3.1-En caso de que así sea que vuelva al menú principal*/
			if (continue1<=0) {
				increase-=2;
				}
			/*3.2-En caso de lo contrario que el programa se cierre*/
			else if(continue1==1) {
				continue2+=2;
				}
			else {
				System.out.println("Error de entrada");
				keyboard.close();
			}
			
			}
		}
	}
	
}
		
	


