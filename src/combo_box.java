import javax.swing.*;
public class combo_box
{
    JFrame frame;
    JComboBox box;
    JLabel label;
    public combo_box()
    {
        frame = new JFrame();
        label = new JLabel();
        JButton button = new JButton("Show");
        String lang[] = {"C","JAVA","PYTHON","JAVASCRIPT"};
        box = new JComboBox(lang);
        box.setBounds(10,10,80,40);
        button.setBounds(100,10,80,30);
        button.addActionListener(e->display());

        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);

        frame.add(box);
        frame.add(button);
        frame.add(label);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    void display()
    {
        String data = "Programming language: " + box.getItemAt(box.getSelectedIndex());
        label.setText(data);
        System.out.println("this is box.getSelectedIndex() " + box.getSelectedIndex());
        System.out.println("this is box.getItemAt() " + box.getItemAt(1));
    }
    public static void main(String args[])
    {
        new combo_box();
    }
}
