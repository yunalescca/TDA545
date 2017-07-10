import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Yunalescca on 2017-07-05.
 */
public class Demo1 extends JPanel implements ActionListener {

    Graphics2D g2;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Tjosan");
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g2 = (Graphics2D) g;

        g2.setColor(Color.BLACK);
        g2.fillRect(100, 75, 100, 80);
    }

    public Demo1(){
        setBackground(Color.BLUE);
        setLayout(new BorderLayout());

        JButton button = new JButton("Click me!");
        button.addActionListener(this);
        add(button, BorderLayout.NORTH);
    }
}
