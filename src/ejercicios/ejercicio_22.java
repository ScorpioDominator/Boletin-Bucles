package ejercicios;

import static ejercicios.Colores.FONDO_BLANCO;
import static ejercicios.Colores.FONDO_NEGRO;
import static ejercicios.Colores.FONDO_ROJO;
import static ejercicios.Colores.FONDO_VERDE;
import static ejercicios.Colores.RESET;

import java.util.Scanner;

public class ejercicio_22 {

	public static void main(String[] args) {
		int ChessNumber = 8, columna = 1, fila = 1, x, y;
		String space = "  ", alfil = " A";

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Declare un número");
		x = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Declare otro número");
		y = keyboard.nextInt();
		keyboard.nextLine();

		for (columna = 1; columna <= ChessNumber; columna++) {
			for (fila = 1; fila <= ChessNumber; fila++) {

				if (x == columna && y == fila) {
					System.out.print(FONDO_VERDE + alfil + RESET);
				} 
				else if (Math.abs(x - columna) == Math.abs(y - fila)) {
					System.out.print(FONDO_ROJO + space + RESET);
				} 
				else {
					if (fila % 2 == 0) {

						if (columna % 2 == 0) {
							System.out.print(FONDO_NEGRO + space + RESET);
						} 
						else {
							System.out.print(FONDO_BLANCO + space + RESET);
						}
					}
					if (fila % 2 != 0) {
						
						if (columna % 2 == 0) {
							
							System.out.print(FONDO_BLANCO + space + RESET);
							}
						
						else {
							System.out.print(FONDO_NEGRO + space + RESET);
						}

					}

				}

			}
			System.out.print("\n");

		}
		keyboard.close();

	}

}
