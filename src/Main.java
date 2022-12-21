import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        JLabel label = new JLabel();
        label.setText("this is my label");

        JFrame frame = new JFrame();
        frame.setTitle("Flight Finder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set the default function on close
        frame.setResizable(false); // Can't resize
        frame.setSize(420,420);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("LOGO.png");
        frame.setIconImage(image.getImage()); // Change icon of frame
        frame.getContentPane().setBackground(new Color(5,10,25)); // Changes the color
        frame.add(label);
        ImageIcon img = new ImageIcon("LOGO.png");
        label.setIcon(img);

    }
}
