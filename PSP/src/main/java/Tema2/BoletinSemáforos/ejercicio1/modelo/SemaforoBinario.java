package BoletinSemáforos.ejercicio1.modelo;

public class SemaforoBinario {
	private boolean estaLibre;
	
	public SemaforoBinario() {
		estaLibre = true;
	}
	
	public synchronized void adquirir() throws InterruptedException {
		while (!estaLibre) {
			wait();
		}
		estaLibre = false;
	}
	public synchronized void liberar() {
		estaLibre = true;
		notifyAll(); 
	}

}
