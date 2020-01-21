/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkanoid.pad;

import interfaces.Paintable;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 *
 * @author jc_go
 * http://code-stream.blogspot.com/2012/03/arkanoid-like-java-based-game.html
 */
public class GamePad implements Paintable{
    int top;
    int left;
    int bottom;
    int right;
    Color clr;
    Container parent;    
     
    final int dx = 12;
     
    public GamePad(int top, int left, int bottom, int right, Color clr, Container parent){
        super();
        this.top = top;
        this.left = left;
        this.bottom = bottom;
        this.right = right;
        this.clr = clr;
        this.parent = parent;
    }
 
    public void moveLeft(Graphics g1){
        if(left - dx < 0)
            return;
        left -= dx;
        right -= dx;
        
        System.out.println(left + " " + right);
        Graphics2D g = (Graphics2D) g1;
        paint(g);
    }
     
    public void moveRight(Graphics g1){
        if(right + dx > parent.getWidth())
            return;
        left += dx;
        right += dx;
        System.out.println(left + " " + right);
        Graphics2D g = (Graphics2D) g1;
        paint(g);
    }

    @Override
    public void paint(Graphics2D g){
        g.setColor(this.clr);
        g.fillRoundRect(left, top, right-left, bottom-top, 40, 8);
        g.setColor(Color.GRAY);
        g.drawRoundRect(left, top, right-left, bottom-top, 40, 8);         
    }
}