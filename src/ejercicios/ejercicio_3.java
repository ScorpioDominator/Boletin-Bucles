package ejercicios;

import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		
		int nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8, nota9, nota10, repetir=1, 
				deficiente=0, insuficiente=0, suficiente=0, bien=0, notable=0, sobresaliente=0;
		
		
		Scanner keyboard=new Scanner(System.in);
		
		/*Pedir 10 notas y mostrar la calificación*/
		System.out.println("primera nota");
		nota1=keyboard.nextInt();
		System.out.println("segunda nota");
		nota2=keyboard.nextInt();
		System.out.println("tercera nota");
		nota3=keyboard.nextInt();
		System.out.println("cuarta nota");
		nota4=keyboard.nextInt();
		System.out.println("quinta nota");
		nota5=keyboard.nextInt();
		System.out.println("sexta nota");
		nota6=keyboard.nextInt();
		System.out.println("séptima nota");
		nota7=keyboard.nextInt();
		System.out.println("octava nota");
		nota8=keyboard.nextInt();
		System.out.println("novena nota");
		nota9=keyboard.nextInt();
		System.out.println("décima nota");
		nota10=keyboard.nextInt();
		
		while (repetir<=10) {
			if (nota1<=2) {
				deficiente++;
				}
			else if ((nota1==3) || (nota1==4)) {
				suficiente++;
				}
			else if (nota1==5) {
				suficiente++;
			}
			else if (nota1==6) { 
				bien++;
			}
			else if ((nota1==7) || (nota1==8)) {
				notable++;
			}
			else if ((nota1==9) || (nota1==10)) {
				sobresaliente++;
			}
			repetir++;
			
				if (nota2<=2) {
					deficiente++;
					}
				else if ((nota2==3) || (nota2==4)) {
					insuficiente++;
					}
				else if (nota2==5) {
					suficiente++;
				}
				else if (nota2==6) { 
					bien++;
				}
				else if ((nota2==7) || (nota2==8)) {
					notable++;
				}
				else if ((nota2==9) || (nota2==10)) {
					sobresaliente++;
				}
				repetir++;
				
				if (nota3<=2) {
					deficiente++;
					}
				else if ((nota3==3) || (nota3==4)) {
					insuficiente++;
					}
				else if (nota3==5) {
					suficiente++;
				}
				else if (nota3==6) { 
					bien++;
				}
				else if ((nota3==7) || (nota3==8)) {
					notable++;
				}
				else if ((nota3==9) || (nota4==10)) {
					sobresaliente++;
				}
				
				repetir++;
				
				if (nota4<=2) {
					deficiente++;
					}
				else if ((nota4==3) || (nota4==4)) {
					insuficiente++;
					}
				else if (nota4==5) {
					suficiente++;
				}
				else if (nota4==6) { 
					bien++;
				}
				else if ((nota4==7) || (nota4==8)) {
					notable++;
				}
				else if ((nota4==9) || (nota4==10)) {
					sobresaliente++;
				}
				
				repetir++;
				
				if (nota5<=2) {
					deficiente++;
					}
				else if ((nota5==3) || (nota5==4)) {
					insuficiente++;
					}
				else if (nota5==5) {
					suficiente++;
				}
				else if (nota5==6) { 
					bien++;
				}
				else if ((nota5==7) || (nota5==8)) {
					notable++;
				}
				else if ((nota5==9) || (nota5==10)) {
					sobresaliente++;
				}
				repetir++;
				
				if (nota6<=2) {
					deficiente++;
					}
				else if ((nota6==3) || (nota6==4)) {
					insuficiente++;
					}
				else if (nota6==5) {
					suficiente++;
				}
				else if (nota6==6) { 
					bien++;
				}
				else if ((nota6==7) || (nota6==8)) {
					notable++;
				}
				else if ((nota6==9) || (nota6==10)) {
					sobresaliente++;
				}
				repetir++;
				
				if (nota7<=2) {
					deficiente++;
					}
				else if ((nota7==3) || (nota7==4)) {
					insuficiente++;
					}
				else if (nota7==5) {
					suficiente++;
				}
				else if (nota7==6) { 
					bien++;
				}
				else if ((nota7==7) || (nota7==8)) {
					notable++;
				}
				else if ((nota7==9) || (nota8==10)) {
					sobresaliente++;
				}
				repetir++;
				if (nota8<=2) {
					deficiente++;
					}
				else if ((nota8==3) || (nota8==4)) {
					insuficiente++;
					}
				else if (nota8==5) {
					suficiente++;
				}
				else if (nota8==6) { 
					bien++;
				}
				else if ((nota8==7) || (nota8==8)) {
					notable++;
				}
				else if ((nota8==9) || (nota8==10)) {
					sobresaliente++;
				}
				repetir++;
				
				if (nota9<=2) {
					deficiente++;
					}
				else if ((nota9==3) || (nota9==4)) {
					insuficiente++;
					}
				else if (nota9==5) {
					suficiente++;
				}
				else if (nota9==6) { 
					bien++;
				}
				else if ((nota9==7) || (nota9==8)) {
					notable++;
				}
				else if ((nota9==9) || (nota9==10)) {
					sobresaliente++;
				}
				repetir++;
				
				if (nota10<=2) {
					deficiente++;
					}
				else if ((nota10==3) || (nota10==4)) {
					insuficiente++;
					}
				else if (nota10==5) {
					suficiente++;
				}
				else if (nota10==6) { 
					bien++;
				}
				else if ((nota10==7) || (nota10==8)) {
					notable++;
				}
				else if ((nota10==9) || (nota10==10)) {
					sobresaliente++;
				}
				repetir++;
		}
		/*mostrar el resultados*/
				System.out.printf("numeros de deficientes=%d %n",deficiente);
				System.out.printf("numeros de insuficientes= %d %n",insuficiente);
				System.out.printf("numeros de suficientes= %d %n", suficiente);
				System.out.printf("numeros de bien= %d %n", bien);
				System.out.printf("numeros de notable= %d %n",notable);
				System.out.printf("numeros de sobresaliente= %d %n",sobresaliente);
				keyboard.close();
	}

}
