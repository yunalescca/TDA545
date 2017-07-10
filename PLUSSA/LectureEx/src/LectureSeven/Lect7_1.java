package LectureSeven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Yunalescca on 2017-07-05
 * Draws a rectangle where the mouse is pressed. Every other click draws a black rectangle, every other click draws a white one.
 */
public class Lect7_1 extends JFrame{

    private class DemoPanel extends JPanel implements MouseListener{

        private int x = -50;
        private int y = -50;

        private Color color = Color.BLACK;

        public void paintComponent(Graphics g){
            super.paintComponent(g);

            if(color == Color.BLACK){
                color = Color.WHITE;
            } else {
                color = Color.BLACK;
            }
            g.setColor(color);

            g.fillRect(x - 5, y - 5, 40, 20);
        }

        public void mouseClicked(MouseEvent e){
            x = e.getX();
            y = e.getY();
            repaint();
        }

        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
    }

    public Lect7_1(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(300,100);

        DemoPanel panel = new DemoPanel();
        panel.setBackground(Color.CYAN);

        panel.addMouseListener(panel);

        add(panel);
        setVisible(true);
    }
}