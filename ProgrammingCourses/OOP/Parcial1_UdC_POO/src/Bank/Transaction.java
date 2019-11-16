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
public class Transaction {
    String ip;
    String transaction;
    String type;
    String date;
    
    public Transaction(String ip, String transaction, String type, String date) {
        this.ip = ip;
        this.transaction = transaction;
        this.type = type;
        this.date = date;
    }

    public String getIp() {
        return ip;
    }

    public String getTransaction() {
        return transaction;
    }

    public String getType() {
        return type;
    }
    
       
    
    
    
    
}
