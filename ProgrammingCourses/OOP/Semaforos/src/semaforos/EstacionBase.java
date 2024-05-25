package semaforos;


import java.util.concurrent.Semaphore;
import app.GUI;

public class EstacionBase {
    private Semaphore semaforo;
    private String msg;
    private GUI gui;
    
    public EstacionBase(int numEstacionesRemotas, GUI gui) {
        //this.setGUI(gui);
        // Solo una estación remota puede enviar mensajes a la vez
        semaforo = new Semaphore(1);
        // Crear y arrancar las estaciones remotas
        for (int i = 1; i <= numEstacionesRemotas; i++) {
            EstacionRemota estacionRemota = new EstacionRemota("Estacion Remota " + i, semaforo,gui);
            estacionRemota.start();
            //this.gui.setTextArea("HOLA");
        }
    }

    private void msg(String msg){
        this.msg=msg;
    
    }
    public String recibirMensaje() {
        return this.msg;
    }
    
    public void setGUI(GUI gui){
        this.gui=gui;
    }
    
}




