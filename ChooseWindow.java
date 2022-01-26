import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


// This is where the user or admin will be able to choose what vehicle they want to either buy or view


public class ChooseWindow extends JFrame implements ActionListener{
  
  JPanel panel;
  JButton btnSedan;
  JButton btnTruck;
  JButton btnSUV;
  JButton btnCoupe;


  public ChooseWindow(){

    super("Choose Window"); // user or admin chooses what vehicle they want

    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel);
    this.getContentPane().setBackground(Color.YELLOW);

    
  }

  public JPanel First(){
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel);

    btnSedan = new JButton("SEDAN"); // button sedan created 
    btnSedan.setBounds(0, 0, 250, 250); // set frame size
    btnSedan.setActionCommand("Sedan");
    btnSedan.addActionListener(this);
    panel.add(btnSedan); // button added to screen

    btnTruck = new JButton("TRUCK"); // button truck created
    btnTruck.setBounds(0, 250, 250, 250); // set frame size
    btnTruck.setActionCommand("Truck");
    btnTruck.addActionListener(this);
    panel.add(btnTruck); // button added to screen

    btnSUV = new JButton("SUV"); // button suv created
    btnSUV.setBounds(250, 0, 250, 250); // set frame size
    btnSUV.setActionCommand("SUV");
    btnSUV.addActionListener(this);
    panel.add(btnSUV); // button added to screen

    btnCoupe = new JButton("COUPE"); // button coupe created
    btnCoupe.setBounds(250, 250, 250, 250); // set frame size
    btnCoupe.setActionCommand("Coupe");
    btnCoupe.addActionListener(this);
    panel.add(btnCoupe); // button added to screen

    return panel;
  }

  public JPanel Sedan(){
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel);

    return panel;

  }

  public JPanel SUV(){
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel);

    return panel;

  }

  public JPanel Truck(){
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel);

    return panel;

  }

  public JPanel Coupe(){
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel);

    return panel;

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