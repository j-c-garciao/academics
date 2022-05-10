/******************************************
 * Juan Carlos García Ojeda               *
 *                                        * 
 * Programa de Ingeniería de Sistemas     *
 * Facultad de Ingeniería                 *
 * ==============================         *
 * Universidad de Cartagena - 2022        *
 ******************************************/

package app;

import stack.Node;
import stack.Stack;

public class App {
	public static void main(String args[]){
		Stack<Integer> l = new Stack<Integer>();
		l.push(new Node<Integer>(20));
		l.peek();
		l.push(new Node<Integer>(10));
		l.peek();
		l.push(new Node<Integer>(40));
		l.peek();
		l.push(new Node<Integer>(30));
		l.peek();
		l.push(new Node<Integer>(50));
		l.peek();
		l.push(new Node<Integer>(80));
		l.peek();
		System.out.println("*******");
		l.pop();l.pop();l.pop();
		l.pop();l.pop();l.pop();
		l.pop();l.pop();l.pop();
		l.peek();
	}
}
