public class BankAccount{
  String name, address, accountID;
  double balance;
  public BankAccount(String n, String a, String i, double balance){
    setName(n);
    setAccountID(i);
    setAddress(a);
    setBalance(balance);
  }
  public String getName(){
    return name;   
  }
  public void setName(String n){
    name = n;
  }
  public String getAccountID(){
    return accountID;
  }
  public void setAccountID(String i){
    accountID=i;
  }
  public String getAddress(){
    return address;
  }
  public void setAddress(String a){
    address=a;
  }
  public double getBalance(){
    return balance;
  }
  public void setBalance(double c){
    balance = c;
  }
  public void addInterest(){ //adds 7% of the balance
    balance +=(balance*7/100);
  }
}