package Question6;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test {
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
    
}}
