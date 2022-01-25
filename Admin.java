public class Admin extends Person {
  
  public Admin(){

  }

  public void Buy(int balance, int price, Vehicle.Statuses stat){
    if (price > balance){
      System.out.println("This car cannot be bought");
    }
    else {
      System.out.println("E");
    }
  }

}