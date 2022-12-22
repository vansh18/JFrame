import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeNo_GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prime_GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final int FIELD_WIDTH = 20;
        frame.setSize(420,420);
        final JTextField numField = new JTextField(FIELD_WIDTH);
        final JTextField resField = new JTextField(FIELD_WIDTH);
        JButton checkPrimeButton = new JButton("NICE");
        checkPrimeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event)
            {
                int num = Integer.parseInt(numField.getText());
                boolean flag = true;
                int endNo = num - 1;
                for (int i=2; i <= endNo; i++ )
                {
                    if ( num % i == 0)
                    {
                        flag = false; break;
                    }
                }
                resField.setText("Prime = " + flag);

            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(numField);
        frame.add(checkPrimeButton);
        frame.add(resField);
        frame.setVisible(true);
    }
}