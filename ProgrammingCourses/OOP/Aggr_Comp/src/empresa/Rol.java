/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import empleado.Empleado;

/**
 *
 * @author jc_go
 */
public class Rol {
    private String rol;
    private Empleado empleado;
    double
    
    public Rol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }   

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    } 
}
