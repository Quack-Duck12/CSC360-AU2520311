import javax.swing.*;
import java.awt.*;

public class Dropdown {

        public static void main(String[] args) {

                // =====================================================
                // FRAME
                // =====================================================

                JFrame frame = new JFrame("Dropdown Example");

                frame.setSize(400, 250);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);

                // =====================================================
                // PANEL
                // =====================================================

                JPanel panel = new JPanel();

                panel.setLayout(
                                new FlowLayout(
                                                FlowLayout.CENTER,
                                                10,
                                                90));

                // =====================================================
                // LABEL
                // =====================================================

                JLabel label = new JLabel("Select a course:");

                // =====================================================
                // DROPDOWN
                // =====================================================

                // Similar to:
                //
                // <select>
                // <option>Computer Science</option>
                // <option>Mathematics</option>
                // <option>Physics</option>
                // </select>

                String[] courses = {
                                "Computer Science",
                                "Mathematics",
                                "Physics",
                                "Chemistry",
                                "Commerce"
                };

                JComboBox<String> dropdown = new JComboBox<>(courses);

                // =====================================================
                // BUTTON
                // =====================================================

                JButton button = new JButton("Submit");

                // =====================================================
                // DROPDOWN CHANGE EVENT
                // =====================================================

                // Runs whenever the user selects another option.

                dropdown.addActionListener(e -> {

                        String selected = (String) dropdown.getSelectedItem();

                        System.out.println(
                                        "Selected: " + selected);
                });

                // =====================================================
                // BUTTON CLICK
                // =====================================================

                button.addActionListener(e -> {

                        String selected = (String) dropdown.getSelectedItem();

                        JOptionPane.showMessageDialog(
                                        frame,
                                        "You selected: " + selected);
                });

                // =====================================================
                // ADD COMPONENTS
                // =====================================================

                panel.add(label);
                panel.add(dropdown);
                panel.add(button);

                frame.add(panel);

                // =====================================================
                // SHOW
                // =====================================================

                frame.setVisible(true);
        }
}