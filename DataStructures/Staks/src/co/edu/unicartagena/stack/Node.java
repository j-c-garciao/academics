/******************************************
 * Juan Carlos García Ojeda               *
 *                                        * 
 * Programa de Ingeniería de Sistemas     *
 * Facultad de Ingeniería                 *
 * ==============================         *
 * Universidad de Cartagena - 2022        *
 ******************************************/

package stack;

public class Node<T> {
	int dato;
	Node<T> sig;
	
	public Node(int dato){
		this.dato=dato;
		this.sig=null;
	}
	
	public Node(int dato, Node<T> sig){
		this.dato=dato;
		this.sig=sig;
	}
	
	public int getDato(){
		return this.dato;
	}
}