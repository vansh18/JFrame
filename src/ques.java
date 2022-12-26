import javax.swing.*;

public class ques
{
    JFrame frame;
    JComboBox box1,box2;
    JLabel label1,label2,label3,label4;
    JTextArea amountText;
    JButton convertButton;
    JTextArea convertedAmount;
    JButton clearButton;
    ques()
    {
        frame = new JFrame();
        label1 = new JLabel("Select Input Currency");
        label2 = new JLabel("Enter amount");
        label3 = new JLabel("Select Output Currency");
        label4 = new JLabel("Converted amount");
        amountText = new JTextArea();
        convertButton = new JButton("Convert");
        convertedAmount = new JTextArea();
        clearButton = new JButton("Clear");

        label1.setBounds(130,50,150,40);
        String[] curency = {"US Dollar", " Indian Ruppee"};
        box1 = new JComboBox(curency);
        box1.setBounds(300,50,100,30);

        label2.setBounds(130,100,150,40);
        amountText.setBounds(300,100,100,40);

        box2 = new JComboBox(curency);
        box2.setBounds(300,150,100,30);
        label3.setBounds(130,150,150,40);

        convertButton.setBounds(250,200,80,30);

        label4.setBounds(130,250,150,40);
        convertedAmount.setBounds(300,250,100,40);

        clearButton.setBounds(250,300,80,30);

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.add(box1);
        frame.add(box2);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(amountText);
        frame.add(convertButton);
        frame.add(convertedAmount);
        frame.add(clearButton);
    }
    public static void main(String[] args)
    {
        new ques();
    }
}
