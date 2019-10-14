public class AccountTester{
  public static void main(String[] args){
    BankAccount acc1 = new BankAccount("John","Dhaka","13AC4T",10000);
    BankAccount acc2 = new BankAccount("Koln","Barishal","15IC4T",20000);
    BankAccount acc3 = new BankAccount("Michal","Chittagong","134Y4T",30000);
    acc1.setName("Bang");
    acc2.setName("Chang");
    acc3.setName("Sheng");
    acc1.setAddress("Washington");
    acc2.setAddress("Tokyo");
    acc3.setAddress("Dubai");
    acc1.setAccountID("Jukar");
    acc2.setAccountID("Bill");
    acc3.setAccountID("Steve");
    acc1.setBalance(30000.06);
    acc2.setBalance(15624.08);
    acc3.setBalance(36870.46);
    acc1.addInterest();
    acc3.addInterest();
    System.out.println("First account holder is "+acc1.getName());
    System.out.println("Lives in "+acc1.getAddress());
    System.out.println("Account Number "+acc1.getAccountID());
    System.out.println("Account Balance "+acc1.getBalance());
    System.out.println();
    System.out.println("First account holder is "+acc2.getName());
    System.out.println("Lives in "+acc2.getAddress());
    System.out.println("Account Number "+acc2.getAccountID());
    System.out.println("Account Balance "+acc2.getBalance());
     System.out.println();
    System.out.println("First account holder is "+acc3.getName());
    System.out.println("Lives in "+acc3.getAddress());
    System.out.println("Account Number "+acc3.getAccountID());
    System.out.println("Account Balance "+acc3.getBalance());
  }
}