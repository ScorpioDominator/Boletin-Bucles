package ejercicios;
import java.util.Scanner;

public class ejercicio_1 {public static void main(String[] args) {
	
	/*pedir número entre 0 y 10*/
int i=1, f;
Scanner keyboard=new Scanner(System.in);
System.out.println("escribe un número del 1 al 10");
f=keyboard.nextInt();
keyboard.close();

	/*mostrar en pantalla la tabla de multiplicar de dicho número*/

while ((i<=10) && (f>=0) && (f<=10)) {
	System.out.printf("%d x %d = %d %n", f,i, (f*i));
	i+=1;
	
}	

if ((f<0) || (f>10)) {
	System.out.println("este número no está permitido, crack");
}



}
 }




