package ejercicios;

import java.util.Scanner;

public class ejercicio_20 {

	public static void main(String[] args) {
		{
			
			int UserNumber, columna=1, fila=1, number=1, UserNumberC,
					UsNumbCol, UsNumbCol2;
			String space=" ", miCadena="";
			Scanner keyboard=new Scanner(System.in);
		
			System.out.println("Introduce un número");
			UserNumber=keyboard.nextInt();
			UserNumberC=(UserNumber*2)-1;
			UsNumbCol=UserNumber-columna;
			UsNumbCol2=UserNumberC-columna;
			
			for (columna=1; columna<=UserNumber; columna++) { 
				miCadena=""; number= 1; 
					for (fila=1; fila<=UserNumberC; fila++) {
					
			
						if(fila<=(UserNumber-columna)) {
							miCadena+=space;
						}
						else {
							miCadena+=number;
							number++;
						}
			
					
			}
				System.out.println(miCadena);
				
			} 
				
				
						
			keyboard.close();
					
			}
			
		}

}


	


