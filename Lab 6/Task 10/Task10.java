import java.util.Scanner;
public class Task10{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int n=sc.nextInt();
    for(int c=1;c<=n;c++){
      for(int i=1;i<=c;i++)
      System.out.print(c);
      System.out.println();
    }
  }
}