package app.nicolas2;

import java.util.Arrays;

public class OrdenandoElementos{ // Parte Solucion https://chat.openai.com

    public static void main(String[] args) {

        int N = 5;
        
        int[][] matriz = new int[5][5];

        for(int x = 0; x < matriz.length; x++){
            for(int y = 0; y < matriz.length; y++){
                matriz[x][y] = (int)(Math.random()*(75-25)) + 25;
            }
        }
        
        int[][] Mordenada = diagonalPrincipal(matriz);
        
        // Imprimir la matriz original
        System.out.print(" Matriz original:\n\n ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.print("\n\n ");
        }

        // Imprimir la matriz ordenada
        System.out.print("\n Ordenada diagonal Principal:\n\n ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(Mordenada[i][j] + "  ");
            }
            System.out.print("\n\n ");
        }

        int[][] MMordenada = diagonalSecundaria(Mordenada);
        // Imprimir la matriz ordenada
        System.out.println("\n Ordenada diagonal Secundaria:\n\n ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(MMordenada[i][j]  + "  ");
            }
            System.out.print("\n\n ");
        }

    }

    public static int[][] diagonalPrincipal(int[][] matriz){

        int N = matriz.length;

        int[] debajo = new int[N*(N-1)/2]; // número de elementos debajo de la diagonal principal
        int[] encima = new int[N*(N-1)/2]; // número de elementos encima de la diagonal principal
        int k = 0; // índice para la lista debajo de la diagonal
        int l = 0; // índice para la lista encima de la diagonal
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i > j) {
                    debajo[k] = matriz[i][j];
                    k++;
                } else if (i < j) {
                    encima[l] = matriz[i][j];
                    l++;
                }
            }
        }

        // Ordenar las dos listas
        Arrays.sort(debajo);
        Arrays.sort(encima);
        int n = 0; // índice para la lista ordenada debajo de la diagonal
        int m = encima.length - 1; // índice para la lista ordenada encima de la diagonal
        int[][] Mordenada = new int[N][N]; // matriz ordenada
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i > j) {
                    Mordenada[i][j] = debajo[n];
                    n++;
                } else if (i < j) {
                    Mordenada[i][j] = encima[m];
                    m--;
                } else {
                    Mordenada[i][j] = matriz[i][j];
                }
            }
        }

        return Mordenada;
    }

    public static int[][] diagonalSecundaria(int[][] matriz){

        int N = matriz.length;

        int[] debajo = new int[N*(N-1)/2]; // número de elementos debajo de la diagonal secundaria
        int[] encima = new int[N*(N-1)/2]; // número de elementos encima de la diagonal secundaria
        int k = 0; // índice para la lista debajo de la diagonal
        int l = 0; // índice para la lista encima de la diagonal
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i + j > N-1) { // si está debajo de la diagonal secundaria
                    debajo[k] = matriz[i][j];
                    k++;
                } else if (i + j < N-1) { // si está por encima de la diagonal secundaria
                    encima[l] = matriz[i][j];
                    l++;
                }
            }
        }
    
        // Ordenar las dos listas
        Arrays.sort(debajo);
        Arrays.sort(encima);

        int n = 0; // índice para la lista ordenada debajo de la diagonal
        int m = encima.length - 1; // índice para la lista ordenada encima de la diagonal
        int[][] Mordenada = new int[N][N]; // matriz ordenada
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i + j > N-1) { // si está debajo de la diagonal secundaria
                    Mordenada[i][j] = debajo[n];
                    n++;
                } else if (i + j < N-1){

                    Mordenada[i][j] = encima[m];
                    m--;
                }else{
                    Mordenada[i][j] = matriz[i][j];
                }
            }
        }
        
        return Mordenada;
    }
}

