package herencia;

public class Docente extends Usuario{
    int p3;
    public Docente(int id, String nombre){
        //super (id,nombre);
    }
    public Docente(int id, String nombre, int secret){
        //super (id,nombre,secret);
    }
    
    public Docente(int id, String nombre, int secret, int p3){  
       // super (id,nombre,secret);
        this.p3=p3;
    }
    
    public Docente(int id){ 
        //super();
        //super (id);
        //this.p3=p3;
    }
    //@Override
    //public void setPrestamo(){
    //    System.out.println("Hola 2");
   //}
}
