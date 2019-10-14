import java.util.Scanner;
public class Task17{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int row = sc.nextInt();
    for(int rowCount=1;rowCount<=row;rowCount+=1){
      for(int column=1;column<=rowCount;column+=1){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}