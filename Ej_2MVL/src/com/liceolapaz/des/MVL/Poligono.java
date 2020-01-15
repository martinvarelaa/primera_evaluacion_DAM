package com.liceolapaz.des.MVL;

public class Poligono extends FigGeometrica {

	private double lado;
	private double apotema;
	private int nlados;
	
	

	public Poligono(double lado, double apotema, int nlados ) {
		this.lado = lado;
		this.apotema = apotema;
		this.nlados = nlados;
		
	}

	public double calcularPerimetro(){
		return (lado*nlados);
	}

	public double calcularArea() {
		return ((apotema * lado* nlados)/2);
	}

}


