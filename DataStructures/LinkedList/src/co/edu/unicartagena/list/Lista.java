package co.edu.unicartagena.list;

public class Lista <T>{
	Nodo<T> primerNodo;
	int tamaño = 0;
	public Lista(){
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
	
	public boolean adicionar(Nodo<T> Nodo){
		//ADICIONAR AL COMIENZO DE LA LISTA
		Nodo<T> nuevoNodo = Nodo;
		if(estaVacia())
			primerNodo = nuevoNodo;
		else{
			nuevoNodo.sig=primerNodo;
			primerNodo = nuevoNodo;
		}
		tamaño=tamaño+1;
		return true;
	}
	
	/*
	 * adicionarFinal
	 * 
	 * adiciona un nodo al final de la lista
	 * 
	 */
	
	public boolean adicionarFinal(Nodo<T> Nodo){
		
		Nodo<T> nuevoNodo = Nodo;
		Nodo<T> temp = null;
		if(estaVacia())
			primerNodo = nuevoNodo;
		else{
			temp = primerNodo;
			while(temp.sig!=null)
				temp = temp.sig;
			temp.sig = nuevoNodo;
		}
		tamaño=tamaño+1;
		return true;
	}
	
	/*
	 * adicionarEntreNodos
	 * 
	 * adiciona un nodo entre nodos en order no decreciente
	 * 
	 */
	
        public boolean eliminar(){
        
            Nodo<T> temp = null;
	    temp=primerNodo;
            System.out.println("***"+temp.getDato());
            primerNodo=temp.sig;
            return true;
        }
        
        
	public boolean adicionarEntreNodos(Nodo<T> Nodo){
		Nodo<T> nuevoNodo = Nodo;
		Nodo<T> temp = null;
		Nodo<T> anterior = null;
		if(estaVacia())
			primerNodo = nuevoNodo;
		else{
			temp = primerNodo;
			anterior = temp;
			boolean band=false;
			//CASO 1 : Lista tiene un elemento
			if(tamaño==1){
				if(Integer.parseInt(temp.getDato().toString()) < Integer.parseInt(nuevoNodo.getDato().toString())){
				//if(temp.getDato() < Nodo.getDato()){
                                primerNodo.sig=nuevoNodo;
				}
				else{
					nuevoNodo.sig = primerNodo;
					primerNodo=nuevoNodo;
				}
			}
			else{//LISTA TIENE MAS DE UN ELEMENTO
				
				while(temp!=null && 
						  Integer.parseInt(temp.getDato().toString()) < 
						  Integer.parseInt(nuevoNodo.getDato().toString())){
						  anterior=temp;
						  temp = temp.sig;
						  band=true;
						}
				    if(band){//
				    	nuevoNodo.sig =anterior.sig;
				    	anterior.sig = nuevoNodo;
				    }
				    else{//El valor del nuevo nodo es menor
				    	nuevoNodo.sig=temp;
				    	primerNodo=nuevoNodo;
				    	
				    }
			}
		}
		tamaño=tamaño+1;
		return true;
	}
	
	public void imprimir(){
		if(!estaVacia()){
			Nodo<T> temp = primerNodo;
			while(temp!=null){
				System.out.println(temp.getDato());
				temp=temp.sig;
			}
		}
		else
			System.out.println("La Lista esta vacia");
	}
}