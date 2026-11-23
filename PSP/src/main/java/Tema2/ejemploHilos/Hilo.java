package ejemploHilos;

public class Hilo implements Runnable {
	
	private String nombreHilo;
	
	public Hilo(String name) {
		super();
		// TODO Auto-generated constructor stub
		this.nombreHilo = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Entro en el hilo: " + this.nombreHilo);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
