import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Btn extends JFrame implements ActionListener
{
    JButton button;
    Btn() {
        button = new JButton();
        button.setBounds(100, 100, 100, 100);
        button.addActionListener(this);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(button);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button)
        {
            System.out.println("I am clicked");
        }
    }
}
