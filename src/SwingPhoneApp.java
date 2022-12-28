import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// A Swing application extends javax.swing.JFrame
public class SwingPhoneApp extends JFrame {
    private JButton[] btnNumbers;  // array
    private JButton btnCall;
    private JButton btnClear;
    private JTextField tfDisplay;
    private String strPhoneNumber = "";
    private boolean isCalling = false;

    public SwingPhoneApp() {
        // Get the content-pane of top-level container Jframe
        // Components are added onto content pane
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        // Set up the top display panel
        JPanel pnlDisplay = new JPanel(new FlowLayout());
        cp.add(pnlDisplay, BorderLayout.NORTH);

        // Set up the display text field
        tfDisplay = new JTextField(30);
        tfDisplay.setEditable(false);
        tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
        pnlDisplay.add(tfDisplay);

        // Set up the center button panel
        JPanel pnlButtons = new JPanel(new GridLayout(4, 3, 3, 3));
        cp.add(pnlButtons, BorderLayout.CENTER);

        // Set up a common listener for all number buttons
        MyNumberButtonListener lis = new MyNumberButtonListener();

        // Allocate the JButton array for number buttons
        btnNumbers = new JButton[10];
        // Allocate each of the item (JButton) of the array
        for (int i = 0; i < btnNumbers.length; ++i) {
            btnNumbers[i] = new JButton(i + "");
            // Add the common listener to each of the JButton
            btnNumbers[i].addActionListener(lis);
        }

        // Add the JButtons in the right order
        for (int i = 1; i <= 9; ++i) {
            pnlButtons.add(btnNumbers[i]);
        }

        btnClear = new JButton("CLEAR");
        pnlButtons.add(btnClear);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                strPhoneNumber = "";
                tfDisplay.setText(strPhoneNumber);
            }
        });

//    JDK 8 Lambda Expression
//    btnClear.addActionListener(e -> {strPhoneNumber = ""; tfDisplay.setText(strPhoneNumber);});

        pnlButtons.add(btnNumbers[0]);

        btnCall = new JButton("CALL");
        pnlButtons.add(btnCall);
        btnCall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isCalling) {
                    isCalling = false;
                    btnCall.setText("CALL");
                    // call(strPhoneNumber)
                } else {
                    isCalling = true;
                    btnCall.setText("HANG UP");
                    // hangup()
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Exit program if Jframe's close-window button clicked
        setSize(300, 250);
        setTitle("Swing Counter");
        setVisible(true);    // show it
    }

    // Named inner listener class for the number buttons
    private class MyNumberButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            strPhoneNumber += e.getActionCommand();
            tfDisplay.setText(strPhoneNumber);
        }
    }

    public static void main(String[] args) {
        // Recommended to run the GUI construction in
        //  Event Dispatching thread for thread-safe operations
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingPhoneApp(); // Let the constructor does the job
            }
        });
    }
}
