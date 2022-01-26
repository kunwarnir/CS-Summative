import javax.swing.*;

public class BuyWindow extends JFrame{

  private JPanel panel;
  private JLabel label;
  private JButton button;

  public BuyWindow(){

    super("Buy Window"); 

    panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    label = new JLabel("This is the Buying frame");
    label.setBounds(150, 30, 300, 220);
    panel.add(label);

  }

}