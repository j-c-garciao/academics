/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author jc_go
 */
public class Withdraw extends Transaction {
    char gender;
    Double value;

    public Withdraw(char gender, Double value, String ip, String transaction, String type, String date) {
        super(ip, transaction, type, date);
        this.gender = gender;
        this.value = value;
    }

    public char getGender() {
        return gender;
    }

    public Double getValue() {
        return value;
    }
}
