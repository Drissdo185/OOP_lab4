package Question4;

import javax.swing.JPanel;

public class LoopLine2 extends JPanel {

    public void paintComponent(java.awt.Graphics g) {

        super.paintComponent(g);

        int limit = 15;

        int width = getWidth();
        int height = getHeight();

        int widthIncrement = width / limit;
        int heightIncrement = height / limit;

        int count = 0;

        while (count < limit) {
            
            g.drawLine(0, count * heightIncrement, (count+1) * widthIncrement, height);
            


            // Source code for 4b, please uncomment to see the result
            /* 
            g.drawLine(width, count * heightIncrement, width - (count+1) * widthIncrement, height);
            g.drawLine(width, height - count * heightIncrement, width - (count+1) * widthIncrement, 0);
            g.drawLine(0, height - count * heightIncrement, (count+1) * widthIncrement, 0);
            */ 

            count++;
        }
    }
}