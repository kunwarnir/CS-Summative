import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class InitialWindow extends JFrame implements ActionListener{

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

    button = new JButton("Start");
    button.setBounds(260, 350, 80, 50);
    button.setActionCommand("Start");
    button.addActionListener(this);
    panel.add(button);

  }

  @Override
  public void actionPerformed(ActionEvent e) {

    switch (e.getActionCommand()){
      case "Start":
        BuyWindow myFrame = new BuyWindow();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600, 500); // set frame size
        myFrame.setVisible(true); // display frame

    }

  }

}