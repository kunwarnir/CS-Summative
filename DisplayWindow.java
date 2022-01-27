import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class DisplayWindow extends JFrame implements ActionListener{ // display window created

  private JPanel panel;
  private JLabel lblTitle;
  private JButton btn;

  private Container base;
  private CardLayout layout = new CardLayout(); // create new cardlayout

  public DisplayWindow(){ // display panel added

    super("Display Window"); // display window shown on screen

    base = getContentPane();
    base.setLayout(layout);

    panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    panel.setBackground(new Color(176,216,230)); 
    add(panel); // panel added
    
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    
  }
}