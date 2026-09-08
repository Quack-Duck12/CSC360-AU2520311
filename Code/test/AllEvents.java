import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AllEvents {

    public static void main(String[] args) {

        // =========================================================
        // FRAME
        // =========================================================

        JFrame frame = new JFrame("Swing Events");

        frame.setSize(600, 400);

        // We'll manually handle closing so we can demonstrate
        // windowClosing() and windowClosed().
        frame.setDefaultCloseOperation(
                JFrame.DO_NOTHING_ON_CLOSE
        );

        frame.setLocationRelativeTo(null);


        // =========================================================
        // PANEL
        // =========================================================

        JPanel panel = new JPanel(
                new BorderLayout(10, 10)
        );


        // =========================================================
        // LABEL
        // =========================================================

        JLabel label = new JLabel(
                "Interact with the window and components"
        );

        label.setHorizontalAlignment(
                SwingConstants.CENTER
        );


        // =========================================================
        // TEXT FIELD
        // =========================================================

        JTextField textField =
                new JTextField();

        textField.setToolTipText(
                "Click here and type something"
        );


        // =========================================================
        // BUTTON
        // =========================================================

        JButton button =
                new JButton("Click Me");


        // =========================================================
        // STATUS LABEL
        // =========================================================

        JLabel status =
                new JLabel("Event: None");

        status.setHorizontalAlignment(
                SwingConstants.CENTER
        );


        // =========================================================
        // PANEL STRUCTURE
        // =========================================================

        panel.add(
                label,
                BorderLayout.NORTH
        );

        panel.add(
                textField,
                BorderLayout.CENTER
        );

        panel.add(
                button,
                BorderLayout.SOUTH
        );


        // =========================================================
        // FRAME EVENT
        //
        // WindowListener / WindowAdapter
        // =========================================================

        frame.addWindowListener(
                new WindowAdapter() {

                    // Window has been opened
                    @Override
                    public void windowOpened(
                            WindowEvent e
                    ) {

                        System.out.println(
                                "WINDOW: opened"
                        );

                        status.setText(
                                "Event: Window opened"
                        );
                    }


                    // User clicks X
                    @Override
                    public void windowClosing(
                            WindowEvent e
                    ) {

                        System.out.println(
                                "WINDOW: closing"
                        );

                        status.setText(
                                "Event: Window closing"
                        );

                        // Actually close the window
                        frame.dispose();
                    }


                    // Window has actually closed
                    @Override
                    public void windowClosed(
                            WindowEvent e
                    ) {

                        System.out.println(
                                "WINDOW: closed"
                        );
                    }


                    // Window becomes active
                    @Override
                    public void windowActivated(
                            WindowEvent e
                    ) {

                        System.out.println(
                                "WINDOW: activated"
                        );

                        status.setText(
                                "Event: Window activated"
                        );
                    }


                    // Window loses activation
                    @Override
                    public void windowDeactivated(
                            WindowEvent e
                    ) {

                        System.out.println(
                                "WINDOW: deactivated"
                        );

                        status.setText(
                                "Event: Window deactivated"
                        );
                    }


                    // Window minimized
                    @Override
                    public void windowIconified(
                            WindowEvent e
                    ) {

                        System.out.println(
                                "WINDOW: minimized"
                        );

                        status.setText(
                                "Event: Window minimized"
                        );
                    }


                    // Window restored
                    @Override
                    public void windowDeiconified(
                            WindowEvent e
                    ) {

                        System.out.println(
                                "WINDOW: restored"
                        );

                        status.setText(
                                "Event: Window restored"
                        );
                    }
                }
        );


        // =========================================================
        // COMPONENT EVENTS
        //
        // Resize / move / show / hide
        // =========================================================

        frame.addComponentListener(
                new ComponentAdapter() {

                    // Window resized
                    @Override
                    public void componentResized(
                            ComponentEvent e
                    ) {

                        int width =
                                frame.getWidth();

                        int height =
                                frame.getHeight();

                        System.out.println(
                                "COMPONENT: resized -> "
                                + width + " x " + height
                        );

                        status.setText(
                                "Size: "
                                + width
                                + " x "
                                + height
                        );
                    }


                    // Window moved
                    @Override
                    public void componentMoved(
                            ComponentEvent e
                    ) {

                        int x =
                                frame.getX();

                        int y =
                                frame.getY();

                        System.out.println(
                                "COMPONENT: moved -> "
                                + x + ", " + y
                        );

                        status.setText(
                                "Position: "
                                + x
                                + ", "
                                + y
                        );
                    }


                    // Window becomes visible
                    @Override
                    public void componentShown(
                            ComponentEvent e
                    ) {

                        System.out.println(
                                "COMPONENT: shown"
                        );

                        status.setText(
                                "Event: Window shown"
                        );
                    }


                    // Window becomes hidden
                    @Override
                    public void componentHidden(
                            ComponentEvent e
                    ) {

                        System.out.println(
                                "COMPONENT: hidden"
                        );
                    }
                }
        );


        // =========================================================
        // FOCUS EVENTS
        //
        // Applied to the JTextField
        // =========================================================

        textField.addFocusListener(
                new FocusAdapter() {

                    // Text field receives focus
                    @Override
                    public void focusGained(
                            FocusEvent e
                    ) {

                        System.out.println(
                                "FOCUS: gained"
                        );

                        status.setText(
                                "Event: Text field gained focus"
                        );
                    }


                    // Text field loses focus
                    @Override
                    public void focusLost(
                            FocusEvent e
                    ) {

                        System.out.println(
                                "FOCUS: lost"
                        );

                        status.setText(
                                "Event: Text field lost focus"
                        );
                    }
                }
        );


        // =========================================================
        // MOUSE EVENTS
        //
        // Applied to the button
        // =========================================================

        button.addMouseListener(
                new MouseAdapter() {

                    // Mouse enters button
                    @Override
                    public void mouseEntered(
                            MouseEvent e
                    ) {

                        System.out.println(
                                "MOUSE: entered"
                        );

                        status.setText(
                                "Event: Mouse entered button"
                        );
                    }


                    // Mouse leaves button
                    @Override
                    public void mouseExited(
                            MouseEvent e
                    ) {

                        System.out.println(
                                "MOUSE: exited"
                        );

                        status.setText(
                                "Event: Mouse exited button"
                        );
                    }


                    // Mouse button pressed
                    @Override
                    public void mousePressed(
                            MouseEvent e
                    ) {

                        System.out.println(
                                "MOUSE: pressed"
                        );

                        status.setText(
                                "Event: Mouse pressed"
                        );
                    }


                    // Mouse button released
                    @Override
                    public void mouseReleased(
                            MouseEvent e
                    ) {

                        System.out.println(
                                "MOUSE: released"
                        );

                        status.setText(
                                "Event: Mouse released"
                        );
                    }


                    // Mouse clicked
                    @Override
                    public void mouseClicked(
                            MouseEvent e
                    ) {

                        System.out.println(
                                "MOUSE: clicked"
                        );

                        status.setText(
                                "Event: Mouse clicked"
                        );
                    }
                }
        );


        // =========================================================
        // MOUSE MOTION EVENTS
        // =========================================================

        button.addMouseMotionListener(
                new MouseMotionAdapter() {

                    // Mouse is moving over button
                    @Override
                    public void mouseMoved(
                            MouseEvent e
                    ) {

                        System.out.println(
                                "MOUSE MOTION: moved"
                        );
                    }


                    // Mouse is moving while a button
                    // is being held down
                    @Override
                    public void mouseDragged(
                            MouseEvent e
                    ) {

                        System.out.println(
                                "MOUSE MOTION: dragged"
                        );
                    }
                }
        );


        // =========================================================
        // KEYBOARD EVENTS
        //
        // Applied to the text field
        // =========================================================

        textField.addKeyListener(
                new KeyAdapter() {

                    // Key is pressed
                    @Override
                    public void keyPressed(
                            KeyEvent e
                    ) {

                        System.out.println(
                                "KEY: pressed -> "
                                + e.getKeyChar()
                        );
                    }


                    // Key is released
                    @Override
                    public void keyReleased(
                            KeyEvent e
                    ) {

                        System.out.println(
                                "KEY: released -> "
                                + e.getKeyChar()
                        );
                    }


                    // Character has been typed
                    @Override
                    public void keyTyped(
                            KeyEvent e
                    ) {

                        System.out.println(
                                "KEY: typed -> "
                                + e.getKeyChar()
                        );
                    }
                }
        );


        // =========================================================
        // BUTTON ACTION EVENT
        // =========================================================

        button.addActionListener(
                e -> {

                    System.out.println(
                            "ACTION: button clicked"
                    );

                    status.setText(
                            "Event: Button action"
                    );
                }
        );


        // =========================================================
        // ADD STATUS LABEL
        // =========================================================

        JPanel bottomPanel =
                new JPanel(
                        new BorderLayout()
                );

        bottomPanel.add(
                status,
                BorderLayout.CENTER
        );


        // =========================================================
        // ADD EVERYTHING
        // =========================================================

        JPanel root =
                new JPanel(new BorderLayout());

        root.add(
                panel,
                BorderLayout.CENTER
        );

        root.add(
                bottomPanel,
                BorderLayout.SOUTH
        );

        frame.setContentPane(root);


        // =========================================================
        // SHOW FRAME
        // =========================================================

        frame.setVisible(true);
    }
}