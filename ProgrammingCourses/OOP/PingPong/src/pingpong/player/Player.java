/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong.player;
import pingpong.PingPong;

/**
 *
 * @author jc_go
 * https://www.javaworld.com/article/2077137/synchronizing-threads-in-java--part-1.html
 */
public class Player implements Runnable {
    PingPong myTable;   // Table where they play
    String myOpponent;
 
    public Player(String opponent, PingPong table) {
       myTable  = table;
       myOpponent = opponent;
    }
 
    public void run() {
        while(myTable.hit(myOpponent));
    }
}