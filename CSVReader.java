import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class CSVReader 
{
  public static void main(String[] args)
  {
    String path = "CarData.csv";
    String line = "";

    try
    {
      BufferedReader br = new BufferedReader(new FileReader(path));

      while((line = br.readLine()) != null) {
        String[] values = line.split(","); //ARRAY IS HERE
        System.out.println(values[0]);
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }

}