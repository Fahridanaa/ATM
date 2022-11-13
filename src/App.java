import javax.swing.*;
import java.awt.event.*;

public class App implements ActionListener {
    private static JLabel ATMLabel;
    private static JTextField userNomor;
    private static JLabel PINLabel;
    private static JPasswordField userPIN;
    private static JButton loginButton;
    private static boolean isUser = false;

    private static int[][] user = {{123,123},{321,321}};

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setBounds(475,175,400,350);
        frame.setResizable(false);
        frame.setTitle("ATM Anjay");
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

        panel.setLayout(null);
        
        ATMLabel = new JLabel("No ATM");
        ATMLabel.setBounds(165,60,80,25);
        panel.add(ATMLabel);

        userNomor = new JTextField(20);
        userNomor.setBounds(110,90,165,25);
        panel.add(userNomor);

        PINLabel = new JLabel("PIN");
        PINLabel.setBounds(175,130,80,25);
        panel.add(PINLabel);

        userPIN = new JPasswordField();
        userPIN.setBounds(110,160,165,25);
        panel.add(userPIN);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 210, 80,25);
        loginButton.addActionListener(new App());
        panel.add(loginButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String id = userNomor.getText();
        String pin = userPIN.getText();

        for (int i = 0; i < App.user.length; i++) {
            if(Integer.parseInt(id) == App.user[i][0] && Integer.parseInt(pin) == App.user[i][1]){
                isUser = true;
                break;
            }
            isUser = false;
        }
        if(isUser){
            JOptionPane.showMessageDialog(null, "You are logged in!");
        }else {
            JOptionPane.showMessageDialog(null, "You are not logged in!");
        }
    }   
}
