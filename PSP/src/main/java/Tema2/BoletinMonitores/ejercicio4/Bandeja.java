package Tema2.BoletinMonitores.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Bandeja {
	private int capacidad;
	List<String> bandejaPlatos;
	
	public Bandeja(List<String> bandejaPlatos) {
		super();
		this.capacidad = 3;
		this.bandejaPlatos = new ArrayList<String>();
	}
	
	public synchronized void  pongoPlato(String plato) {
		while(capacidad < 3) {
			bandejaPlatos.add(plato);
			notifyAll();
		} 
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*public synchronized int quitoPlato() {
		while(capacidad == 3) {
			//int quito = bandejaPlatos.remove();
			notifyAll();
			return quito;
		}
		wait();
	}*/
	
}
