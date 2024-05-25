package semaforos;
import app.GUI;
import java.util.concurrent.Semaphore;


public class EstacionRemota extends Thread {
    private String nombre;
    private Semaphore semaforo;
    private String msg;
    private GUI gui;

    public EstacionRemota(String nombre, Semaphore semaforo, GUI gui) {
        this.nombre = nombre;
        this.semaforo = semaforo;
        this.gui=gui;
    }

    public void run() {
        while (true) {
            try {
                // Simular envío de mensaje
                Thread.sleep(3500);

                // Esperar hasta que la estación base lea los mensajes anteriores
                semaforo.acquire();
                
                // Enviar mensaje a la estación base
                System.out.println(nombre + " envia mensaje a la estacion base");
                //setMsg("XXX");
                this.gui.setTextArea(nombre + " envia mensaje a la estacion base");
                //Liberar el semáforo para permitir que otras estaciones remotas envíen mensajes
                semaforo.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
   private void setMsg(String msg){
       this.msg =msg;
   } 
    public String getMsg(){
        return this.msg;
    }
}
