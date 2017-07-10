package LectureSeven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Yunalescca on 2017-07-05
 * Changes color of background when button is pressed
 */
public class Lect7_2 extends JFrame{

    private class DemoPanel extends JPanel implements ActionListener{

        private Color color = Color.BLACK;

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //repaint();
            if(color == Color.BLACK) {
                color = Color.WHITE;
            } else {
                color = Color.BLACK;
            }

            setBackground(color);
        }
    }

    public Lect7_2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(300, 100);

        DemoPanel panel = new DemoPanel();
        panel.setBackground(Color.WHITE);

        JButton button = new JButton("Click me!");

        add(panel);
        panel.add(button, BorderLayout.NORTH);

        button.addActionListener(panel);

        setVisible(true);
    }
}