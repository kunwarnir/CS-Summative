import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class DisplayWindow extends JFrame implements ActionListener{

  private JPanel panel;
  private JLabel lblTitle;
  private JButton btn;

  private Container base;
  private CardLayout layout = new CardLayout(); // create new cardlayout

  public DisplayWindow(){

    super("Display Window");

    base = getContentPane();
    base.setLayout(layout);

    panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel); // panel added
    
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    
  }
}