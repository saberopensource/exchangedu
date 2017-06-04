package saberlife.socket.b;

import javax.swing.*;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017-06-04
 * If you don't konw it,Please ask Google
 */
public class MainWindows {

    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel downPanel;
    private JLabel addressLabel;
    private JLabel portLabel;
    private JTextField addressTextField;
    private JTextField portTextField;
    private JTextField message;
    private JTextField writeTextField;
    private JButton submitButton;
    private JButton lianjieButton;
    private JButton resButton;
    private JTextField text;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainWindows");
        frame.setContentPane(new MainWindows().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    protected void appendText(String str){
        text.setText("\n"+str);
    }
}
