package co.wizardslab.academics.matrix;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite n");
        int n = sc.nextInt();
        System.out.println("Digite m");
        int m = sc.nextInt();
        
        System.out.println("Digite los elementos de la matrix n x m");
        Matrix matrix= new Matrix(n,m);
        for (int i=0;i<n;i++){
        	for (int j=0;j<m;j++){
        		matrix.setValue(i, j, sc.nextInt());
    		}
    	}
        
        System.out.println("La suma de las filas de la matrix n x m es "+matrix.getRowSum());
        System.out.println("La suma de las columnas de la matrix n x m es "+matrix.getColSum());
	}
}
