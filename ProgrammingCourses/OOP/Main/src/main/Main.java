import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main extends JFrame {

    protected int minValue = 0;

    protected int maxValue = 100;

    protected int counter = 0;

    protected JProgressBar progressBar;

    public Main() {
        setSize(300, 100);

        UIManager.put("ProgressBar.selectionBackground", Color.RED);
        UIManager.put("ProgressBar.selectionForeground", Color.RED);
        UIManager.put("ProgressBar.foreground", Color.RED);

        progressBar = new JProgressBar();
        progressBar.setMinimum(minValue);
        progressBar.setMaximum(maxValue);
        progressBar.setStringPainted(true);

        JButton start = new JButton("Start");
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Thread runner = new Thread() {
                    public void run() {
                        counter = minValue;
                        while (counter <= maxValue) {
                            Runnable runme = new Runnable() {
                                public void run() {
                                    progressBar.setValue(counter);
                                }
                            };
                            SwingUtilities.invokeLater(runme);
                            counter++;
                            try {
                                Thread.sleep(100);
                            } catch (Exception ex) {
                            }
                        }
                    }
                };
                runner.start();
            }
        });

        getContentPane().add(progressBar, BorderLayout.CENTER);
        getContentPane().add(start, BorderLayout.WEST);

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}