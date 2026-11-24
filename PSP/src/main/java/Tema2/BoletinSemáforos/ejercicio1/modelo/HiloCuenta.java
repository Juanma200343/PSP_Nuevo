package BoletinSemáforos.ejercicio1.modelo;

public class HiloCuenta implements Runnable{

	private SemaforoBinario semaforo;
	private Cuenta cuenta;
	private String nombreCajero;
	
	public HiloCuenta(SemaforoBinario semaforo, Cuenta cuenta, String nombreCajero) {
		super();
		this.semaforo = semaforo;
		this.cuenta = cuenta;
		this.nombreCajero = nombreCajero;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			semaforo.adquirir();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		
		try {
			cuenta.consultaDatos(nombreCajero);
		
		} finally {
	        semaforo.liberar();
		}
		
	}
	

}
 