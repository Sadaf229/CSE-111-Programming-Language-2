public class SavingsAccount{
  static double annualInterestRate = 7;
  private double savingsBalance;
  public SavingsAccount(double ammount){
    savingsBalance=ammount;
  }
  static void modifyInterestRate(double i){
    annualInterestRate = i;
  }
  public void calculateMonthlyInterest(){
    double a= (savingsBalance*((annualInterestRate/12)/100));
    savingsBalance+=a;
  }
  public void printSavingsBalance(){
    System.out.println(savingsBalance);
  }
}