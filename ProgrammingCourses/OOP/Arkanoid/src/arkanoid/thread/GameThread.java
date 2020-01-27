/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkanoid.thread;

import arkanoid.ball.Shape;

/**
 *
 * @author jc_go
 * http://code-stream.blogspot.com/2012/03/arkanoid-like-java-based-game.html
 */
public class GameThread extends Thread{
    Shape shape;
    int speed;
 
    public GameThread(Shape shape, int speed, String name){
        super(name);
        this.shape = shape;
        this.speed = speed;
    }
 
    public void setSpeed(int speed){
        this.speed = speed;
    }
     
    @Override
    public void run(){
        try{
            while(true){
                System.out.println("Forever");
                shape.parent.repaint();
                System.out.println("Forever2");
                shape.move();
                try{
                    Thread.sleep(speed);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }
                
                System.out.println("Forever3");
                
                
            }
        }
        catch(IllegalStateException excp){            
        }
    }
} 