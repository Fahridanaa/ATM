import javax.swing.JFrame;

public class Menu {
    public void menuAnjay() {
        JFrame menuFrame = new JFrame();
        menuFrame.setBounds(475, 175, 400, 350);
        menuFrame.setResizable(false);
        menuFrame.setTitle("ATM Anjay");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setVisible(true);
    }
}
