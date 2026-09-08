import javax.swing.*;
import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;

public class Media {

        // =========================================================
        // AUDIO
        // =========================================================

        static Clip audioClip;

        public static void main(String[] args) {

                // =====================================================
                // FRAME
                // =====================================================

                JFrame frame = new JFrame("Image & Audio");

                frame.setSize(700, 500);

                frame.setDefaultCloseOperation(
                                JFrame.EXIT_ON_CLOSE);

                frame.setLocationRelativeTo(null);

                // =====================================================
                // MAIN PANEL
                // =====================================================

                JPanel mainPanel = new JPanel(
                                new BorderLayout(15, 15));

                mainPanel.setBorder(
                                BorderFactory.createEmptyBorder(
                                                20, 20, 20, 20));

                // =====================================================
                // IMAGE
                // =====================================================

                // Similar to:
                //
                // <img src="image.jpg">

                ImageIcon image = new ImageIcon("media/image.jpg");

                JLabel imageLabel = new JLabel(image);

                imageLabel.setHorizontalAlignment(
                                SwingConstants.CENTER);

                imageLabel.setBorder(
                                BorderFactory.createTitledBorder(
                                                "Image"));

                mainPanel.add(
                                imageLabel,
                                BorderLayout.CENTER);

                // =====================================================
                // AUDIO PANEL
                // =====================================================

                JPanel audioPanel = new JPanel(
                                new FlowLayout(
                                                FlowLayout.CENTER,
                                                10,
                                                10));

                audioPanel.setBorder(
                                BorderFactory.createTitledBorder(
                                                "Audio Controls"));

                // =====================================================
                // BUTTONS
                // =====================================================

                JButton playButton = new JButton("▶ Play");

                JButton pauseButton = new JButton("⏸ Pause");

                JButton stopButton = new JButton("⏹ Stop");

                JButton loopButton = new JButton("🔁 Loop");

                // =====================================================
                // LOAD AUDIO
                // =====================================================

                try {

                        File audioFile = new File("media/audio.wav");

                        AudioInputStream audioStream = AudioSystem.getAudioInputStream(
                                        audioFile);

                        audioClip = AudioSystem.getClip();

                        audioClip.open(audioStream);

                } catch (Exception e) {

                        JOptionPane.showMessageDialog(
                                        frame,
                                        "Could not load audio:\n"
                                                        + e.getMessage(),
                                        "Audio Error",
                                        JOptionPane.ERROR_MESSAGE);
                }

                // =====================================================
                // PLAY
                // =====================================================

                playButton.addActionListener(e -> {

                        if (audioClip != null) {

                                audioClip.start();
                        }
                });

                // =====================================================
                // PAUSE
                // =====================================================

                pauseButton.addActionListener(e -> {

                        if (audioClip != null) {

                                audioClip.stop();
                        }
                });

                // =====================================================
                // STOP
                // =====================================================

                stopButton.addActionListener(e -> {

                        if (audioClip != null) {

                                audioClip.stop();

                                // Return to beginning
                                audioClip.setFramePosition(0);
                        }
                });

                // =====================================================
                // LOOP
                // =====================================================

                loopButton.addActionListener(e -> {

                        if (audioClip != null) {

                                audioClip.loop(
                                                Clip.LOOP_CONTINUOUSLY);
                        }
                });

                // =====================================================
                // ADD BUTTONS
                // =====================================================

                audioPanel.add(playButton);
                audioPanel.add(pauseButton);
                audioPanel.add(stopButton);
                audioPanel.add(loopButton);

                // Add audio panel to bottom
                mainPanel.add(
                                audioPanel,
                                BorderLayout.SOUTH);

                // =====================================================
                // FRAME
                // =====================================================

                frame.add(mainPanel);

                frame.setVisible(true);
        }
}