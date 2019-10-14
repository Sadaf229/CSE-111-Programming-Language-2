import java.util.Scanner;
public class Task6{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int row = sc.nextInt();
    for(int rowCount=1;rowCount<=row;rowCount++){
      for(int space = 1; space<=row-rowCount;space++)
        System.out.print(" ");
      for(int c=1;c<=rowCount*2-1;c++)
        System.out.print(c);
      System.out.println();
    }
  }
}