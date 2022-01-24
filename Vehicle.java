import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
import javax.swing.*;
import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.*; 

public class Vehicle{

  static ArrayList<String[]> list = new ArrayList<String[]>(); 
  static String[][] array;

  List<Vehicle> vehicleList = new ArrayList<Vehicle>();
  
  public enum Categories{
    SEDAN, SUV, COUPE, HATCHBACK, TRUCK;
  }

  public enum Colours{
    SILVER, WHITE, BLUE, BLACK, GRAY, ORANGE, RED, BROWN, GREEN, PINK;
  }

  public enum Types{
    NEW, USED;
  }

  public enum Statuses{
    DEMO, STOCK;
  }

  public Vehicle(int year, String name, Colours colour, String engine, int cylinders, Categories category, int price, Types type, Statuses status, int age){
    
  }
  
  public void buy(){
    
  }

  public void makeList(){
    read();

    for(int i = 0; i < list.size(); i++){
      vehicleList.add(new Vehicle())
    }
  }

 public static void read(){
    String path = "CarData.csv";
    String line = "";
       
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

    array = new String[list.size()][0];
    list.toArray(array);  

    System.out.println(array[6][4]);
    
  }

  public Vehicle transform(int index, String[][] array){

    int year = Integer.valueOf(array[index][0]);
    String name = array[index][1];
    Colours color;


    switch(array[index][2]){
      case "Silver": color = Colours.SILVER; break;
      case "White": color = Colours.WHITE; break;
      case "Blue": color = Colours.BLUE; break;
      case "Black": color = Colours.BLACK; break;
      case "Gray": color = Colours.GRAY; break;
      case "Orange": color = Colours.ORANGE; break;
      case "Red": color = Colours.RED; break;
      case "Brown": color = Colours.BROWN; break;
      case "Green": color = Colours.GREEN; break;
      case "Pink": color = Colours.PINK; break;
      default: System.out.println("Invalid");
    }

    String engineName = array[index][3];

    int cylindersnum = Integer.valueOf(array[index][4]);

    Categories cat;

    switch(array[index][5]){
      case "Sedan": cat = Categories.SEDAN; break;
      case "SUV": cat = Categories.SUV; break;
      case "Coupe": cat = Categories.COUPE; break;
      case "Hatchback": cat = Categories.HATCHBACK; break;
      case "Truck": cat = Categories.TRUCK; break;

      default: System.out.println("Invalid");
    }

    int price = Integer.valueOf(array[index][6]);
    int age =  Integer.valueOf(array[index][9]);

    Types type;

    switch(array[index][7]){
      case "New": type = Types.NEW; break;
      case "Used": type = Types.USED; break;
      default: System.out.println("Invalid");
    }

    Statuses stat;

    switch(array[index][8]){
      case "Demo": stat = Statuses.DEMO; break;
      case "Stock": stat = Statuses.STOCK; break;

      default: System.out.println("Invalid");
    }

    return new Vehicle(year, name, color, engineName, cylindersnum, cat, price, type, stat, age);

  }
}