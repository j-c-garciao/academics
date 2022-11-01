/******************************************
 * Juan Carlos García Ojeda               *
 *                                        * 
 * Programa de Ingeniería de Sistemas     *
 * Facultad de Ingeniería                 *
 * ==============================         *
 * Universidad de Cartagena - 2022        *
 ******************************************/

package co.edu.unicartagena.binarytree;

public class Node{
	public long datos;
	public Node izquierdo;
	public Node derecho;
	public Node(long dato, Node izq, Node der){
		this.datos=dato;
		this.izquierdo=izq;
		this.derecho=der;
	}
	public Node(long dato){
		this.datos=dato;
		this.izquierdo=null;
		this.derecho=null;
	}
	public long getDato(){
		return this.datos;
	}
}
