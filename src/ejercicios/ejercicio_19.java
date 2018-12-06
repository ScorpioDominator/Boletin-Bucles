package ejercicios;

import java.util.Scanner;

public class ejercicio_19 {
	public static void main(String[] args) {
		
		int UserNumber, columna=1, fila=1, number=1;
		String space=" ", miCadena="";
		Scanner keyboard=new Scanner(System.in);
	
		System.out.println("Introduce un número");
		UserNumber=keyboard.nextInt();
	
		for (columna=1; columna<=UserNumber; columna++) { 
		miCadena=""; number= 1; 
			for (fila=1; fila<=UserNumber; fila++) {
				if(fila<=(UserNumber-columna)) {
				miCadena+=space;
				}
				else {
				miCadena+=space;
				miCadena+=number;
				number++;
				}
			
			
		}
		System.out.println(miCadena);
	}
	
	keyboard.close();
	
	}

}

