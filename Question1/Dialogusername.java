package Question1;

import javax.swing.JOptionPane;

public class Dialogusername {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("What is your name?");
        String message = String.format("Welcome %s to Java Programming!", username);
        JOptionPane.showMessageDialog(null, message);
    }
}