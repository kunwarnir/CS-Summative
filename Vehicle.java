import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  

public class Vehicle{
  
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
    
  }

  // public  void read()
  // {
  //   String path = "CarData.csv";
  //   String line = "";

  //   try
  //   {
  //     BufferedReader br = new BufferedReader(new FileReader(path));

  //     while((line = br.readLine()) != null) {
  //       String[] values = line.split(","); //ARRAY IS HERE
  //       System.out.println(values[0]);
  //     }

  //   } catch (FileNotFoundException e) {
  //     e.printStackTrace();
  //   } catch (IOException e) {
  //     e.printStackTrace();
  //   }
    
  // }
}