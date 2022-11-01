package app;

import co.edu.unicartagena.colas.*;

public class Principal {
	public static void main(String args[]){
		Cola<Integer> q = new Cola<>();
                q.encolar(new Nodo<>(20));
		q.encolar(new Nodo<>(20));
		q.encolar(new Nodo<>(30));
		q.encolar(new Nodo<>(40));
		q.encolar(new Nodo<>(50));
		q.encolar(new Nodo<>(60));
		System.out.println(q.decolar());
		System.out.println(q.decolar());
		System.out.println(q.decolar());
		System.out.println(q.decolar());
		System.out.println(q.decolar());
		q.encolar(new Nodo<Integer>(60));
		q.encolar(new Nodo<Integer>(160));
		System.out.println(q.decolar());
		System.out.println(q.decolar());
	}
}