package Question4;

import javax.swing.JFrame;

public class Test {
    public static void main(String[] args) {
        LoopLine2 loopLine2 = new LoopLine2();
        JFrame frame = new JFrame();
        frame.add(loopLine2);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
