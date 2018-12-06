package ejercicios;

import java.util.Scanner;

public class ejercicio_17 {
	public static void main(String[] args) {
	
		int UserNumber, columna=1, fila=1;
		String star=" *", space=" ", miCadena="";
		Scanner keyboard=new Scanner(System.in);
	
		System.out.println("Introduce un número");
		UserNumber=keyboard.nextInt();
	
		for (columna=1; columna<=UserNumber; columna++) { 
		miCadena=""; 
			for (fila=1; fila<=UserNumber; fila++) {
				if(fila<=(UserNumber-columna)) {
				miCadena+=space;
				}
				else {
				miCadena+=star;
				}
			
			
		}
		System.out.println(miCadena);
	}
	
	keyboard.close();
	
	}

}
