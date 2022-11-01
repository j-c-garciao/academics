/******************************************
 * Juan Carlos García Ojeda               *
 *                                        * 
 * Programa de Ingeniería de Sistemas     *
 * Facultad de Ingeniería                 *
 * ==============================         *
 * Universidad de Cartagena - 2022        *
 ******************************************/
package co.edu.unicartagena.app;

import co.edu.unicartagena.binarytree.*;

public class App {
	public static void main (String args[]){
		BinaryTree a=new BinaryTree();
		a.adicionar(10, a.getRaiz(),1);
		a.adicionar(15,a.getRaiz(),1);
		a.adicionar(20,a.getRaiz(),1);
		a.adicionar(40,a.getRaiz(),1);
		a.adicionar(50,a.getRaiz(),1);
		a.adicionar(60,a.getRaiz(),1);
		a.adicionar(2,a.getRaiz(),1);
		a.adicionar(3,a.getRaiz(),1);
		a.adicionar(4,a.getRaiz(),1);
		a.adicionar(70,a.getRaiz(),1);
		a.adicionar(6, a.getRaiz(),1);
		a.adicionar(5,a.getRaiz(),1);
		a.adicionar(3,a.getRaiz(),1);
		a.adicionar(2,a.getRaiz(),1);
		a.adicionar(1,a.getRaiz(),1);
		a.adicionar(10,a.getRaiz(),1);
		a.adicionar(100,a.getRaiz(),1);
		a.adicionar(20,a.getRaiz(),1);
		a.adicionar(50,a.getRaiz(),1);
		a.adicionar(56,a.getRaiz(),1);
		a.adicionar(78, a.getRaiz(),1);
		a.adicionar(80,a.getRaiz(),1);
		a.adicionar(90,a.getRaiz(),1);
		a.adicionar(99,a.getRaiz(),1);
		
		a.adicionar(65,a.getRaiz(),1);
		a.adicionar(45,a.getRaiz(),1);
		a.adicionar(67,a.getRaiz(),1);
		a.adicionar(87,a.getRaiz(),1);
		a.adicionar(34,a.getRaiz(),1);
		a.adicionar(23,a.getRaiz(),1);
		
		a.adicionar(45, a.getRaiz(),1);
		a.adicionar(6,a.getRaiz(),1);
		a.adicionar(7,a.getRaiz(),1);
		a.adicionar(2,a.getRaiz(),1);
		a.adicionar(12,a.getRaiz(),1);
		a.adicionar(34,a.getRaiz(),1);
		a.adicionar(65,a.getRaiz(),1);
		a.adicionar(43,a.getRaiz(),1);
		a.adicionar(78,a.getRaiz(),1);
		a.adicionar(67,a.getRaiz(),1);
		a.adicionar(54, a.getRaiz(),1);
		a.adicionar(32,a.getRaiz(),1);
		a.adicionar(12,a.getRaiz(),1);
		a.adicionar(34,a.getRaiz(),1);
		a.adicionar(56,a.getRaiz(),1);
		a.adicionar(65,a.getRaiz(),1);
		a.adicionar(43,a.getRaiz(),1);
		a.adicionar(17,a.getRaiz(),1);
		a.adicionar(23,a.getRaiz(),1);
		a.adicionar(12,a.getRaiz(),1);
		a.adicionar(13, a.getRaiz(),1);
		a.adicionar(11,a.getRaiz(),1);
		a.adicionar(30,a.getRaiz(),1);
		a.adicionar(89,a.getRaiz(),1);
		a.adicionar(90,a.getRaiz(),1);
				
		System.out.println("Preorder");
		a.preorder(a.getRaiz());
		System.out.println("\nInorder");
		a.inorder(a.getRaiz());
		System.out.println("\nPostorder");
		a.postorder(a.getRaiz());
	}
	
	
	
}
