import java.util.Scanner;
public class Task13{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int num=sc.nextInt();
    for(int c=1;c<=num;c++)
      System.out.print(c);
    for(int c=num-1;c>0;c--)
      System.out.print(c);
  }
}