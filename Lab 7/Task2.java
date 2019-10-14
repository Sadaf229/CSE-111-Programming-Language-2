import java.util.Scanner;
public class Task2{
  public static void main(String[]args){  
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter A String");
    String input=sc.nextLine();
    char [] array = input.toCharArray();
    System.out.println("Enter A position number");
    int n=sc.nextInt();
    if(n<0 || n>array.length)
      System.out.println("Invalid index");
    else
      System.out.println(array[n]);
  }
}