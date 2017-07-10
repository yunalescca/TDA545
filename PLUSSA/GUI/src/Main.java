import javax.swing.*;

/**
 * Created by Yunalescca on 2017-07-05.
 */
public class Main {

    static public void main(String[] args){

        JFrame frame = new JFrame("Demo 1"); //name of frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        frame.add(new Demo1());
        frame.setVisible(true);

    }
}
