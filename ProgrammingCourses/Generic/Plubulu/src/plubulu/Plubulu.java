/***********************************************
 * Plubulu Problem                             *
 * ==============================              *
 * CopyRight 2018 by Juan C. Garcia-Ojeda      *
 * Modified: Mon Feb 25th of 2019              *
 * State   : Updated                           *    
 * File    : Plubulu.java                      *
 * Purpose : Solve the Plubulu's problem       *
 ***********************************************/

package plubulu;

import java.util.Scanner;

/**
 *
 * @author jc_go
 */
public class Plubulu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N,M,cont=0,digito[];
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite N: ");
        N=sc.nextInt();
        System.err.println("Digite M: ");
        M=sc.nextInt();
        for(int i=N;i<=M;++i){
            digito = new int[10];
            String s = String.valueOf(i);
            for(int j=0;j<s.length();++j){
                int k = Integer.valueOf(String.valueOf(s.charAt(j)));
                switch(k){
                    case 0: digito[k]=digito[k]+1;
                            break;
                    case 1: digito[k]=digito[k]+1;
                            break;
                    case 2: digito[k]=digito[k]+1;
                            break;
                    case 3: digito[k]=digito[k]+1;
                            break;
                    case 4: digito[k]=digito[k]+1;
                            break;
                    case 5: digito[k]=digito[k]+1;
                            break;
                    case 6: digito[k]=digito[k]+1;
                            break;
                    case 7: digito[k]=digito[k]+1;
                            break;
                    case 8: digito[k]=digito[k]+1;
                            break;
                    case 9: digito[k]=digito[k]+1;
                            break;        
                }
            }
            for (int j=0;j<10;++j){
                if(digito[j]>1){
                    flag=true;
                }
            }
            if(!flag){
                cont++;
            }
        flag=false;
        }
    System.out.println(cont); 
    }
    
}
