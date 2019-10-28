/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author jc_go
 */
public class Undergraduate extends Student {
    int type;

    public Undergraduate(int type, int id, String last_name, String first_name, char gender, double grade) {
        super(id, last_name, first_name, gender, grade);
        this.type = type;
    }
    
}
