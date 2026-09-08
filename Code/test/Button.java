import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button {

    public static void main(String[] args) {

        // Create the main window
        JFrame frame = new JFrame("Swing Button Example");

        // Window size
        frame.setSize(500, 300);

        // Close the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the window on the screen
        frame.setLocationRelativeTo(null);

        // =========================================================
        // CREATE BUTTON
        // =========================================================

        JButton button = new JButton("Click Me");

        // Set the size of the button
        button.setPreferredSize(new Dimension(150, 50));

        // Normal button background
        button.setBackground(Color.WHITE);

        // Normal text color
        button.setForeground(Color.BLACK);

        // =========================================================
        // CLICK EVENT
        // =========================================================
        // Similar to:
        //
        // <button onclick="clicked()">Click Me</button>
        //

        button.addActionListener(e -> {

            System.out.println("Button clicked!");

            // Change the text when clicked
            button.setText("Clicked!");
        });

        // =========================================================
        // MOUSE EVENTS
        // =========================================================
        // Similar to CSS:
        //
        // button:hover
        // button:active
        //

        button.addMouseListener(new MouseAdapter() {

            // -----------------------------------------------------
            // MOUSE ENTER
            // Similar to:
            //
            // button:hover
            // -----------------------------------------------------

            @Override
            public void mouseEntered(MouseEvent e) {

                // Change background when mouse enters
                button.setBackground(Color.BLUE);

                // Change text color
                button.setForeground(Color.WHITE);
            }

            // -----------------------------------------------------
            // MOUSE EXIT
            // Similar to leaving :hover
            // -----------------------------------------------------

            @Override
            public void mouseExited(MouseEvent e) {

                // Restore normal colors
                button.setBackground(Color.WHITE);
                button.setForeground(Color.BLACK);
            }

            // -----------------------------------------------------
            // MOUSE PRESS
            // Similar to:
            //
            // button:active
            // -----------------------------------------------------

            @Override
            public void mousePressed(MouseEvent e) {

                System.out.println("Mouse pressed");

                // Make the button darker while pressing
                button.setBackground(Color.DARK_GRAY);
                button.setForeground(Color.WHITE);
            }

            // -----------------------------------------------------
            // MOUSE RELEASE
            // -----------------------------------------------------

            @Override
            public void mouseReleased(MouseEvent e) {

                System.out.println("Mouse released");

                // Return to hover state
                button.setBackground(Color.BLUE);
                button.setForeground(Color.WHITE);
            }

            // -----------------------------------------------------
            // MOUSE CLICKED
            // -----------------------------------------------------

            @Override
            public void mouseClicked(MouseEvent e) {

                System.out.println("Mouse clicked");
            }
        });

        // =========================================================
        // PANEL
        // =========================================================

        // JPanel is similar to a <div> in HTML
        JPanel panel = new JPanel();

        // Center the button
        panel.setLayout(new FlowLayout(
                FlowLayout.CENTER,
                20,
                100));

        // Add button to panel
        panel.add(button);

        // Add panel to the JFrame
        frame.add(panel);

        // =========================================================
        // SHOW WINDOW
        // =========================================================

        frame.setVisible(true);
    }
}