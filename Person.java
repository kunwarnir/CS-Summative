// admins stats (money, etc)
abstract class Person{
  
  public String username; // admin enters username


  public String getUsername(){ 
    return username; // program returns admins username
  }

  public void setUsername(String user){ 
    this.username = user;
  }
}