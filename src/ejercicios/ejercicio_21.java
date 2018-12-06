package ejercicios;

import static ejercicios.Colores.FONDO_BLANCO;
import static ejercicios.Colores.FONDO_NEGRO;
import static ejercicios.Colores.NEGRO;
import static ejercicios.Colores.RESET;
public class ejercicio_21 {

	public static void main(String[] args) {
		int ChessNumber=8, columna=1, fila=1;
		String star=" *", space="  ", miCadena="", Negrohoyga=NEGRO;
	

		for (columna=1; columna<=ChessNumber; columna++) {
			for (fila=1; fila<=ChessNumber; fila++) {
				if(fila%2==0) {
					if (columna%2==0) {
						System.out.print(FONDO_NEGRO+space+RESET);
					}
					else 
					{System.out.print(FONDO_BLANCO+space+RESET);}
					}
				 if (fila%2!=0) {
					if (columna%2==0) {
						{System.out.print(FONDO_BLANCO+space+RESET);}
					}
					else {
						System.out.print(FONDO_NEGRO+space+RESET);
					}
					
				}
				
				
			
			}
			System.out.print("\n");
			
			
				
				
		
		}
			

	}
	

}


