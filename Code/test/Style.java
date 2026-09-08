import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Style {

        public static void main(String[] args) {

                // =========================================================
                // FRAME
                // =========================================================

                JFrame frame = new JFrame("Swing Styling Example");

                frame.setSize(500, 350);

                // Close program when window is closed
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Center the window
                frame.setLocationRelativeTo(null);

                // =========================================================
                // MAIN PANEL
                // =========================================================

                JPanel panel = new JPanel();

                

                // Similar to:
                //
                // padding: 30px;
                //
                // EmptyBorder(top, left, bottom, right)

                panel.setBorder(
                                new EmptyBorder(30, 40, 30, 40));

                // BoxLayout places components vertically
                panel.setLayout(
                                new BoxLayout(panel, BoxLayout.Y_AXIS));

                // =========================================================
                // TITLE
                // =========================================================

                JLabel title = new JLabel("Registration Form");

                title.setFont(
                                new Font("Arial", Font.BOLD, 28));

                title.setAlignmentX(Component.CENTER_ALIGNMENT);

                // =========================================================
                // NAME LABEL
                // =========================================================

                JLabel nameLabel = new JLabel("Name:");

                nameLabel.setFont(
                                new Font("Arial", Font.PLAIN, 16));

                nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

                // =========================================================
                // TEXT FIELD
                // =========================================================

                JTextField nameField = new JTextField();

                // Similar to:
                //
                // width: 250px;
                // height: 35px;

                nameField.setMaximumSize(
                                new Dimension(250, 35));

                nameField.setFont(
                                new Font("Arial", Font.PLAIN, 18));

                // Padding inside the text field
                nameField.setBorder(
                                BorderFactory.createCompoundBorder(

                                                // Outer border
                                                BorderFactory.createLineBorder(
                                                                Color.GRAY,
                                                                1),

                                                // Inner padding
                                                BorderFactory.createEmptyBorder(
                                                                5, 10, 5, 10)));

                // =========================================================
                // BUTTON
                // =========================================================

                JButton button = new JButton("Submit");

                button.setFont(
                                new Font("Arial", Font.BOLD, 16));

                // Button size
                button.setPreferredSize(
                                new Dimension(120, 40));

                button.setMaximumSize(
                                new Dimension(120, 40));

                button.setAlignmentX(
                                Component.CENTER_ALIGNMENT);

                // Button colors
                button.setBackground(
                                new Color(70, 90, 220));

                button.setForeground(Color.WHITE);

                // Remove default button border
                button.setBorderPainted(false);

                // Make button opaque
                button.setOpaque(true);

                // =========================================================
                // BUTTON HOVER
                // =========================================================

                button.addMouseListener(new MouseAdapter() {

                        @Override
                        public void mouseEntered(MouseEvent e) {

                                // Similar to:
                                //
                                // button:hover {
                                // background: ...
                                // }

                                button.setBackground(
                                                new Color(50, 70, 190));
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {

                                // Return to normal color

                                button.setBackground(
                                                new Color(70, 90, 220));
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {

                                // Similar to:
                                //
                                // button:active

                                button.setBackground(
                                                new Color(30, 50, 150));
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {

                                button.setBackground(
                                                new Color(50, 70, 190));
                        }
                });

                // =========================================================
                // BUTTON CLICK
                // =========================================================

                button.addActionListener(e -> {

                        String name = nameField.getText();

                        if (name.isEmpty()) {

                                JOptionPane.showMessageDialog(
                                                frame,
                                                "Please enter your name!");

                        } else {

                                JOptionPane.showMessageDialog(
                                                frame,
                                                "Hello, " + name + "!");
                        }
                });

                // =========================================================
                // ADD COMPONENTS
                // =========================================================

                panel.add(title);

                // Similar to margin-bottom: 25px
                panel.add(
                                Box.createVerticalStrut(25));

                panel.add(nameLabel);

                // Similar to margin-bottom: 8px
                panel.add(
                                Box.createVerticalStrut(8));

                panel.add(nameField);

                // Similar to margin-bottom: 25px
                panel.add(
                                Box.createVerticalStrut(25));

                panel.add(button);

                // =========================================================
                // ADD PANEL TO FRAME
                // =========================================================

                frame.add(panel);

                // =========================================================
                // SHOW FRAME
                // =========================================================

                frame.setVisible(true);
        }
}