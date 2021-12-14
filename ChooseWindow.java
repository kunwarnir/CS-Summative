import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class ChooseWindow extends JFrame implements ActionListener{
  
  JPanel panel;
  JButton btnCar;
  JButton btnTruck;
  JButton btnSUV;
  JButton btnMotorcycle;


  public ChooseWindow(){

    super("Choose Window");

    JPanel panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    btnCar = new JButton("CAR");
    btnCar.setBounds(0, 0, 250, 250);
    btnCar.setActionCommand("Car");
    btnCar.addActionListener(this);
    panel.add(btnCar);

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

    btnMotorcycle = new JButton("MOTORCYCLE");
    btnMotorcycle.setBounds(250, 250, 250, 250);
    btnMotorcycle.setActionCommand("Motorcycle");
    btnMotorcycle.addActionListener(this);
    panel.add(btnMotorcycle);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    
  }

}