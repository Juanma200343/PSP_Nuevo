package Tema2.ejemploHilos.seccionCritica;

class Contador {
   private int valor = 0;
   public synchronized void incrementar() { 
       valor++;
       //System.out.println(nombreHilo);
   }
   public int getValor() {
       return valor;
   }
}
class TareaIncremento implements Runnable {
   private Contador contador;
  
   public TareaIncremento(Contador contador) {
       this.contador = contador;
   }
   @Override
   public void run() {
       for (int i = 0; i < 100000; i++) {
           contador.incrementar();
       }
   }
}
