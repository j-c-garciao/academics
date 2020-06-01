package herencia;

public class Docente extends Usuario{
    
    public Docente(int id, String nombre){
        super (id,nombre);
    }
    
    
    public Docente(int id, String nombre, int secret){
        super (id,nombre,secret);
    }
    
    @Override
    public void setPrestamo(){
        System.out.println("Hola 2");
   }
}
