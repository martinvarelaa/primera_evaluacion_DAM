package com.liceolapaz.des.MVL;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		while (true) {

			escribirMenu();

			System.out.print("Escoja opción: ");
			int opcion1 = opcionMenu();

			if (opcion1 > 4 | opcion1 < 0) {
				System.out.println("Introduce un número entre 0 y 4\r\n" + "\r\n");
			}

			switch (opcion1) {

			case 0:
				System.out.println("Hasta pronto!!");
				System.exit(0);
				break;

			case 1: {
				pedirBase();
				double base = interpretarOpcion();
				pedirLado();
				double lado2 = interpretarOpcion();
				pedirLado();
				double lado3 = interpretarOpcion();
				pedirAltura();
				double altura = interpretarOpcion();
				Triangulo triangulo = new Triangulo(base, lado2, lado3, altura);
				double areaTriangulo = triangulo.calcularArea();
				double perimetroTriangulo = triangulo.calcularPerimetro();

				System.out.println("El área del Triángulo es = " + areaTriangulo + "\r\n"
						+ "El perímetro del Triángulo es = " + perimetroTriangulo + "\r\n");
				break;
			}

			case 2: {
				pedirBase();
				double base = interpretarOpcion();
				pedirAltura();
				double altura = interpretarOpcion();
				Rectangulo rectangulo = new Rectangulo(base, altura);
				double areaRectangulo = rectangulo.calcularArea();
				double perimetroRectangulo = rectangulo.calcularPerimetro();

				System.out.println("El área del Rectángulo es = " + areaRectangulo + "\r\n"
						+ "El perímetro del Rectángulo es = " + perimetroRectangulo + "\r\n");
				break;
			}
			case 3: {
				pedirApotema();
				double apotema = interpretarOpcion();
				pedirLado();
				double lado = interpretarOpcion();
				pedirNumeroLados();
				int nlados = opcionMenu();
				
				if (nlados < 5){
				System.out.print("Introduzca un número de lados superior a 4, si su figura tiene 4 lados o menos, seleccione otra figura." + "\r\n");
				}
				else {
				Poligono poligono = new Poligono(apotema, lado, nlados);	
				double perimetroPoligono = poligono.calcularPerimetro();
				double areaPoligono = poligono.calcularArea();
				System.out.println("El área del Polígono es = " + areaPoligono + "\r\n"
						+ "El períemtro del Polígono = " + perimetroPoligono + "\r\n");
				
				
				}
				break;
			}

			case 4: {
				pedirLado();
				double lado = interpretarOpcion();
				Rectangulo cuadrado = new Rectangulo(lado, lado);
				double areaCuadrado = cuadrado.calcularArea();
				double perimetroCuadrado = cuadrado.calcularPerimetro();
				System.out.println("El área del Cuadrado  es = " + areaCuadrado + "\r\n"
						+ "El perimetro del cuadrado es = " + perimetroCuadrado + "\r\n");
				break;
			}
			}

		}

	}

	private static void pedirNumeroLados() {
		System.out.print("Escriba el número de lados del polígono: ");
		
	}

	private static int opcionMenu() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static double interpretarOpcion() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();

	}

	private static void pedirApotema() {
		System.out.print("Introduzca apotema del Polígono: ");
	}

	private static void pedirAltura() {
		System.out.print("Introduzca la medida de la altura: ");

	}

	private static void pedirBase() {
		System.out.print("Introduzca la medida de la base: ");
	}

	private static void pedirLado() {
		System.out.print("Introduzca la medida de un lado: ");
	}

	private static void escribirMenu() {
		System.out.print(
				"1.Triángulo \r\n" + "2.Rectágulo \r\n" + "3.Polígono \r\n" + "4.Cuadrado \r\n" + "0. Salir" + "\r\n");

	}
}
