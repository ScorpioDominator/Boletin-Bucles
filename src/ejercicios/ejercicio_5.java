package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		
		int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,b1,b2, total=1;
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Escribe el primer número del rango a buscar");
		b1=keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Escribe el segundo número del rango a buscar");
		b2=keyboard.nextInt();
		keyboard.close();
		
		Random numAl=new Random();
		
		/*generar 5 números aleatorios*/
		
		a1=(numAl.nextInt(b1-b2+1)+1);
		a2=(numAl.nextInt(b1-b2+1)+1);
		a3=(numAl.nextInt(b1-b2+1)+1);
		a4=(numAl.nextInt(b1-b2+1)+1);
		a5=(numAl.nextInt(b1-b2+1)+1);
		a6=(numAl.nextInt(b1-b2+1)+1);
		a7=(numAl.nextInt(b1-b2+1)+1);
		a8=(numAl.nextInt(b1-b2+1)+1);
		a9=(numAl.nextInt(b1-b2+1)+1);
		a10=(numAl.nextInt(b1-b2+1)+1);
		a11=(numAl.nextInt(b1-b2+1)+1);
		a12=(numAl.nextInt(b1-b2+1)+1);
		a13=(numAl.nextInt(b1-b2+1)+1);
		a14=(numAl.nextInt(b1-b2+1)+1);
		a15=(numAl.nextInt(b1-b2+1)+1);
		
		while (total<=15) {
		System.out.println(a1);
		total++;
		System.out.println(a2);
		total++;
		System.out.println(a3);
		total++;
		System.out.println(a4);
		total++;
		System.out.println(a5);
		total++;
		System.out.println(a6);
		total++;
		System.out.println(a7);
		total++;
		System.out.println(a8);
		total++;
		System.out.println(a9);
		total++;
		System.out.println(a10);
		total++;
		System.out.println(a11);
		total++;
		System.out.println(a12);
		total++;
		System.out.println(a13);
		total++;
		System.out.println(a14);
		total++;
		System.out.println(a15);
		total++;
		
		
		}

	}

}
