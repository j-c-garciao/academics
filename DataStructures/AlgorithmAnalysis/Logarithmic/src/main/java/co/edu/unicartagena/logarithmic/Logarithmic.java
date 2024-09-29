/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.unicartagena.logarithmic;

import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class Logarithmic {

    public static void main(String[] args) {
        System.out.println("Digit n");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=n;
        int x=1;
        int cont=0;
        while(i>0){
            for(int j=1;j<=i;++j){
                cont++;
                x=((x+j)/2) + x;
            }
            cont++;
        i=i/2;
        }
    System.out.println("Ended!");
    System.out.println(cont);
    
    }
}
