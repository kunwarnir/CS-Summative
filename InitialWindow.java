import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class InitialWindow extends JFrame implements ActionListener{

  private JPanel pnlInitial;
  private JPanel pnlAdmin;
  private JPanel pnlUser;
  private JLabel lblTitle;
  private JButton btnUser;
  private JButton btnAdmin;
  private JButton btnLogin;

  private Container base;
  private CardLayout layout = new CardLayout();

  public InitialWindow(){

    super("Initial Window");

    base = getContentPane();
    base.setLayout(layout);

    pnlInitial = initialPanel();
    pnlAdmin = adminPanel();
    pnlUser = userPanel();

    base.add(pnlInitial, "initial");
    base.add(pnlAdmin, "admin");
    base.add(pnlUser, "user");
    layout.show(base, "initial");

  }

  public JPanel initialPanel(){

    JPanel panel = new JPanel();
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

    return panel;
  }

  public JPanel adminPanel(){
    
    JPanel panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    btnLogin = new JButton("Login");
    btnLogin.setBounds(100, 350, 80, 50);
    btnLogin.setActionCommand("Login");
    btnLogin.addActionListener(this);
    panel.add(btnLogin);

    return panel;

  }

  public JPanel userPanel(){
    
    JPanel panel = new JPanel();

    return panel;

  }

  @Override
  public void actionPerformed(ActionEvent e) {

    switch (e.getActionCommand()){
      case "User":
        layout.show(base, "user");
        break;
      case "Admin":
        layout.show(base, "admin");
        break;
      case "Login":
        ChooseWindow myFrame = new ChooseWindow(); // create LabelFrame
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(500, 500); // set frame size
        myFrame.setVisible(true); // display frame
        this.dispose();
    }

  }

}