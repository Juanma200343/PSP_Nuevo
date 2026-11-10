package Boletin1.Ejercicio4.hilo;

public class Mascota implements Runnable{
	
	private String nombre;
	private int contadorVecesCome;
	
	

	public Mascota(String nombre) {
		super();
		this.nombre = nombre;
		this.contadorVecesCome = 0;
	}
	
	
	private void comer() {
		
		this.contadorVecesCome ++;
		System.out.println("La mascota con nombre: " + this.nombre + " " +"ha comenzado a comer.");
		try {
			Thread.sleep(this.contadorVecesCome * 1000);
			System.out.println("La mascota con nombre: " + this.nombre + " " +"ha terminado de comer");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.comer();
		
	}

}
