package LectureSeven;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Yunalescca on 2017-07-05
 * Changes color of rectangle every second
 */
public class Lect7_4 extends JFrame{

    final int delay = 1000;
    private Color color = Color.BLACK;

    private class DemoPanel extends JPanel{

        private int x = 100;
        private int y = 100;

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            if(color == Color.BLACK){
                color = Color.WHITE;
            } else {
                color = Color.BLACK;
            }

            g.setColor(color);
            g.fillRect(x, y, 40, 20);
        }
    }

    public Lect7_4(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(300, 100);

        DemoPanel panel = new DemoPanel();
        panel.setBackground(Color.CYAN);

        Timer timer = new Timer(delay, e -> {
            repaint();
        });

        timer.start();

        add(panel);
        setVisible(true);
    }
}