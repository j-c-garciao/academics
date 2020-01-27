/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import pingpong.PingPong;
import pingpong.player.Player;

/**
 *
 * @author jc_go
 * Adapted from
 * https://www.javaworld.com/article/2077137/synchronizing-threads-in-java--part-1.html
 * 
 * 
 */
public class Game {
    public static void main(String args[]) {
       PingPong table = new PingPong();
       Thread alice = new Thread(new Player("bob", table));
       Thread bob   = new Thread(new Player("peter", table));
       Thread peter   = new Thread(new Player("alice", table));
       alice.setName("alice");
       bob.setName("bob");
       peter.setName("peter");
       alice.start();    // alice empieza jugando
       bob.start();      // bob 
       peter.start();    //peter 
       
      /* try {
           // Esperar 5 segundos
           Thread.currentThread().sleep(5000);
       } catch (InterruptedException e) { }

       table.hit("DONE"); //Finalizar Juego.
       try {
           Thread.currentThread().sleep(1000);
       } catch (InterruptedException e) { }*/
    }
}