/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkanoid.board;

import arkanoid.ball.GameBall;
import arkanoid.pad.GamePad;
import arkanoid.panel.GamePanel;
import arkanoid.thread.GameThread;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author jc_go
 * http://code-stream.blogspot.com/2012/03/arkanoid-like-java-based-game.html
 */
public class Board extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Board
     */  
    
    GameBall ball1;
    GameBall ball2;
    
    GameThread gameThread;
    GameThread gameThread2;
     
    final static int SLOW = 100;
    static final int NORMAL = 60;
    static final int FAST = 30;
        
    int speed;
    
    public Board() {
        
        this.speed = NORMAL;
        GamePanel panel = new GamePanel();
        panel.setBackground(Color.WHITE);
                                //ALT  IZQ  ALT+PRO ANC  
        GamePad pad = new GamePad(580, 100, 600,    200, Color.ORANGE, this);  
        
        
        //MENU
        JMenuBar menuBar = new JMenuBar();        
        JMenu gameMenu = new JMenu("Game");
        menuBar.add(gameMenu);        
        JMenuItem playItem = new JMenuItem("Play");
        gameMenu.add(playItem);
        
        playItem.setActionCommand("PLAY");
        playItem.addActionListener(this);
        
        gameMenu.addSeparator();
        
        //BOTONES
        
         ButtonGroup btnGroup = new ButtonGroup();
         JRadioButtonMenuItem rbMenuItem = new JRadioButtonMenuItem("Speed: SLOW");
         rbMenuItem.setActionCommand("SLOW");
         rbMenuItem.addActionListener(this);
         btnGroup.add(rbMenuItem);
         gameMenu.add(rbMenuItem);   
        
         rbMenuItem = new JRadioButtonMenuItem("Speed: NORMAL");
         rbMenuItem.setActionCommand("NORMAL");
         rbMenuItem.addActionListener(this);
         btnGroup.add(rbMenuItem);
         gameMenu.add(rbMenuItem);   
        
         rbMenuItem = new JRadioButtonMenuItem("Speed: FAST");
         rbMenuItem.setActionCommand("NORMAL");
         rbMenuItem.addActionListener(this);
         btnGroup.add(rbMenuItem);
         gameMenu.add(rbMenuItem);   
        
        // GAME      
        panel.remove(ball1);
        panel.remove(ball2);
        Random r = new Random();
        ball1 = new GameBall(new Point(r.nextInt(650)+10, 100), Color.RED, 1, 1, 10, panel, pad);
        panel.add(ball1);
        ball2 = new GameBall(new Point(r.nextInt(450)+10, 100), Color.BLUE, 1, 1, 10, panel, pad);
        panel.add(ball2);
        gameThread = new GameThread(ball1, speed, "GameThread");
        gameThread2 = new GameThread(ball2, speed, "GameThread");
        
        
        panel.add(pad);
        this.add(panel, BorderLayout.CENTER);
        this.add(menuBar, BorderLayout.NORTH);
        
        this.addKeyListener(new KeyAdapter() {
             @Override
             public void keyPressed(KeyEvent e) 
             {                
                 int keyCode = e.getKeyCode();
                 
                 switch(keyCode)
                 {
                 case 39:
                     pad.moveRight(panel.getGraphics());
                     repaint();
                     break;
                 case 37:
                    pad.moveLeft(panel.getGraphics());
                    repaint();
                     break;
                 case 68:
                     pad.moveRight(panel.getGraphics());
                     repaint();
                     break;
                 case 65: 
                     pad.moveLeft(panel.getGraphics());
                     repaint();
                     break;
                 }                    
             }
         });
    //initComponents();
    
    this.setTitle("Arkanoid - UdC");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(700, 650);
    this.setResizable(false); 

    }
    
    
  @Override
   public void actionPerformed(ActionEvent e){
       
         if(this.gameThread != null){
             
             System.out.println("Action "+e.getActionCommand());
             
             
             if(e.getActionCommand().equals("PLAY")){
                initGame(gameThread);
                initGame(gameThread2);
        
             }
             else if(e.getActionCommand().equals("SLOW"))
             {
                 this.speed = SLOW;
                 this.gameThread.setSpeed(SLOW);
            }
            else if(e.getActionCommand().equals("NORMAL"))
             {
                 this.speed = NORMAL;
                 this.gameThread.setSpeed(NORMAL);
             }
             else if(e.getActionCommand().equals("FAST"))
             {
                 this.speed = FAST;
                 this.gameThread.setSpeed(FAST);
             }
         }
     }
   
    
    
    private void initGame(GameThread gt){
        gt.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}