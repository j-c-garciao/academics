package co.edu.unicartagena.queue;

public class Cola <T>{
	Nodo<T> primerNodo;
	Nodo<T> ultimoNodo;
	int tamaño = 0;
	
	public Cola(){
		limpiar();
	}

	private void limpiar(){
		primerNodo = null;
		ultimoNodo = null;
		tamaño = 0;
	}

	public boolean estaVacia(){
		if (tamaño == 0)
			return true;
		else
			return false;
	}

        public T decolar(){
		T aux=null;
		if(!estaVacia()){
			aux = primerNodo.getDato();
			primerNodo = primerNodo.sig;
			tamaño = tamaño - 1;
		}
		else
			System.out.println("La Cola esta vacia");
	return aux;
	}
        
        public boolean encolar(Nodo<T> Nodo){
		Nodo<T> nuevoNodo = Nodo;
		if(estaVacia()){
			primerNodo = nuevoNodo;
			ultimoNodo = nuevoNodo;
		}	
		else{
			ultimoNodo.sig = Nodo;
			ultimoNodo= Nodo;
		}
		tamaño=tamaño+1;
		return true;
	}
        
}
