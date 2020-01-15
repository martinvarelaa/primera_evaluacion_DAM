package com.liceolapaz.des.MVL;

public class Libras implements Moneda {
double cantidad;

	public double calcularEnEuros() {
		return cantidad*1.1029861;
	}

}
