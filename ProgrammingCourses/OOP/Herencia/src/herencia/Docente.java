package herencia;

public class Docente extends Usuario{
    
    public Docente(int id, String nombre){
        super (id,nombre);
    }
    
    @Override
    public void setPrestamo(){
        System.out.println("Hola 2");
   }
    
}
