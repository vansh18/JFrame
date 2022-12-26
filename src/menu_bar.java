import javax.swing.*;


public class menu_bar
{
    JMenu menu;
    JMenuItem i1,i2,i3;
    menu_bar()
    {
        JFrame frame = new JFrame();
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Item1");
        i2 = new JMenuItem("Item2");
        i3 = new JMenuItem("Item3");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        mb.add(menu);

        frame.setJMenuBar(mb);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);

    }
    public static void main(String args[])
    {
        new menu_bar();
    }
}
