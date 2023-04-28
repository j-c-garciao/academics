/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.general;

/**
 *
 * @author jc_go
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Graph g = new Graph(5);
       
       g.getData();
       
       g.setArc(1, 1);
       g.setArc(2, 1);
       g.setArc(3, 1);
       g.setArc(2, 4);
       g.setArc(4, 5);
       g.setArc(5, 3);
       
       //g.setDummy(56);
       //g.getDummy();
       
       
       g.printArcs();
        System.out.println("");
       g.printGraph();
       
        System.out.println("");
       Graph g1 = new Graph(3);
       g1.setArc(2, 3);
       g1.setArc(3, 1);
       g1.setArc(1, 2);
       g1.printGraph();
       
       
    }
    
}
