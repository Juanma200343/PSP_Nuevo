package Boletin1.Ejercicio1.hilos;

public class Hilo1 extends Thread {
	private String nombreHilo;


	public Hilo1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
			this.nombreHilo = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
		System.out.println(this.nombreHilo);
		try {
			Thread.sleep(500);
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
	}
	
	

}
