package herencia;

public class Usuario {
    int id;
    String nombre;
    protected int cod;
    private int secret;
    
    /*public Usuario (int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
    
    public Usuario (int id, String nombre, int secret){
        this.id=id;
        this.nombre=nombre;
        this.secret=secret;
    }
    */
    void setPrestamo(){
        System.out.println("HOLA");
    }
    
    int getSecret(){
        return this.secret;
    }
    
}
