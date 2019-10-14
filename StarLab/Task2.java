import java.util.Scanner;
public class Task2{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Row Number");
    int row = sc.nextInt();
    System.out.println("Enter Column Number");
    int column = sc.nextInt();
    for(int rowC=1;rowC<=row;rowC+=1){
      for(int columnC=1;columnC<=column;columnC+=1){
        System.out.print(columnC);
      }
      System.out.println();
    }
  }
}