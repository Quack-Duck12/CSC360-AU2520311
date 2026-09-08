import javax.swing.*;
import java.awt.*;

public class Inputs {

    public static void main(String[] args) {

        // =====================================================
        // FRAME
        // =====================================================

        JFrame frame = new JFrame("Student Registration");

        frame.setSize(600, 700);

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        frame.setLocationRelativeTo(null);


        // =====================================================
        // MAIN PANEL
        // =====================================================

        JPanel mainPanel = new JPanel(
                new BorderLayout(10, 10)
        );


        // =====================================================
        // HEADER
        // =====================================================

        JPanel headerPanel = new JPanel(
                new GridLayout(2, 1)
        );

        JLabel title =
                new JLabel("Student Registration");

        JLabel subtitle =
                new JLabel("Enter your details");

        headerPanel.add(title);
        headerPanel.add(subtitle);


        // =====================================================
        // FORM PANEL
        // =====================================================

        JPanel formPanel = new JPanel(
                new GridBagLayout()
        );

        GridBagConstraints gbc =
                new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.insets = new Insets(
                5, 5, 5, 5
        );


        // =====================================================
        // NAME
        // =====================================================

        JLabel nameLabel =
                new JLabel("Name:");

        JTextField nameField =
                new JTextField(20);

        addRow(
                formPanel,
                gbc,
                0,
                nameLabel,
                nameField
        );


        // =====================================================
        // PASSWORD
        // =====================================================

        JLabel passwordLabel =
                new JLabel("Password:");

        JPasswordField passwordField =
                new JPasswordField(20);

        addRow(
                formPanel,
                gbc,
                1,
                passwordLabel,
                passwordField
        );


        // =====================================================
        // GENDER
        // =====================================================

        JLabel genderLabel =
                new JLabel("Gender:");

        JRadioButton male =
                new JRadioButton("Male");

        JRadioButton female =
                new JRadioButton("Female");

        JRadioButton other =
                new JRadioButton("Other");


        ButtonGroup genderGroup =
                new ButtonGroup();

        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);


        JPanel genderPanel =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT
                        )
                );

        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);


        addRow(
                formPanel,
                gbc,
                2,
                genderLabel,
                genderPanel
        );


        // =====================================================
        // HOBBIES
        // =====================================================

        JLabel hobbiesLabel =
                new JLabel("Hobbies:");

        JCheckBox gaming =
                new JCheckBox("Gaming");

        JCheckBox coding =
                new JCheckBox("Coding");

        JCheckBox music =
                new JCheckBox("Music");


        JPanel hobbiesPanel =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT
                        )
                );

        hobbiesPanel.add(gaming);
        hobbiesPanel.add(coding);
        hobbiesPanel.add(music);


        addRow(
                formPanel,
                gbc,
                3,
                hobbiesLabel,
                hobbiesPanel
        );


        // =====================================================
        // COURSE
        // =====================================================

        JLabel courseLabel =
                new JLabel("Course:");

        JComboBox<String> course =
                new JComboBox<>(
                        new String[]{
                                "Computer Science",
                                "Mathematics",
                                "Physics",
                                "Chemistry"
                        }
                );

        addRow(
                formPanel,
                gbc,
                4,
                courseLabel,
                course
        );


        // =====================================================
        // AGE
        // =====================================================

        JLabel ageLabel =
                new JLabel("Age:");

        JSlider ageSlider =
                new JSlider(
                        10,
                        60,
                        18
                );

        addRow(
                formPanel,
                gbc,
                5,
                ageLabel,
                ageSlider
        );


        // =====================================================
        // QUANTITY
        // =====================================================

        JLabel quantityLabel =
                new JLabel("Quantity:");

        JSpinner quantity =
                new JSpinner(
                        new SpinnerNumberModel(
                                1,
                                1,
                                100,
                                1
                        )
                );

        addRow(
                formPanel,
                gbc,
                6,
                quantityLabel,
                quantity
        );


        // =====================================================
        // MESSAGE
        // =====================================================

        JLabel messageLabel =
                new JLabel("Message:");

        JTextArea message =
                new JTextArea(5, 20);

        JScrollPane messageScroll =
                new JScrollPane(message);

        addRow(
                formPanel,
                gbc,
                7,
                messageLabel,
                messageScroll
        );


        // =====================================================
        // SUBMIT BUTTON
        // =====================================================

        JButton submit =
                new JButton("Submit");


        JPanel buttonPanel =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.CENTER
                        )
                );

        buttonPanel.add(submit);


        // =====================================================
        // ADD TO MAIN PANEL
        // =====================================================

        mainPanel.add(
                headerPanel,
                BorderLayout.NORTH
        );

        mainPanel.add(
                formPanel,
                BorderLayout.CENTER
        );

        mainPanel.add(
                buttonPanel,
                BorderLayout.SOUTH
        );


        // =====================================================
        // ADD TO FRAME
        // =====================================================

        frame.add(mainPanel);

        frame.setVisible(true);
    }


    // =========================================================
    // HELPER METHOD
    // =========================================================

    static void addRow(
            JPanel panel,
            GridBagConstraints gbc,
            int row,
            JComponent label,
            JComponent component
    ) {

        // -------------------------------
        // Label column
        // -------------------------------

        gbc.gridx = 0;
        gbc.gridy = row;

        gbc.weightx = 0;

        panel.add(
                label,
                gbc
        );


        // -------------------------------
        // Input column
        // -------------------------------

        gbc.gridx = 1;

        gbc.weightx = 1;

        panel.add(
                component,
                gbc
        );
    }
}