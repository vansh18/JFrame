import javax.swing.*;
import java.awt.*;

public class Main1
{
    public static void main(String[] args)
    {
        ImageIcon image = new ImageIcon("LOGO.png");

        JLabel label = new JLabel();
        label.setText("Bro do you even code?"); // Set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }
}