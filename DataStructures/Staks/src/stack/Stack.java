/******************************************
 * Juan Carlos García Ojeda               *
 *                                        * 
 * Programa de Ingeniería de Sistemas     *
 * Facultad de Ingeniería                 *
 * ==============================         *
 * Universidad de Cartagena - 2022        *
 ******************************************/

package stack;

public class Stack <T>{
	Node<T> primerNodo;
	int tamaño = 0;
	
	public Stack(){
		limpiar();
	}

	private void limpiar(){
		primerNodo = null;
		tamaño = 0;
	}

	private boolean estaVacia(){
		if (tamaño == 0)
			return true;
		else
			return false;
	}

	public boolean push(Node<T> Nodo){
		Node<T> nuevoNodo = Nodo;
		if(estaVacia())
			primerNodo = nuevoNodo;
		else{
			nuevoNodo.sig=primerNodo;
			primerNodo = nuevoNodo;
		}
		tamaño=tamaño+1;
		return true;
	}

	public void pop(){
		if(!estaVacia()){
			System.out.println(primerNodo.getDato());
			primerNodo = primerNodo.sig;
			tamaño = tamaño - 1;
		}
		else
			System.out.println("La Pila esta vacia");
	}

	public void peek(){
		if(!estaVacia())
			System.out.println(primerNodo.getDato());
		else
			System.out.println("La Pila esta vacia");
	}
}