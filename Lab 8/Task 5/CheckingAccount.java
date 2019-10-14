public class CheckingAccount extends Account{
  static int  numberOfAccount = 0;
  CheckingAccount(double n){
    super(n);
    numberOfAccount++;
  }
  CheckingAccount(){
    super(0);
    numberOfAccount++;
  }
}