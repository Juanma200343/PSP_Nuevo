package Boletin1.Ejercicio8.hilos;

public class Hilo extends Thread {
	private String nombreHilo;


	public Hilo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
			this.nombreHilo = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(Thread.currentThread().isInterrupted()) {
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
