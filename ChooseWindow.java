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

  JPanel pnlFirst;
  JPanel pnlSedan;
  JPanel pnlSUV;
  JPanel pnlTruck;
  JPanel pnlCoupe;

  JTextArea txtDisplay;

  private Container base;
  private CardLayout layout = new CardLayout(); // create new cardlayout

  static VehicleList carList = VehicleList.getInstance();

  public ChooseWindow(){

    super("Choose Window"); // Set frame heading

    base = getContentPane();
    base.setLayout(layout);

    pnlFirst = First();
    pnlSedan = Sedan();
    pnlSUV = SUV();
    pnlTruck = Truck();
    pnlCoupe = Coupe();

    base.add(pnlFirst, "first");
    base.add(pnlSedan, "sedan");
    base.add(pnlSUV, "SUV");
    base.add(pnlTruck, "truck");
    base.add(pnlCoupe, "coupe");

    layout.show(base, "first");

    
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

    txtDisplay = new JTextArea(displayList("sedan"));
    txtDisplay.setBounds(215, 85, 175, 225);
    panel.add(txtDisplay);


    return panel;

  }

  public JPanel SUV(){
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel);

    txtDisplay = new JTextArea(displayList("SUV"));
    txtDisplay.setBounds(215, 85, 175, 225);
    panel.add(txtDisplay);

    return panel;

  }

  public JPanel Truck(){
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel);

    txtDisplay = new JTextArea(displayList("truck"));
    txtDisplay.setBounds(215, 85, 175, 225);
    panel.add(txtDisplay);

    return panel;

  }

  public JPanel Coupe(){
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);

    txtDisplay = new JTextArea(displayList("coupe"));
    txtDisplay.setBounds(215, 85, 175, 225);
    panel.add(txtDisplay);
    add(panel);

    return panel;

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()){
      case "Sedan":
        layout.show(base, "sedan");
        break;
      case "Truck":
        layout.show(base, "truck");
        break;
      case "SUV":
        layout.show(base, "SUV");
        break;
      case "Coupe":
        layout.show(base, "coupe");
        break;
    }
        
    
  }

  public static String displayList (String type){

    String displayString = " ";

    switch (type){
      case "sedan":
        for (Vehicle car: carList.getSedans()){
          displayString += car.getName() + "/n";
        }
        break;
      case "SUV":
        for (Vehicle car: carList.getSedans()){
          displayString += car.getName() + "/n";
        }
        break;
      case "truck":
        for (Vehicle car: carList.getSedans()){
          displayString += car.getName() + "/n";
        }
        break;
      case "coupe":
        for (Vehicle car: carList.getSedans()){
          displayString += car.getName() + "/n";
        }
        break;
      default: 
        System.out.println("Invalid");
    }

    return displayString;
  }

}