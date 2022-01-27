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
  JButton btnHatchback;
  JPanel pnlFirst;
  JPanel pnlSedan;
  JPanel pnlSUV;
  JPanel pnlTruck;
  JPanel pnlCoupe;

  JTextArea txtDisplay;
  
  JTextField choice;

  
  private Container base;
  private CardLayout layout = new CardLayout(); // create new cardlayout
  private JButton btnSubmit; // button for submit 


  static VehicleList carList = new VehicleList(); // car list created

  public ChooseWindow(){

    super("Choose Window"); // Set frame 

    base = getContentPane();
    base.setLayout(layout);

    pnlFirst = First();
    pnlSedan = Sedan();
    pnlSUV = SUV();
    pnlTruck = Truck();
    pnlCoupe = Coupe();

    base.add(pnlFirst, "first"); 
    base.add(pnlSedan, "sedan"); // sedan panel added
    base.add(pnlSUV, "SUV"); // suv panel added
    base.add(pnlTruck, "truck"); // truck panel added
    base.add(pnlCoupe, "coupe"); // coupe panel added

    layout.show(base, "first");

    
  }

  public JPanel First(){ // vehicle category panel
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel); // panel added

    btnSedan = new JButton(new ImageIcon("Images/category_sedan.png")); // button sedan created 
    btnSedan.setBounds(33, 25, 250, 200); // set frame size
    btnSedan.setActionCommand("Sedan");
    btnSedan.addActionListener(this);
    panel.add(btnSedan); // button added to screen

    btnTruck = new JButton(new ImageIcon("Images/category_truck.png")); // button truck created
    btnTruck.setBounds(33, 250, 250, 200); // set frame size
    btnTruck.setActionCommand("Truck");
    btnTruck.addActionListener(this);
    panel.add(btnTruck); // button added to screen

    btnSUV = new JButton(new ImageIcon("Images/category_suv.png")); // button suv created
    btnSUV.setBounds(313, 25, 250, 200); // set frame size
    btnSUV.setActionCommand("SUV");
    btnSUV.addActionListener(this);
    panel.add(btnSUV); // button added to screen

    btnCoupe = new JButton(new ImageIcon("Images/category_coupe.png")); // button coupe created
    btnCoupe.setBounds(313, 250, 250, 200); // set frame size
    btnCoupe.setActionCommand("Coupe");
    btnCoupe.addActionListener(this);
    panel.add(btnCoupe); // button added to screen

    return panel;
  }

  public JPanel Sedan(){ // sedan panel created 
  
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel); // panel added
// 
    txtDisplay = new JTextArea(displayList("sedan")); // new Jtextareas created
    txtDisplay.setBounds(215, 85, 175, 225); // set frame size
    panel.add(txtDisplay); // sedan display list added on screen

    choice = new JTextField(20); //user input here
    choice.setBounds(230, 320, 150, 25); // set frame size
    panel.add(choice); // text panel added to screen

    btnSubmit = new JButton("Submit"); // button user created
    btnSubmit.setBounds(260, 350, 90, 50); // set frame size
    btnSubmit.setActionCommand("Submit");
    btnSubmit.addActionListener(this);
    panel.add(btnSubmit); // button added to screen

    return panel;

  }

  public JPanel SUV(){ // suv panel created
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel);

    txtDisplay = new JTextArea(displayList("SUV")); // new Jtextarea created
    txtDisplay.setBounds(215, 85, 175, 225); // set frame size
    panel.add(txtDisplay); // suv display list added on screen

    choice = new JTextField(20); //user input here
    choice.setBounds(230, 320, 150, 25); // set frame size
    panel.add(choice); // text panel added to screen

    btnSubmit = new JButton("Submit"); // button user created
    btnSubmit.setBounds(260, 350, 90, 50); // set frame size
    btnSubmit.setActionCommand("Submit");
    btnSubmit.addActionListener(this);
    panel.add(btnSubmit); // button added to screen

    return panel;

  }

  public JPanel Truck(){ // truck panel created
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel);

    txtDisplay = new JTextArea(displayList("truck")); // new Jtextarea created
    txtDisplay.setBounds(215, 85, 175, 225); // set frame size
    panel.add(txtDisplay); // truck display list added on screen

    choice = new JTextField(20); //user input here
    choice.setBounds(230, 320, 150, 25); // set frame size
    panel.add(choice); // text panel added to screen

    btnSubmit = new JButton("Submit"); // button user created
    btnSubmit.setBounds(260, 350, 90, 50); // set frame size
    btnSubmit.setActionCommand("Submit");
    btnSubmit.addActionListener(this);
    panel.add(btnSubmit); // button added to screen

    return panel;

  }

  public JPanel Coupe(){ // coupe panel created
    JPanel panel = new JPanel(); // create new Jpanel
    panel.setLayout(null);
    add(panel); 

    txtDisplay = new JTextArea(displayList("coupe")); // new Jtextarea created
    txtDisplay.setBounds(215, 85, 175, 225); // set frame size
    panel.add(txtDisplay); 
    // coupe display list added on screen

    choice = new JTextField(20); //user input here
    choice.setBounds(230, 320, 150, 25); // set frame size
    panel.add(choice); // text panel added to screen

    btnSubmit = new JButton("Submit"); // button user created
    btnSubmit.setBounds(260, 350, 90, 50); // set frame size
    btnSubmit.setActionCommand("Submit");
    btnSubmit.addActionListener(this);
    panel.add(btnSubmit); // button added to screen

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
      case "Submit":
        try {
          
        }
    }
        
    
  }

  public static String displayList (String type){ // displays lists of vehicle type chosen

    String displayString = "";
    int i = 1; 

    switch (type){
      case "sedan":
        for (Vehicle car: carList.getSedans()){ // displays types of sedans 
          displayString += i + ". " + car.getName() + "\n";
          i++;
        }
        break;
      case "SUV":
        for (Vehicle car: carList.getSUVs()){ // displays types of suvs
          displayString += i + ". " +car.getName() + "\n";
          i++;
        }
        break;
      case "truck":
        for (Vehicle car: carList.getTrucks()){ // displays types of trucks
          displayString += i + ". " +car.getName() + "\n";
          i++;
        }
        break;
      case "coupe":
        for (Vehicle car: carList.getCoupes()){ // displays types of trucks
          displayString += i + ". " +car.getName() + "\n";
          i++;
        }
        break;
      default: 
        System.out.println("Invalid");

        
    }

    return displayString;
  }

}