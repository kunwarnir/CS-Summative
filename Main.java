import javax.swing.*;
import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.*;

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
    ArrayList<String[]> list = new ArrayList<String[]>();

    try
    {
      BufferedReader br = new BufferedReader(new FileReader(path));

      while((line = br.readLine()) != null) {
        list.add(line.split(",")); //ARRAY IS HERE
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    String[][] array = new String[list.size()][0];
    list.toArray(array);  

    System.out.println(array[6][4]);
    
  }
}