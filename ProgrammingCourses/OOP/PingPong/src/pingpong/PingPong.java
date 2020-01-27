/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;
/**
 *
 * @author jc_go
 * https://www.javaworld.com/article/2077137/synchronizing-threads-in-java--part-1.html
 */
public class PingPong {
    // state variable identifying whose turn it is.
    private String whoseTurn = null;

    public synchronized boolean hit(String opponent) {
       String x = Thread.currentThread().getName();
    
       if (opponent.compareTo("DONE") == 0) {
            whoseTurn = opponent;
            notifyAll();
            return false;
        }

        if (whoseTurn == null){
            whoseTurn = x;
            return true;
        }
        else{
            if(whoseTurn.compareTo("DONE") == 0)
                return false;
        }   
    
    if (x.compareTo(whoseTurn) == 0){
        System.out.println("PING! ("+x+")");
        whoseTurn = opponent;
        //notifyAll();
    } 
    else{
        try{
            long t1 = System.currentTimeMillis();
            wait(2500);
            if ((System.currentTimeMillis() - t1) > 2500) {
                //System.out.println("****** TIMEOUT! "+x+" is waiting for "+whoseTurn+" to play.");
              }
          } catch (InterruptedException e) { }
      }
      return true; // keep playing.
     }
 }