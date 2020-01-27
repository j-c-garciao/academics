/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkanoid.ball;

import arkanoid.pad.GamePad;
import java.awt.Color;
import java.awt.Container;
import java.awt.Point;

/**
 *
 * @author jc_go
 * http://code-stream.blogspot.com/2012/03/arkanoid-like-java-based-game.html
 */
public class GameBall extends Ball{
    GamePad padBottom;
    public GameBall(Point p, Color c, int dx, int dy, int diameter, Container parent, GamePad padBottom){
        super(p, c, dx, dy, diameter, parent);
        this.padBottom = padBottom;
    }
     
    @Override
    public void move(){
        
        System.out.println("dirx    "+dx);
        System.out.println("diry    "+dy);
        
        System.out.println("px    "+p.x);
        System.out.println("py    "+p.y);
        System.out.println("padBotton.left      "+padBottom.left);
        System.out.println("padBotton.right     "+padBottom.right);
        
        if(dy < 0){ // ball moving up
            //if(p.y+dy < padTop.bottom){
                //if(p.x > padTop.left && p.x < padTop.right)
                    dy = -dy;
            //}
            if(p.y+dy < 0){
                throw new IllegalStateException();
            }
        }
        else{ // ball moving down
            //if(p.y+height+dy > padBottom.top){
                if(p.x > padBottom.left && p.x < padBottom.right)
                    dy = -dy;
            //}
            //if(p.y+height+dy > parent.getHeight()-parent.getInsets().bottom-height){
                
                
               
                
                
            //    System.out.println("ERROR");
            //    throw new IllegalStateException();   
            //}
        }
        
        System.out.println("dx    "+dx);
        
        
        if(dx < 0){ // ball moving left
            if(p.x+dx < 0)
                dx = -dx;
        }
        else{ // ball moving right
            //if(p.x+dx > parent.getWidth()-parent.getInsets().right-width)
                dx = -dx;
        }   
        p.x += dx;
        p.y += dy;
    }
}