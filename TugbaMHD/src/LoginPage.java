import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPassword = new JPasswordField();
    JLabel userIDLabel = new JLabel("User-ID:");
    JLabel userPasswordLabel = new JLabel("User-Password:");
    JLabel messageLabel = new JLabel();
    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginInfoOriginal){
        logininfo = loginInfoOriginal;
        userIDLabel.setBounds(50,100,100,25);
        userPasswordLabel.setBounds(50,150,100,25);

        messageLabel.setBounds(125,250,300,35);
        messageLabel.setFont(new Font(null, Font.ROMAN_BASELINE,25));

        userIDField.setBounds(150,100,225,25);
        userPassword.setBounds(150,150,225,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPassword);
        frame.add(loginButton);
        frame.add(resetButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,550);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == resetButton){
            userIDField.setText("");
            userPassword.setText("");
        }
        if (e.getSource() == loginButton){
            String userID = userIDField.getText();
            String password = String.valueOf(userPassword.getPassword());

            if (logininfo.containsKey(userID)){
                if (logininfo.get(userID).equals(password)){
                    messageLabel.setForeground(Color.pink);
                    messageLabel.setText("Login Successful!");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong Password!");
                   //JOptionPane.showMessageDialog(null,"Wrong Password");
                }
            } else {
                messageLabel.setForeground(Color.cyan);
                messageLabel.setText("User Name Not Found!");
            }
        }

    }
}
