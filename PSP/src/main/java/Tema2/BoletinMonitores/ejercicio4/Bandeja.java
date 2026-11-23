package BoletinMonitores.ejercicio4;

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
		
	}
	
	public synchronized void quitoPlato() {
		
	}
	
}
