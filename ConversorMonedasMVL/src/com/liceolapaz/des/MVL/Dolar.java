package com.liceolapaz.des.MVL;

public class Dolar implements Moneda {
double cantidad;
	
	public double calcularEnEuros() {
		 return cantidad* 0.883509299;
	}

}
