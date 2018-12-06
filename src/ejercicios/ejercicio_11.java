package ejercicios;

import java.util.Scanner;

public class ejercicio_11 {

	public static void main(String[] args) {
		
		
		int repeat=1, m, n=0;
		Scanner keyboard=new Scanner(System.in);
		
		/*1-Le pedimos al usuario un número*/
		System.out.println("inserta un número");
		m=keyboard.nextInt();
		keyboard.nextLine();
		
		/*2-Una vez que tenemos el número el algoritmo se encarga de calcular la suma correspondiente*/
		while (n<=m) {
			n+=repeat-1;
			repeat++;
			
		}
		/*3-Imprimimos en pantalla el valor deseado*/
		System.out.printf("la suma mayor que m es= %d %n", repeat-2);
		keyboard.close();


	}

}
