package Question2;

import javax.swing.JPanel;
import java.awt.Graphics;

public class drawLine extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        g.drawLine(0, 0, width, height); // cross diagonal
        g.drawLine(0, height, width, 0); // cross diagonal

        g.drawLine(width / 2, 0, width / 2, height); // vertical
        g.drawLine(0, height / 2, width, height / 2); // horizontal
    }
    
}
