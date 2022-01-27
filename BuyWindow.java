import javax.swing.*;

public class BuyWindow extends JFrame{

  private JPanel panel;
  private JLabel label;
  private JButton button;

  public BuyWindow(){ // buy window create

    super("Buy Window"); // buy vehicle button

    panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel); // panel added

    label = new JLabel("This is the Buying frame"); // displays the vehicle bought
    label.setBounds(150, 30, 300, 220); // set frame size
    panel.add(label); // panel added

  }

}