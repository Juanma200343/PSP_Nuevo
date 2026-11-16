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
		System.out.println(Thread.currentThread().getName() +" "+ "La mascota con nombre: " + this.nombre + " " +"ha comenzado a comer.");
		try {
			Thread.sleep(this.contadorVecesCome * 500);
			this.contadorVecesCome = this.contadorVecesCome +1;
		
			System.out.println(Thread.currentThread().getName()+" " + "La mascota con nombre: " + this.nombre + " " +"ha terminado de comer" + ": " + this.contadorVecesCome);
			
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
