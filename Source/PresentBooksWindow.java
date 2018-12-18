import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PresentBooksWindow {
    private ActionListener actionListener;
    private JFrame mainFrame;
    //private GameInfo gameInfo = new GameInfo();

    private JTextField searchBarTextField = new JTextField();

    PresentBooksWindow(ActionListener actionListener, JFrame frame)
    {
        this.actionListener = actionListener;
        this.mainFrame = frame;
    }

    public void display() {
        mainFrame.getContentPane().removeAll();
        mainFrame.getContentPane().setBackground( java.awt.Color.DARK_GRAY );
        mainFrame.setLayout(new GridBagLayout());

        System.out.println("Drawing the PresentBooksWindow...");

        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBackground(Color.BLACK);
        loginLabel.setForeground(Color.white);
        loginLabel.setOpaque(true);
        loginLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBackground(Color.BLACK);
        passwordLabel.setForeground(Color.white);
        passwordLabel.setOpaque(true);
        passwordLabel.setHorizontalAlignment(JLabel.CENTER);

        //Creating the Start Button
        JButton loginBTN = new JButton("Log In");
        loginBTN.addActionListener(actionListener);
        loginBTN.setBackground(Color.BLACK);
        loginBTN.setForeground(Color.white);

        //Creating the Center Panel
        JPanel panel = new JPanel(new GridLayout(11, 1, 20, 1));
        panel.setBounds(0,0,500 ,800);
        panel.setPreferredSize(new Dimension(700, 750));
        panel.setBackground(Color.DARK_GRAY);

        panel.add(searchBarTextField);
        for(int i=0; i<9; i++)
        {
            JButton bookBTN = new JButton("Book"+i);
            bookBTN.addActionListener(actionListener);
            bookBTN.setBackground(Color.BLACK);
            bookBTN.setForeground(Color.white);
            panel.add(bookBTN);
        }

        JButton backBTN = new JButton("Logout");
        backBTN.addActionListener(actionListener);
        backBTN.setBackground(Color.BLACK);
        backBTN.setForeground(Color.white);
        panel.add(backBTN);


        //Creating the main (full) window
        JPanel main = new JPanel();
        main.setBounds(0,0,1000,800);
        main.setLayout(new BorderLayout());
        main.add(panel, BorderLayout.CENTER);

        mainFrame.add(main);

        mainFrame.revalidate();
        mainFrame.repaint();
        mainFrame.setVisible(true);

    }
}