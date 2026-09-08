import javax.swing.*;
import java.awt.*;

public class TextField {

    public static void main(String[] args) {

        // Create the main window
        JFrame frame = new JFrame("Text Field Example");

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        // =========================================================
        // LABEL
        // =========================================================

        // Similar to:
        // <label>Name:</label>

        JLabel label = new JLabel("Name:");


        // =========================================================
        // TEXT FIELD
        // =========================================================

        // Similar to:
        //
        // <input type="text" placeholder="Enter your name">

        JTextField textField = new JTextField(20);

        // 20 = number of columns
        // It is NOT exactly 20 pixels or 20 characters.


        // =========================================================
        // BUTTON
        // =========================================================

        JButton button = new JButton("Submit");


        // =========================================================
        // BUTTON CLICK
        // =========================================================

        // Similar to:
        //
        // <button onclick="submit()">Submit</button>

        button.addActionListener(e -> {

            // Get text from the text field
            String name = textField.getText();

            // Print it
            System.out.println("Name: " + name);

            // Show a popup
            JOptionPane.showMessageDialog(
                    frame,
                    "Hello, " + name + "!"
            );
        });


        // =========================================================
        // ENTER KEY
        // =========================================================

        // Pressing Enter inside the text field
        // can trigger the button.

        textField.addActionListener(e -> {

            String name = textField.getText();

            System.out.println("Enter pressed: " + name);
        });


        // =========================================================
        // PANEL
        // =========================================================

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout(
                FlowLayout.CENTER,
                10,
                100
        ));

        panel.add(label);
        panel.add(textField);
        panel.add(button);


        // Add panel to window
        frame.add(panel);


        // Show window
        frame.setVisible(true);
    }
}