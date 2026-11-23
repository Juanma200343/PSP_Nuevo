package ejemploHilos;

public class HiloPadre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hilo hilo1 = new Hilo("Hilo 1");
		Hilo hilo2 = new Hilo("Hilo 2");
		
		Thread h1 = new Thread(hilo1);
		Thread h2 = new Thread(hilo2);
		
		h1.start();
		h2.start();


	}

}
