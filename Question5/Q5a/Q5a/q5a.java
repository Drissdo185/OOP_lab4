package Question5.Q5a.Q5a;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class q5a  extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.BLACK);

        int xcoordinate = getWidth()/2;
        int ycoordinate = getHeight()/2;

        int radius = 0;

        for(int i = 0; i < 15; i++){
            int newX = xcoordinate;
            int newY = ycoordinate;

            if(i%2==0){
                radius += 30; // increase radius by 10
            }

            switch (i%4) {
                case 0:
                    newY += radius;
                    
                    break;
                case 1:
                    newX -= radius;
                    break;
                case 2:
                    newY -= radius;
                    break;
                case 3:
                    newX += radius;
                    break;
            }

            g.drawLine(xcoordinate, ycoordinate, newX, newY);

            xcoordinate = newX;
            ycoordinate = newY;



    }

    
}}
