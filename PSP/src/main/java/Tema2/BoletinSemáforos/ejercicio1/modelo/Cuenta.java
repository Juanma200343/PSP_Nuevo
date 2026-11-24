package BoletinSemáforos.ejercicio1.modelo;


public class Cuenta{
	private int saldo;
	
	public Cuenta(int saldo) {
		super();
		this.saldo = 0;
	}

	public void consultaDatos(String nombreHilo) {
		System.out.println(nombreHilo + " esta consultando Datos");
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		System.out.println(nombreHilo + " ha terminado de consultar");
	}
}
