package ejercicios;

import java.util.Scanner;

public class ejercicio_16 {

	public static void main(String[] args) {
		
		int number, resto, realnumber;
		
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("Introduce un número");
		number=keyboard.nextInt();
		realnumber=number;
		
		while (number>=1) {
			
			resto=number%=10;
			realnumber/=10;
			number=realnumber;
			
			System.out.print(resto);
		}
		
		keyboard.close();

	}
	

}
