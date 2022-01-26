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

// Main vehicle information screen
public class Vehicle{
// ARRAY LIST HERE
  static ArrayList<String[]> list = new ArrayList<String[]>(); 
  static String[][] array;

  List<Vehicle> vehicleList = new ArrayList<Vehicle>();
  
  public enum Categories{
    SEDAN, SUV, COUPE, HATCHBACK, TRUCK; // model of car
  }

  public enum Colours{
    SILVER, WHITE, BLUE, BLACK, GRAY, ORANGE, RED, BROWN, GREEN, PINK; // Colour of vehicles
  }

  public enum Types{
    NEW, USED; // type of car
  }

  public enum Statuses{
    DEMO, STOCK; // car status
  }

  private final Categories category;
  private final Colours colour;
  private final Types type;
  private final Statuses status;
  private final int year;
  private final String name;
  private final String engine;
  private final int cylinders;
  private final int price;
  private final int age;

  public Vehicle(int year, String name, Colours colour, String engine, int cylinders, Categories category, int price, Types type, Statuses status, int age){
    
    this.year = year;
    this.name = name;
    this.colour = colour;
    this.engine = engine;
    this.cylinders = cylinders;
    this.category = category;
    this. price = price;
    this.type = type;
    this.status = status;
    this.age = age;

  }
  
  public void buy(){
    
  }

  public void makeList(){

  }

 public static String[][] read(){
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

    return array;
    
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
      default: System.out.println("Invalid"); color = Colours.PINK;
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

      default: System.out.println("Invalid"); cat = Categories.TRUCK;
    }

    int price = Integer.valueOf(array[index][6]);
    int age =  Integer.valueOf(array[index][9]);

    Types type;

    switch(array[index][7]){
      case "New": type = Types.NEW; break;
      case "Used": type = Types.USED; break;
      default: System.out.println("Invalid"); type = Types.USED;
    }

    Statuses stat;

    switch(array[index][8]){
      case "Demo": stat = Statuses.DEMO; break;
      case "Stock": stat = Statuses.STOCK; break;

      default: System.out.println("Invalid"); stat = Statuses.STOCK;
    }

    return new Vehicle(year, name, color, engineName, cylindersnum, cat, price, type, stat, age);

  }
}
