package app;

import co.edu.unicartagena.list.Lista;
import co.edu.unicartagena.list.Nodo;


public class App {
    public static void main(String args[]){
	
        //System.out.println("*Adicionar al Comienzo de la Lista*");
	
        Lista<Integer> l = new Lista<>();
	
        l.adicionar(new Nodo<>(20));
	l.adicionar(new Nodo<>(30));
	l.adicionar(new Nodo<>(40));
	l.adicionar(new Nodo<>(50));
	l.adicionar(new Nodo<>(60));
	l.adicionar(new Nodo<>(70));
	l.imprimir();
	
	/*System.out.println("*Adicionar al Final de la Lista*");
	l = new Lista<>();
	l.adicionarFinal(new Nodo<>(20));
	l.adicionarFinal(new Nodo<>(30));
	l.adicionarFinal(new Nodo<>(40));
	l.adicionarFinal(new Nodo<>(50));
	l.adicionarFinal(new Nodo<>(60));
	l.adicionarFinal(new Nodo<>(70));
	l.imprimir();
        l.eliminar();
        l.imprimir();
	
	System.out.println("*Adicionar entre un par de Nodos*");
	l = new Lista<>();
	l.adicionarEntreNodos(new Nodo<>(20));
	l.adicionarEntreNodos(new Nodo<>(30));
	l.adicionarEntreNodos(new Nodo<>(40));
	l.adicionarEntreNodos(new Nodo<>(60));
	l.adicionarEntreNodos(new Nodo<>(5));
	l.adicionarEntreNodos(new Nodo<>(4));
	l.adicionarEntreNodos(new Nodo<>(3));
	l.adicionarEntreNodos(new Nodo<>(2));
	l.adicionarEntreNodos(new Nodo<>(1));
	l.adicionarEntreNodos(new Nodo<>(50));
	l.adicionarEntreNodos(new Nodo<>(15));
	l.adicionarEntreNodos(new Nodo<>(100));
	l.imprimir();
        */
    }
}