package com.liceolapaz.des.MVL;

import java.util.Scanner;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		while (true) {
			escribirMenu();// Escribir el menú del juego

			pedirOpcion();// Pedir Opcion

			int opcion = leerOpcion();// Leer opci�n y guardar variable

			// Según la opción marcada, ejecutar una opción

			if (opcion == 1) { // Si la opción es 1:

				// Crear lista de jugadas
				String[] jugadasArray = new String[6]; // Para ello, hace falta declarar y asignar memoria a un
														// Array(lista
														// de objetos comunes)
				jugadasArray[1] = "Piedra";
				jugadasArray[2] = "Papel";
				jugadasArray[3] = "Tijera";
				jugadasArray[4] = "Lagarto";
				jugadasArray[5] = "Spock";

				// Generar un número aleatorio del 1 al 5. // Fuente:
				// https://www.quora.com/How-do-I-pick-up-a-random-string-from-an-array-of-strings-in-Java

				Random generadorNumeroAleatorio = new Random(); // Constructor de generadores de números aleatorios.
				int aleatorio = generadorNumeroAleatorio.nextInt(5 - 1 + 1) + 1; // Creando un generador de número
																					// aleatorio del 1 al 5.

				escribirMenuJugada(); // Escribir menú de elección de jugad

				System.out.print("Escoja una opción: \r\n"); // Pedir Opcion de jugada

				int opcionJugador = leerOpcion(); // Leer opción de jugada y extraer del array

				if (opcionJugador < 0 | opcionJugador > 5) { // Usar esa opcion de jugada y compararla con la extraida
																// del array, abarcando todas las posibilodades de
																// entrada posibles
					System.out.println("Error, introduce un número entre el 0 y el 5");
				} else if (opcionJugador == aleatorio) {
					System.out.println("Empate \r\n");
				} else if (aleatorio == 1 & (opcionJugador == 3 | opcionJugador == 4)) {
					System.out.println("Perdiste, la máquina jugó Piedra" + "\r\n");

				} else if (aleatorio == 2 & (opcionJugador == 1 | opcionJugador == 5)) {
					System.out.println("Perdiste, la máquina jugó Papel " + "\r\n");

				} else if (aleatorio == 3 & (opcionJugador == 2 | opcionJugador == 4)) {
					System.out.println("Perdiste, la máquina jugó Tijera " + "\r\n");

				} else if (aleatorio == 4 & (opcionJugador == 2 | opcionJugador == 5)) {
					System.out.println("Perdiste, la máquina jugó Lagarto " + "\r\n");

				} else if (aleatorio == 5 & (opcionJugador == 3 | opcionJugador == 1)) {
					System.out.println("Perdiste, la máquina jugó Spock" + "\r\n");

				} else if (opcionJugador == 0) {
					System.out.println("Vuelva pronto");
					System.exit(0);
				}

				else {
					System.out.println("Ganaste! La máquina juegó " + jugadasArray[aleatorio]);
				}
			}

			else if (opcion < 0 | opcion > 2) {
				System.out.println("Introduzca 1 o 2");
				continue;

			}

			// Si la opción es 2, el programa debe terminarse.
			else if (opcion == 0) {
				System.out.println("Vuelva pronto");
				System.exit(0);
			}

		}
	}

	private static void escribirMenuJugada() {
		System.out.println("Elija su jugada:\n" + "1.Piedra \n" + "2.Papel \n" + "3.Tijera \n" + "4.Lagarto \n"
				+ "5.Spock \n " + "0.Salir \r\n");

	}

	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		return opcion;

	}

	private static void escribirMenu() {
		System.out.println("PIEDRA PAPEL TIJERAS LAGARTO SPOCK\n" + "1. Jugar\n" + "0. Salir\n");

	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción: " + "\r\n");
	}

}
