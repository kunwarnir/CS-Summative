import javax.swing.*;

public class InitialWindow extends JFrame {

  private JPanel panel;
  private JLabel label;
  private JButton button;

  public InitialWindow(){

    super("Initial Window");

    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    label = new JLabel("This is the first frame");
    label.setBounds(150, 30, 300, 220);
    panel.add(label);

  }

}