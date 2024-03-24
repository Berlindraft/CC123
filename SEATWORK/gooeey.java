import javax.swing.*;

public class gooeey {
    public static void main(String[] args) {
        String msg = JOptionPane.showInputDialog("What do you want to display: ");
        String name = JOptionPane.showInputDialog("Enter your name: ");

        JOptionPane.showMessageDialog(null, "Greetings!"
                 + "\nMessage: " + msg + "\nName: " + name);
    }
}
