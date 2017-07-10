package LectureSeven;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Yunalescca on 2017-07-10.
 * Creates a simple rectangle which changes position and size when the size of the window changes
 */
public class Lect7_5 extends JFrame {

    private class Panel extends JPanel{

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawRect(this.getWidth()/5, this.getHeight()/5, this.getWidth()/5 ,this.getHeight()/5);
        }
    }



    public Lect7_5(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(200, 300);
        setLocation(50, 50);
        Panel panel = new Panel();
        add(panel);

        setVisible(true);
    }

}
