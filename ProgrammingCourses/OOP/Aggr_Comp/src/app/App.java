/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import cliente.Cliente;
import empleado.Empleado;
import empresa.*;
/**
 *
 * @author jc_go
 */
public class App {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Empresa e1=new Empresa("X1"); 
       //CONTRATACION
       for(Rol r: e1.getRoles()){
           if(r.getRol().compareTo("Presidente")==0)
               r.setEmpleado(new Empleado("Jennifer"));
           
           if(r.getRol().compareTo("Secretrario")==0)
               r.setEmpleado(new Empleado("Pedro"));
           
           if(r.getRol().compareTo("Ayudante")==0)
               r.setEmpleado(new Empleado("Luis"));    
       } 
       
       //CLIENTES
       Cliente c1 = new Cliente("C1");
       Cliente c2 = new Cliente("C2");
       e1.addClientes(c1);
       e1.addClientes(c2);
    }
}
