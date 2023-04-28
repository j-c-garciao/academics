package app.nicolas2;

import java.util.Arrays;
import java.util.Scanner;

public class SumaMatriz { // Parte solucion https://chat.openai.com
    
    public static int[] sumRows(int[][] matrix) {

        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[] rowSums = new int[numRows];
        
        for (int i = 0; i < numRows; i++) {
            int sum = 0;
            for (int j = 0; j < numCols; j++) {
                sum += matrix[i][j];
            }
            rowSums[i] = sum;
        }
        
        return rowSums;
    }
    
    public static int[] sumColumns(int[][] matrix) {

        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[] columnSums = new int[numCols];
        
        for (int j = 0; j < numCols; j++) {
            int sum = 0;
            for (int i = 0; i < numRows; i++) {
                sum += matrix[i][j];
            }
            columnSums[j] = sum;
        }
        
        return columnSums;
    }

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int N = 0;
        int M = 0;
        
        do{
            System.out.print("\n Ingresa la dimension N: ");
            N = Integer.parseInt(input.nextLine());

            System.out.print(" Ingresa la dimension M: ");
            M = Integer.parseInt(input.nextLine());

            if(N < 1 || M < 1){
                System.out.println(" Rango sin sentido. ");
            }

        }while(N < 1 || M < 1 );

        int[][] matrix = new int[N][M];

        System.out.println("\n ");

        for(int x = 0; x < matrix.length; x++){
            for(int y = 0; y < matrix.length; y++){

                matrix[x][y] = (int)(Math.random()*(10-5)) + 5;

               if(matrix[x][y] < 10){
                System.out.print("0");
               }
               System.out.print(matrix[x][y]+ "  ");

            }
            System.out.println("\n ");
        }

        int[] rowSums = sumRows(matrix);
        int[] columnSums = sumColumns(matrix);
        
        System.out.println(" Suma FILAS: \n" + Arrays.toString(rowSums));
        System.out.println(" Suma COLUMNAS: \n" + Arrays.toString(columnSums));
    }
}