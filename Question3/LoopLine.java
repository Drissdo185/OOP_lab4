package Question3;

import java.awt.Graphics;

import javax.swing.JPanel;

public class LoopLine extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        int limit = 15;

        int width = getWidth();
        int height = getHeight();

        int widthIncrement = width / limit;
        int heightIncrement = height / limit;

        int count = 0;

        while(count < limit){

            g.drawLine(0,0,count * widthIncrement, height - count * heightIncrement);
            
            // source code for 3b, please uncomment to see the result
            /* 
            g.drawLine(width, height, count * widthIncrement, height - count * heightIncrement);
            g.drawLine(0, height, count * widthIncrement, count * heightIncrement);
            g.drawLine(width, 0, count * widthIncrement, count * heightIncrement);*/
                
            
    
                count++;
        }
        
    }
    
}
