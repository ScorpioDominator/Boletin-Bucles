package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_15 {

	public static void main(String[] args) {
		
		final String alpha="bcdfghjklmnpqrstvwxyz", vocal="aeiou";
		int parametroMenor=0, parametroMayor=9 , rango, repeat=1, repeat2=1, numAleatorio, 
				numAleatorio2, numAleatorio3, acertado, mayorMenor, mayorMenor2,
				paramVmayor=5, paramVmenor=1, rangoV, acertado2, paramAmayor=21, paramAmenor=1,
				mayorMenor3, rangoA, acertado3, repeat3=1;
		char yes, yes2;
		Boolean acierto=false, acierto2=false, acierto3=false;
		
		
		Scanner keyboard=new Scanner(System.in);
		Random numeroaleatorio= new Random();
		
		/*1-Le comunicamos al usuario que debe pensar un número para que la máquina lo pueda adivinar*/
		
		System.out.println("Piensa un número del 0 al 9 e intentare adivinarlo");
		
		while (repeat<=3) {
			
			rango=parametroMayor-parametroMenor;
			
			numAleatorio=numeroaleatorio.nextInt(rango)+parametroMenor;
			
			/*2-La máquina intentará adivinar el número y nos preguntará si ha acertado*/
			
			System.out.printf("El número que pensaste es; %d, ¿acerté?, si=0, no=1 %n",numAleatorio);
			
			acertado=keyboard.nextInt();
			keyboard.nextLine();
			if (acertado==0) {
				/*2.1-En caso de acertar nos dirá que ha ganado y seguiremos jugando*/
				System.out.println("Soy una IA superior a la inteligencia humana, por supuesto que he ganado, ¡que siga el juego!");
				repeat=4; acierto=true;
			}
			
			else if (acertado==1) {
				/*2.2-En caso de no acertar nos preguntará si el número que debe adivinar es mayor o menor al que ya ha dicho previamente*/
				System.out.printf("¿El número es mayor o menor que %d?, mayor=0, menor=1, %n", numAleatorio);
				mayorMenor=keyboard.nextInt();
				keyboard.nextLine();

				if (mayorMenor==0) {
				parametroMenor=numAleatorio;
				}
				else if (mayorMenor==1) {
					parametroMayor=numAleatorio;
				}
				
				repeat++;
				
				if (repeat==4 && acierto==false) {
					/*2.3-En caso de no acertar nos dirá que ha perdido y acabará el juego*/
					System.out.println("Mira me rindo, con humanos que no saben pensar en números como usted no merece la pena jugar");
				}
				
			}
		}
		/*3-Ahora se pasará a adivinar una vocal*/
		System.out.println("Piensa una vocal");
		if (acierto==true) {
			while (repeat2<=2) {
				rangoV=paramVmayor-paramVmenor;
				numAleatorio2=numeroaleatorio.nextInt(rangoV+1)+paramVmenor;
				yes=vocal.charAt(numAleatorio2);
				/*4-Ahora nos dirá una vocal y si ha acertado*/
				System.out.printf("¿la vocal es %c? 0:si, 1:no %n",yes);
				acertado2=keyboard.nextInt();
				keyboard.nextLine();
				if (acertado2==0) {
					/*4.1-En caso de acertar nos dirá que ha acertado y se sigue jugando*/
					System.out.println("Volví a acertar, como era de esperar");
					keyboard.nextLine();

					acierto2=true; repeat2=3;
				}
				
				else if (acertado2==1) {
					/*4.2-En caso de no acertar preguntará si se trata de una vocal anterior o posterior a la dada y lo sigue intentando*/
					System.out.printf("¿es %c posterior o anterior que la letra que pides? posterior:0, anterior:1 %n", yes);
					mayorMenor2=keyboard.nextInt();
					keyboard.nextLine();
				
				
				if (mayorMenor2==0) {
					paramVmenor=numAleatorio2;
				}
				else if (mayorMenor2==1) {
					paramVmayor=numAleatorio2;
				}
					
				}
				repeat2++;
				
				if (repeat2==3 && acierto2==false) {
					/*4.3-En caso de no acertar en 3 ocasiones la máquina automáticamente perderá*/
					System.out.println("Que he perdido dice... ¿No será que no sabes lo que son las vocales?");
				} 
				
				}
			/*5-Ahora se pasará a adivinar una consonante*/
			
			System.out.println("Piensa en una consonante");
			
			if (acierto2==true) {
				while (repeat3<=5) {
					rangoA=paramAmayor-paramAmenor;
					numAleatorio3=numeroaleatorio.nextInt(rangoA+1)+paramAmenor;
					yes2=alpha.charAt(numAleatorio3);
					/*6-Ahora nos dirá una consonante y si ha acertado*/
					System.out.printf("¿la consonante es %c? 0:si, 1:no %n",yes2);
					acertado3=keyboard.nextInt();
					if (acertado3==0) {
						/*6.1-En caso de acertar nos dirá que ha acertado y se sigue jugando*/
						System.out.println("Ganar a insignificantes humanos es demasiado fácil...");
						acierto3=true; repeat3=6;
					}
					
					else if (acertado3==1) {
						/*6.2-En caso de no acertar en 3 ocasiones la máquina automáticamente perderá*/
						System.out.printf("¿es %c mayor o menor que la letra que pides? mayor:0, menor:1 %n", yes2);
						mayorMenor3=keyboard.nextInt();
					
					
					if (mayorMenor3==0) {
						paramAmenor=numAleatorio3;
					}
					else if (mayorMenor3==1) {
						paramAmayor=numAleatorio3;
					}
						
					}
					repeat3++;
					
					if (repeat3==6 && acierto3==false) {
						/*6.3-En caso de no acertar en 3 ocasiones la máquina automáticamente perderá*/

						System.out.println("¿He perdido?, no puede ser, ¡NO COMPUTABLE!");
				
					}
				}
			}
		}
		keyboard.close();
	}
}

	


