import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class InitialWindow extends JFrame implements ActionListener{

  private JPanel panel;
  private JLabel lblTitle;
  private JButton btnUser;
  private JButton btnAdmin;

  private Container base;
  private CardLayout layout = new CardLayout();

  public InitialWindow(){

    super("Initial Window");

    base = getContentPane();
    base.setLayout(layout);

    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    lblTitle = new JLabel("This is the first frame");
    lblTitle.setBounds(150, 30, 300, 220);
    panel.add(lblTitle);

    btnUser = new JButton("User");
    btnUser.setBounds(260, 350, 80, 50);
    btnUser.setActionCommand("User");
    btnUser.addActionListener(this);
    panel.add(btnUser);

    btnAdmin = new JButton("Admin");
    btnAdmin.setBounds(100, 350, 80, 50);
    btnAdmin.setActionCommand("Admin");
    btnAdmin.addActionListener(this);
    panel.add(btnAdmin);

  }

  @Override
  public void actionPerformed(ActionEvent e) {

    switch (e.getActionCommand()){
      case "User":
        BuyWindow myFrame = new BuyWindow();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600, 500); // set frame size
        myFrame.setVisible(true); // display frame
        break;
      case "Admin":
        BuyWindow other = new BuyWindow();
        other.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        other.setSize(600, 500); // set frame size
        other.setVisible(true); // display frame

    }

  }

}