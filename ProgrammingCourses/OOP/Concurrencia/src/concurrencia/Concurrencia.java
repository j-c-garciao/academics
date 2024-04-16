package concurrencia;

public class Concurrencia extends Thread {
    int numero;

    Concurrencia(int n){ 
        this.numero = n; 
    }
    
    @Override
    public void run() {
    try{ 
        while(true){
            System.out.println(numero);
            sleep((long)(2500*Math.random()));
            
        }
    } 
    catch (InterruptedException e){ 
        return; 
        } 
    }

    public static void main (String args[]) {
    for (int i=0; i<10; i++)
        new Concurrencia(i).start();
    }
}




















