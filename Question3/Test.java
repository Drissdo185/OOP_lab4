package Question3;

import javax.swing.JFrame;

public class Test {
    public static void main(String[] args) {
        LoopLine line = new LoopLine();

        JFrame frame1 = new JFrame();

        frame1.add(line);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(300, 350);
        frame1.setVisible(true);

        

    }
    
}
