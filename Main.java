import javax.swing.*;
import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

class Main {
  public static void main(String[] args) {
    
    InitialWindow myFrame = new InitialWindow(); // create LabelFrame
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.setSize(600, 500); // set frame size
    myFrame.setVisible(true); // display frame

    read();

  }
  public static void read()
  {
    String path = "CarData.csv";
    String line = "";

    try
    {
      BufferedReader br = new BufferedReader(new FileReader(path));

      while((line = br.readLine()) != null) {
        String[] values = line.split(","); //ARRAY IS HERE
        System.out.println(values[1]);
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
}