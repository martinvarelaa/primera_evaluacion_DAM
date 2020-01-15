package com.liceolapaz.des.MVL;

public class Rectangulo extends FigGeometrica {
	private double base;
	private double altura;
	

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcularPerimetro() {
		 return((base * 2) + (altura * 2)); 
	}

	public double calcularArea() {
		return  base * altura;
	}

}
