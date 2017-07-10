package LectureSeven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Yunalescca on 2017-07-05
 * Moves a rectangle around
 */
public class Lect7_3 extends JFrame{

    private class DemoPanel extends JPanel implements KeyListener{

        private int x = 100;
        private int y = 100;
        private int move = 5;

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.fillRect(x, y, 40, 20);
            g.setColor(Color.WHITE);

            if(g.getColor() == Color.WHITE){
                g.setColor(Color.BLACK);
            } else {
                g.setColor(Color.BLACK);
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {

            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                x += move;
                repaint();
            }

            if(e.getKeyCode() == KeyEvent.VK_LEFT){
                x -= move;
                repaint();
            }

            if(e.getKeyCode() == KeyEvent.VK_UP){
                y -= move;
                repaint();
            }

            if(e.getKeyCode() == KeyEvent.VK_DOWN){
                y += move;
                repaint();
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {}
    }

    public Lect7_3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(300, 100);

        DemoPanel panel = new DemoPanel();
        panel.setBackground(Color.CYAN);
        addKeyListener(panel);

        add(panel);
        setVisible(true);
    }
}