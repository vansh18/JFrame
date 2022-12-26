import javax.swing.*;

public class editor
{
    JMenu file,edit,help;
    JMenuItem cut,copy,paste,selectAll;
    JTextArea ta;
    public editor()
    {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");
        ta = new JTextArea();

        edit.add(cut);
        cut.addActionListener(e -> ta.cut());
        edit.add(copy);
        copy.addActionListener(e -> ta.copy());
        edit.add(paste);
        paste.addActionListener(e -> ta.paste());
        edit.add(selectAll);
        selectAll.addActionListener(e -> ta.selectAll());

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        ta.setBounds(5,5,360,320);
        frame.add(ta);
        frame.setJMenuBar(menuBar);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new editor();
    }
}
