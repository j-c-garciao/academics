/******************************************
 * Juan Carlos García Ojeda               *
 *                                        * 
 * Programa de Ingeniería de Sistemas     *
 * Facultad de Ingeniería                 *
 * ==============================         *
 * Universidad de Cartagena - 2022        *
 ******************************************/

package co.edu.unicartagena.test;

import co.edu.unicartagena.binarytree.BinaryTree;

public class TestA {
	public static void main(String[] args) {
		BinaryTree arbol = new BinaryTree();
	    for (int i = 1; i <= 10; i++ ) {
	         long valor = (int)( Math.random()*10);
	         System.out.print(valor+" ");
                 arbol.getRaiz
                 
	         arbol.adicionar(valor, arbol.getRaiz(),1);
	    }
	    System.out.println();
	    System.out.println("Recorrido Pre-order := ");
	    arbol.preorder(arbol.getRaiz());
	    System.out.println("\nRecorrido In-order :=");
	    arbol.inorder(arbol.getRaiz());
	    System.out.println("\nRecorrido Post-order :=");
	    arbol.postorder(arbol.getRaiz());
	    
	    System.out.println("\n\nN�mero de Nodos            := "+arbol.nodos);
	    System.out.println("Profundidad                  := "+arbol.getAltura());
	    System.out.println("N�mero Mayor                 := "+arbol.numeroMayor);
	    System.out.println("Nivel Numero Mayor           := "+arbol.getNivelNumeroMayor());
	    System.out.println("N�mero Menor                 := "+arbol.numeroMenor);
	    System.out.println("Nivel Numero Menor           := "+arbol.getNivelNumeroMenor());  
	}
}