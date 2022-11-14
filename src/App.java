import javax.swing.*;
import java.awt.event.*;

public class App implements ActionListener {
    private static JLabel ATMLabel;
    private static JTextField userNomor;
    private static JLabel PINLabel;
    private static JPasswordField userPIN;
    private static JButton loginButton;
    private static boolean isUser = false;
    private static Menu menu = new Menu();
    private static JFrame frame = new JFrame();

    private static int[][] user = {{123,123},{321,321}};

    public static void main(String[] args) throws Exception {
        //Mengatur Layout aplikasi
        
        frame.setBounds(475,175,400,350);
        frame.setResizable(false);
        frame.setTitle("ATM Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

        //Menambahkan isi aplikasi
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        
        //text No ATM
        ATMLabel = new JLabel("No ATM");
        ATMLabel.setBounds(165,60,80,25);
        panel.add(ATMLabel);

        //Field untuk mengisi no ATM
        userNomor = new JTextField(20);
        userNomor.setBounds(110,90,165,25);
        panel.add(userNomor);

        //text PIN
        PINLabel = new JLabel("PIN");
        PINLabel.setBounds(175,130,80,25);
        panel.add(PINLabel);

        //Field untuk mengisi PIN
        userPIN = new JPasswordField();
        userPIN.setBounds(110,160,165,25);
        panel.add(userPIN);

        //Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(150, 210, 80,25);
        loginButton.addActionListener(new App());
        panel.add(loginButton);

        frame.setVisible(true);
    }

    //Pengecekan jika tombol button ditekan
    @Override
    public void actionPerformed(ActionEvent e) {
        //Mengambil data yang diinputkan user
        String id = userNomor.getText(); //id
        String pin = userPIN.getText(); //pin

        //Pengecekan id dan pin
        for (int i = 0; i < App.user.length; i++) {
            if(Integer.parseInt(id) == App.user[i][0] && Integer.parseInt(pin) == App.user[i][1]){
                isUser = true;
                break;
            }
            isUser = false;
        }
        //output dari pengecekan
        if(isUser){
            JOptionPane.showMessageDialog(null, "You are logged in!");
            frame.setVisible(false);
            menu.menuAnjay();
        }else {
            JOptionPane.showMessageDialog(null, "You are not logged in!");
        }
    }   
}
