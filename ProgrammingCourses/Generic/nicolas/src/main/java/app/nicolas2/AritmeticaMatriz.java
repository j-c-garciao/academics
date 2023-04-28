package app.nicolas2;

import java.util.Scanner;

// Parte de solucion: https://chat.openai.com
    
public class AritmeticaMatriz {
    public static void main(String[] args){ 

        Scanner input = new Scanner(System.in);
        System.out.print(" Ingrese el tamaño n de la matriz cuadrada: ");
        int n = Integer.parseInt(input.nextLine());
        
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.printf(" Ingrese el valor de la celda [%d][%d]: ", i, j);
                matrix[i][j] = Integer.parseInt(input.nextLine());

            }
        }
        
        int sumDiagonal = 0;
        int productDiagonal = 1;

        for (int i = 0; i < n; i++) {
            sumDiagonal += matrix[i][i];
            productDiagonal *= matrix[i][n-i-1];
        }
        
        System.out.println(" I.   La suma de los elementos en la diagonal principal es: " + sumDiagonal);
        System.out.println(" II.  La multiplicación de los elementos en la diagonal secundaria es: " + productDiagonal);
        
        if (productDiagonal != 0) {
            double division = (double) sumDiagonal / productDiagonal;
            System.out.println(" III. La division de (I) y (II) es: " + division);
        } else {
            System.out.println(" La division no es posible");
        }
    }
}
