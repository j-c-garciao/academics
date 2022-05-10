/******************************************
 * Juan Carlos García Ojeda               *
 *                                        * 
 * Programa de Ingeniería de Sistemas     *
 * Facultad de Ingeniería                 *
 * ==============================         *
 * Universidad de Cartagena - 2022        *
 ******************************************/

package binarytree;

public class BinaryTree {
	public Node raiz;
	public Node izquierdo;
	public Node derecho;
	public int altura=0;
	
	public long numeroMenor = 1001;
	public long numeroMayor = 0;
	
	public int nivelNumeroMenor=0;
	public int nivelNumeroMayor=0;
	
	
	public int nivel=0;
	public int nodos=0;
	
	public BinaryTree(){
	}
	
	public void adicionar (long valor, Node raiz, int nivel){
		if (raiz==null){
			this.raiz=new Node(valor);
			nodos = nodos + 1;
			updateAltura(this.altura,nivel);
			updateNivelNumeroMayor(valor,this.numeroMayor,nivel);
			updateNivelNumeroMenor(valor,this.numeroMenor,nivel);
		}
		else{
			if (valor<raiz.getDato()){
				if(raiz.izquierdo==null){
					raiz.izquierdo=new Node(valor);
					nodos = nodos + 1;
					updateAltura(this.altura,nivel+1);
					updateNivelNumeroMenor(valor,this.numeroMenor,nivel+1);
				}
				else{
					adicionar (valor,raiz.izquierdo,nivel+1);
				}	
			}
			if(valor>raiz.getDato()) {
				if(raiz.derecho==null){
					raiz.derecho=new Node(valor);
					nodos = nodos + 1;
					updateAltura(this.altura,nivel+1);
					updateNivelNumeroMayor(valor,this.numeroMayor,nivel+1);
					
				}
				else{
					adicionar (valor,raiz.derecho,nivel+1);
				}
			}
		} 
	}
	
	public int getNumeroNodos(){
		return this.nodos;
	}
	
	public int getAltura(){
		return this.altura;
	}
	
	public int getNivelNumeroMayor(){
		return this.nivelNumeroMayor;
	}
	
	public int getNivelNumeroMenor(){
		return this.nivelNumeroMenor;
	}
	
	
	public void updateAltura(int mayor, int nivel){
		if(mayor<nivel){
			this.altura=nivel;
		}
	}
	
	public void updateNivelNumeroMayor(long valor, long numeroMayor, int nivel){
		if(numeroMayor<valor ){
			this.numeroMayor=valor;
			this.nivelNumeroMayor = nivel;
		}
		
			
	}
	
	public void updateNivelNumeroMenor(long valor, long numeroMenor, int nivel){
		if(numeroMenor>valor){
			this.numeroMenor=valor;
			this.nivelNumeroMenor = nivel;
		}
	}
	
	public void inorder(Node raiz){
		if(raiz!=null){
			inorder(raiz.izquierdo);
			System.out.print(raiz.getDato()+" - ");
			inorder(raiz.derecho);
		}
	}
	
	public void postorder(Node raiz){
		if(raiz!=null){
			postorder(raiz.izquierdo);
			postorder(raiz.derecho);
			System.out.print(raiz.getDato()+" - ");
			
		}
	}
	
	public void preorder(Node raiz){
		if(raiz!=null){
			System.out.print(raiz.getDato()+" - ");
			preorder(raiz.izquierdo);
			preorder(raiz.derecho);
		}
	}
	
	public Node getRaiz(){
		return this.raiz;
	}
	
}
