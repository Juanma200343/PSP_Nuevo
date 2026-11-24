package BoletinSemáforos.ejercicio1.controller;

import BoletinSemáforos.ejercicio1.modelo.Cuenta;
import BoletinSemáforos.ejercicio1.modelo.HiloCuenta;
import BoletinSemáforos.ejercicio1.modelo.SemaforoBinario;

public class GestionaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta = new Cuenta(1000);
		SemaforoBinario semaforo = new SemaforoBinario();
		
		HiloCuenta c1 = new HiloCuenta(semaforo, cuenta, "Cuenta 1");
		HiloCuenta c2 = new HiloCuenta(semaforo, cuenta, "Cuenta 2");

		Thread h1 = new Thread(c1);
		Thread h2 = new Thread(c2);

		h1.start();
		h2.start();

	
	}

}
