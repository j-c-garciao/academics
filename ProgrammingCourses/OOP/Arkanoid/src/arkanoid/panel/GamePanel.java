/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkanoid.panel;

import interfaces.Paintable;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author jc_go
 */

public class GamePanel extends JPanel{
    private final ArrayList<Paintable> list = new ArrayList<>();
    public void add(Paintable obj){
        this.list.add(obj);
    }
     
    public void remove(Paintable obj){
        if(list.contains(obj))
            list.remove(obj);
    }
     
    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D g = (Graphics2D) graphics;
        for(Paintable obj : list){
            obj.paint(g);
        }
    }

    public int getCount(){
        this.list.size();
        return 0;
   }
}