package Question2;

import javax.swing.JFrame;

public class Test {
    public static void main(String[] args) {
        drawLine line = new drawLine();

        JFrame frame = new JFrame();

        frame.add(line);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 350);
        frame.setVisible(true);
    }
    
}
