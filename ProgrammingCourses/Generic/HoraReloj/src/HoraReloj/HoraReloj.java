/***********************************************
 * Clock's Problem                             *
 * ==============================              *
 * CopyRight 2018 by Juan C. Garcia-Ojeda      *
 * Modified: Mon Feb 25th of 2019              *
 * State   : Updated                           *    
 * File    : HoraReloj.java                    *
 * Purpose : Solve the Clock's problem         *
 ***********************************************/


package HoraReloj;

import java.util.Scanner;

/**
 *
 * @author jc_go
 */
public class HoraReloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int angulo = sc.nextInt();
        String decision = "";
        if(angulo % 6 == 0)
            decision = "Si";
        else
            decision= "No";
        
        System.out.println(decision);
        
        
        char a[] = new char[10]; 
    }
    
}
