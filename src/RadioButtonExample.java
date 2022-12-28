import javax.swing.*;
class RadioButtonExample extends JFrame
{
    JRadioButton rb1,rb2;
    JButton b;
    RadioButtonExample()
    {
        rb1=new JRadioButton("Male");
        rb1.setBounds(100,50,100,30);
        rb2=new JRadioButton("Female");
        rb2.setBounds(100,100,100,30);

        JFrame frame = new JFrame();
        b = new JButton("click");
        b.setBounds(100,150,80,30);
        b.addActionListener(e-> option());

        frame.add(rb1);
        frame.add(rb2);
        frame.add(b);

        frame.add(rb1);
        frame.add(rb2);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    void option()
    {
        if(rb1.isSelected())
        {
            JOptionPane.showMessageDialog(this,"You are Male.");
        }
        if(rb2.isSelected())
        {
            JOptionPane.showMessageDialog(this,"You are Female.");
        }
    }
    public static void main(String args[])
    {
        new RadioButtonExample();
    }
}
