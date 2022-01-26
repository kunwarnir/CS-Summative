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
  private JLabel lblUsername;
  private JLabel lblUsernameError;
  private JLabel lblPassword;
  private JLabel lblPasswordError;
  private JTextField txtUserName;
  private JPasswordField txtPassword;

  private final String pass = "password";

  public static Person client;

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

    lblTitle = new JLabel("Welcome to Barrhaven Hyundai!");
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

    lblUsername = new JLabel("Enter Your Username");
    lblUsername.setBounds(223, 30, 150, 25);
    panel.add(lblUsername);

    lblUsernameError = new JLabel("   ");
    lblUsernameError.setBounds(215, 100, 3000, 25);
    lblUsernameError.setFont(new Font("Serif", Font.PLAIN, 12));
    lblUsernameError.setForeground(Color.RED);
    panel.add(lblUsernameError);

    txtUserName = new JTextField(20);
    txtUserName.setBounds(225, 75, 150, 25);
    panel.add(txtUserName);

    lblPassword = new JLabel("Enter The Password");
    lblPassword.setBounds(223, 150, 3000, 25);
    panel.add(lblPassword);

    lblPasswordError = new JLabel("   ");
    lblPasswordError.setBounds(145, 215, 3000, 25);
    lblPasswordError.setFont(new Font("Serif", Font.PLAIN, 12));
    lblPasswordError.setForeground(Color.RED);
    panel.add(lblPasswordError);

    txtPassword = new JPasswordField(20);
    txtPassword.setBounds(225, 185, 150, 25);
    panel.add(txtPassword);

    btnLogin = new JButton("Login");
    btnLogin.setBounds(210, 350, 80, 50);
    btnLogin.setActionCommand("Login");
    btnLogin.addActionListener(this);
    panel.add(btnLogin);

    return panel;

  }

  public JPanel userPanel(){
    
    JPanel panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    lblUsername = new JLabel("Enter Your Username");
    lblUsername.setBounds(223, 30, 150, 25);
    panel.add(lblUsername);

    lblUsernameError = new JLabel("   ");
    lblUsernameError.setBounds(215, 100, 3000, 25);
    lblUsernameError.setFont(new Font("Serif", Font.PLAIN, 12));
    lblUsernameError.setForeground(Color.RED);
    panel.add(lblUsernameError);

    txtUserName = new JTextField(20);
    txtUserName.setBounds(225, 75, 150, 25);
    panel.add(txtUserName);
    
    btnLogin = new JButton("Login");
    btnLogin.setBounds(210, 350, 80, 50);
    btnLogin.setActionCommand("Login");
    btnLogin.addActionListener(this);
    panel.add(btnLogin);

    return panel;

  }

  @Override
  public void actionPerformed(ActionEvent e) {

    switch (e.getActionCommand()){
      case "User":
        layout.show(base, "user");
        client = User.getInstance();
        break;
      case "Admin":
        layout.show(base, "admin");
        client = Admin.getInstance();

        break;
      case "Login":
        ChooseWindow myFrame = new ChooseWindow(); // create LabelFrame
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600, 500); // set frame size
        myFrame.setVisible(true); // display frame
        this.dispose();
    }

  }

}