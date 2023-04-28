/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.general;

public class Graph {
    //ATRIBUTOS
    int nodes;
    int arcs [][];

    //CONSTRUCTOR
    public Graph(int nodes) {
        this.nodes = nodes;
        this.arcs = new int[nodes][nodes];
    }
   
    void getData(){
        System.out.println("HOLA MUNDO");
    }
    
    
    //OPERACIONES/FUCIONES/METODOS
    public int getNodes() {
        return nodes;
    }

    public void setArc(int i, int j) {
        this.arcs[i-1][j-1]=1;
    }
    
    public void printGraph() {
        for (int i=0; i<this.nodes;i++){
            for (int j=0; j<this.nodes;++j){
                System.out.print(arcs[i][j]+" ");
           }
            System.out.println("");        
        }
    }
    
    public void printArcs() {
        for (int i=0; i<this.nodes;i++){
            for (int j=0; j<this.nodes;++j){
                if(arcs[i][j]==1){
                    System.out.println((i+1)+" -> "+(j+1));
                }
           }       
        }
    }    
}
