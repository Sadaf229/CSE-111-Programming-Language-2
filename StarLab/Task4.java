import java.util.Scanner;
public class Task4{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int row = sc.nextInt();
    for(int rowC=row;rowC>=1;rowC--){
      for(int space=1;space<rowC;space++)
        System.out.print(" ");
      for(int column=row;column>=rowC;column-=1){
        System.out.print(column);
      }
      System.out.println();
    }
  }
}