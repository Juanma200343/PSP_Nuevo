package Tema2.BoletinMonitores.ejercicio1.Hilo;

public class CuentaVocales implements Runnable {

	private int ContadorVocalesTotales;
	private String vocal;
	private int numVocales;
	
	public CuentaVocales(String vocal, String cadena) {
		super();
		ContadorVocalesTotales = 0;
		this.vocal = vocal;
		this.numVocales = 0;
	}
	
	public void buscarVocal() {
		
		
	
	}

	public synchronized void incrementaVocales(int numVocales) {
		ContadorVocalesTotales =  ContadorVocalesTotales + numVocales;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	

}
