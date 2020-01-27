/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkanoid.ball;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author jc_go
 * http://code-stream.blogspot.com/2012/03/arkanoid-like-java-based-game.html
 */

public class Ball extends Shape{    
    Ball(Point p, Color c, int dx, int dy, int diameter, Container parent){
        super(p, c, dx, dy, diameter, diameter, parent);
    }
     
    @Override
    public void paint(Graphics2D g){
        g.setColor(this.c);
        g.fill(new Ellipse2D.Double(p.x, p.y, width, width));
        g.setColor(Color.GRAY);
        g.drawOval(p.x, p.y, width, width);
    }
}