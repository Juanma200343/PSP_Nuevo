package Boletin1.Ejercicio1.main;

import java.util.ArrayList;
import java.util.List;

import Boletin1.Ejercicio1.hilos.*; 
	
public class Ejercicio1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Thread.State> estadosHilo1 = new ArrayList();
		
		Hilo1 hilo1 = new Hilo1("PROCESOS");
		Hilo1 hilo2 = new Hilo1("SERVICIOS");
		
		Thread h1 = new Thread(hilo1);
		Thread h2 = new Thread(hilo2);

		h1.start();
		estadosHilo1.add(h1.getState());

		h2.start();

		try{
			Thread.currentThread().sleep(5000);
			estadosHilo1.add(h1.getState());
			System.out.println(estadosHilo1);
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		

	}

}
