import java.util.Scanner;
public class Task5{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int row = sc.nextInt();
    for(int rowCount=1;rowCount<=row;rowCount++){
      for(int space=row;space>rowCount;space--)
        System.out.print(" ");
      for(int column=1;column<=rowCount;column+=1){
        System.out.print(column);
      }
      System.out.println();
    }
  }
}