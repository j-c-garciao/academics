/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Bank.Deposit;
import Bank.Transaction;
import Bank.Withdraw;
import java.util.ArrayList;

/**
 *
 * @author jc_go
 */
public class Question4 extends javax.swing.JFrame {

    /**
     * Creates new form Question1
     */
    
    ArrayList transaction = new ArrayList<Transaction>();
    int cont_deposit_male=0;
    int cont_deposit_female=0;
    int cont_withdraw_male=0;
    int cont_withdraw_female=0;
    
    ArrayList deposit_male = new ArrayList<Double>();
    ArrayList withdraw_male = new ArrayList<Double>();
    
    ArrayList deposit_female = new ArrayList<Double>();
    ArrayList withdraw_female = new ArrayList<Double>();
    
    
    
    
    
    
    
    
    
    public Question4(ArrayList<Transaction> transaction) {
        initComponents();
        this.transaction=transaction;
        showAnswer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void showAnswer(){
        transaction.forEach((t) -> {
            if (t instanceof Deposit){
                if((((Deposit)t).getGender())=='M'){
                    deposit_male.add(((Deposit)t).getValue());
                }
                else{
                    deposit_female.add(((Deposit)t).getValue());
                }
                
            }else{
                if((((Withdraw)t).getGender())=='M'){
                    withdraw_male.add(((Withdraw)t).getValue());
                }
                else{
                    withdraw_female.add(((Withdraw)t).getValue());
                }
            }
                
        });
        textArea1.append("Population:= "+deposit_male.size()+"\n");
        textArea1.append("Mean:= "+getMeanTransaction(deposit_male,deposit_male.size())+"\n");
        textArea1.append("Variance:= "+getVarianceTransaction(deposit_male,deposit_male.size(),getMeanTransaction(deposit_male,deposit_male.size()))+"\n");
        textArea1.append("Dev Standard:= "+getDevStandardTransaction(getVarianceTransaction(deposit_male,deposit_male.size(),getMeanTransaction(deposit_male,deposit_male.size()))));
        
        textArea2.append("Population:= "+withdraw_male.size()+"\n");
        textArea2.append("Mean:= "+getMeanTransaction(withdraw_male,withdraw_male.size())+"\n");
        textArea2.append("Variance:= "+getVarianceTransaction(withdraw_male,withdraw_male.size(),getMeanTransaction(withdraw_male,withdraw_male.size()))+"\n");
        textArea2.append("Dev Standard:= "+getDevStandardTransaction(getVarianceTransaction(withdraw_male,withdraw_male.size(),getMeanTransaction(withdraw_male,withdraw_male.size()))));
        
        textArea3.append("Population:= "+deposit_female.size()+"\n");
        textArea3.append("Mean:= "+getMeanTransaction(deposit_female,deposit_female.size())+"\n");
        textArea3.append("Variance:= "+getVarianceTransaction(deposit_female,deposit_female.size(),getMeanTransaction(deposit_female,deposit_female.size()))+"\n");
        textArea3.append("Dev Standard:= "+getDevStandardTransaction(getVarianceTransaction(deposit_female,deposit_female.size(),getMeanTransaction(deposit_female,deposit_female.size()))));    
        
        textArea4.append("Population:= "+withdraw_female.size()+"\n");
        textArea4.append("Mean:= "+getMeanTransaction(withdraw_female,withdraw_female.size())+"\n");
        textArea4.append("Variance:= "+getVarianceTransaction(withdraw_female,withdraw_female.size(),getMeanTransaction(withdraw_female,withdraw_female.size()))+"\n");
        textArea4.append("Dev Standard:= "+getDevStandardTransaction(getVarianceTransaction(withdraw_female,withdraw_female.size(),getMeanTransaction(withdraw_female,withdraw_female.size()))));
    }
    
    private double getMeanTransaction(ArrayList<Double> data, int population){
        double values=0.0;
        for(Double d: data){
            values+=d;
        }
        return values/population;
    }
    
    private double getVarianceTransaction(ArrayList<Double> data, int population, double mean){
        double sum=0.0;
        for(Double d: data){
            sum+=Math.pow(mean-d,2);
        }
        return sum/(population-1);
    }
    
    private double getDevStandardTransaction(double variance){
        return Math.sqrt(variance);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        textArea4 = new java.awt.TextArea();
        textArea2 = new java.awt.TextArea();
        textArea3 = new java.awt.TextArea();
        jButton2 = new javax.swing.JButton();

        setTitle("Transactions per gender (mean, variance, dev std)");
        setResizable(false);

        jLabel1.setText("Deposit");

        jLabel2.setText("Withdraw");

        jLabel3.setText("Men");

        jLabel4.setText("Women");

        jButton2.setText("Graficar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(94, 94, 94))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textArea3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textArea4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(263, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(textArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    private java.awt.TextArea textArea3;
    private java.awt.TextArea textArea4;
    // End of variables declaration//GEN-END:variables
}
