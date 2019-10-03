package herencia;

public class Usuario {
    int id;
    String nombre;
    protected int cod;
    
    public Usuario (int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
    
    void setPrestamo(){
        System.out.println("HOLA");
    }
}
