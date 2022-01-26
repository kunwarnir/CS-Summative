
public class Admin extends Person {

  private static final Admin INSTANCE = new Admin();
  
  private Admin(){

  }

  private Admin(String user){ 
    this.username = user;
  }

  public void Buy(int balance, int price,
   Vehicle.Statuses stat){
    if (price > balance){
      System.out.println("This car cannot be bought");
    }
    else {
      System.out.println("E");
    }
  }

  public static Admin getInstance(){
    return INSTANCE;
  }

}