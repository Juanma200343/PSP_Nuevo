package Boletin1.Ejercicio4.controller;

import Boletin1.Ejercicio4.hilo.Mascota;

public class GestionaMascotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mascota m1 = new Mascota("lulú");
		/*Thread cuidador1 = new Thread(m1,"cuidador1");
		Thread cuidador2 = new Thread(m1,"cuidador2");
		Thread cuidador3 = new Thread(m1,"cuidador3");
		Thread cuidador4 = new Thread(m1,"cuidador4");
		Thread cuidador5 = new Thread(m1,"cuidador5");
		
		cuidador1.start();
		cuidador2.start();
		cuidador3.start();
		cuidador4.start();
		cuidador5.start();*/
	
		/*Ejercicio 5*/	
		for(int i = 0 ; i < 101 ; i++) {
			m1.run();
		}
	}

}
