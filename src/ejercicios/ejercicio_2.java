package ejercicios;
import java.util.Scanner;

public class ejercicio_2 {

	public static void main(String[] args) {
		
		int x, y, z, w;
		Scanner keyboard=new Scanner(System.in);
		/*Pedir dos números*/
		
		System.out.println("introduce un número");
		x=keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Introduce el segundo número");
		y=keyboard.nextInt();
		keyboard.close();
		z=x*y;
		w=x;
		/*Sumar el primer número tantas veces como indique el segundo*/
		while (x<=z) {
		if (x==z) {System.out.println(x);}
		x+=w;
	}

	}

}

