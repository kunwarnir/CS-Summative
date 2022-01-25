import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;





public class ChooseWindow extends JFrame implements ActionListener{
  
  JPanel panel;
  JButton btnSedan;
  JButton btnTruck;
  JButton btnSUV;
  JButton btnCoupe;


  public ChooseWindow(){

    super("Choose Window");

    JPanel panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    JFrame.getContentPane().setBackground(Color.YELLOW);
    btnSedan = new JButton("SEDAN");
    btnSedan.setBounds(0, 0, 250, 250);
    btnSedan.setActionCommand("Sedan");
    btnSedan.addActionListener(this);
    panel.add(btnSedan);

    btnTruck = new JButton("TRUCK");
    btnTruck.setBounds(0, 250, 250, 250);
    btnTruck.setActionCommand("Truck");
    btnTruck.addActionListener(this);
    panel.add(btnTruck);

    btnSUV = new JButton("SUV");
    btnSUV.setBounds(250, 0, 250, 250);
    btnSUV.setActionCommand("SUV");
    btnSUV.addActionListener(this);
    panel.add(btnSUV);

    btnCoupe = new JButton("COUPE");
    btnCoupe.setBounds(250, 250, 250, 250);
    btnCoupe.setActionCommand("Coupe");
    btnCoupe.addActionListener(this);
    panel.add(btnCoupe);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()){
      case "Sedan":
        DisplayWindow first = new DisplayWindow(); // create LabelFrame
        first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        first.setSize(600, 500); // set frame size
        first.setVisible(true); // display frame
        this.dispose();
        break;
      case "Truck":
        DisplayWindow second = new DisplayWindow(); // create LabelFrame
        second.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        second.setSize(600, 500); // set frame size
        second.setVisible(true); // display frame
        this.dispose();
        break;
      case "SUV":
        DisplayWindow third = new DisplayWindow(); // create LabelFrame
        third.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        third.setSize(600, 500); // set frame size
        third.setVisible(true); // display frame
        this.dispose();
        break;
      case "Coupe":
        DisplayWindow fourth = new DisplayWindow(); // create LabelFrame
        fourth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fourth.setSize(600, 500); // set frame size
        fourth.setVisible(true); // display frame
        this.dispose();
        break;
    }
        
    
  }

}