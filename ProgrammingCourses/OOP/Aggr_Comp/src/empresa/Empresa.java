/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import cliente.Cliente;
import java.util.ArrayList;

/**
 *
 * @author jc_go
 */
public class Empresa {
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Rol> roles = new ArrayList<Rol>();
    private String name;

    public Empresa(String name) {
        this.name = name;
        setRoles();
    }

    public void addClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public String getName() {
        return name;
    }
    
    private void setRoles(){
        Rol r1 = new Rol("Presidente");
        Rol r2 = new Rol("Secretario");
        Rol r3 = new Rol("Ayudante");
        roles.add(r1);
        roles.add(r2);
        roles.add(r3);
    }
    
    public ArrayList<Rol> getRoles(){
        return this.roles;
    }
}
