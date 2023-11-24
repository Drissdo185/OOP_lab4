package Question5.Q5a.Q5b;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class q5b extends JPanel{

    public void paintComponent(Graphics g){
        int x = getSize().width / 2 - 10;
        int y = getSize().height/ 2 - 10;
        int width = 20;
        int height = 20;
        int startAngle = 0;
        int arcAngle = 180;
        int depth = 20;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, startAngle, -arcAngle);
            } else {
        
                x = x - 2 * depth;
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, startAngle, arcAngle);
        }
    }
}}