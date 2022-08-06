import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello World!");

    WelcomePage(String userID){
        welcomeLabel.setBounds(0,0,250,35);
        welcomeLabel.setFont(new Font(null,Font.CENTER_BASELINE,25));
        welcomeLabel.setText("Hello Dear, " + userID);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,550);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
