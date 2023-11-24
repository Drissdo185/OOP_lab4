package Question6;

import javax.swing.*;
import java.awt.*;

public class BarChart extends JPanel {
    private int[] numbers;
    private Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE};

    public BarChart(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.numbers != null) {
            int barHeight = getHeight() / (this.numbers.length * 2 + 1);
            int unitWidth = getWidth() / findMax(this.numbers);

            for (int i = 0; i < this.numbers.length; i++) {
                int x = 0;
                int y = i * barHeight * 2 + barHeight;
                int width = unitWidth * this.numbers[i];
                int height = barHeight;

                g.setColor(colors[i]);
                g.fillRect(x, y, width, height);
            }
        }
    }

    private int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Enter an integer:");
            numbers[i] = Integer.parseInt(input);
        }

        BarChart chart = new BarChart(numbers);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chart);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}