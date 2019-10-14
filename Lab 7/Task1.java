import java.util.Scanner;
public class Task1{
  public static void main(String[]args){  
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter A String");
    String input=sc.nextLine();
    char [] array = input.toCharArray();
    System.out.println(array.length);
  }
}