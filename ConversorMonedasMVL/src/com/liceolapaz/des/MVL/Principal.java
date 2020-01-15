package com.liceolapaz.des.MVL;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		while (true) {
			System.out.print(
					"CONVERSOR DE MONEDAS \r\n 1.Dólares \r\n 2.Libras \r\n 3.Yens\r\n 0.Salir \r\nIntroducir opción: ");
			Scanner sc = new Scanner(System.in);
			int opcion = sc.nextInt();

			switch (opcion) {

			case 0:
				System.out.println("Hasta pronto!");
				System.exit(0);

			case 1:
				Dolar dolar = new Dolar();
				introducirCantidad();
				dolar.cantidad = sc.nextInt();
				double dolaresEnEur = dolar.calcularEnEuros();
				System.out.println(
						dolar.cantidad + " dolares equivalen a " + String.format("%.2f", dolaresEnEur) + " euros.");
				break;

			case 2:
				Libras libras = new Libras();
				introducirCantidad();
				libras.cantidad = sc.nextInt();
				double librasEnEur = libras.calcularEnEuros();
				System.out.println(
						libras.cantidad + " libras equivalen a " + String.format("%.2f", librasEnEur) + " euros.");
				break;

			case 3:
				Yen yen = new Yen();
				introducirCantidad();
				yen.cantidad = sc.nextInt();
				double yenEnEur = yen.calcularEnEuros();
				System.out.println(yen.cantidad + " yens equivalen a " + String.format("%.2f", yenEnEur) + " euros.");
				break;
			default:

				System.out.println("Error, introduzca un número válido");
			}

		}

	}

	private static void introducirCantidad() {
		System.out.print("Introducir cantidad: ");
	}

}
