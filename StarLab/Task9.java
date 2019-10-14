import java.util.Scanner;
public class Task9{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Row Number");
    int row = sc.nextInt();
    for(int rowCount=1;rowCount<=row;rowCount++){
      if(rowCount==1)
        System.out.print("1");
      else if(rowCount==2)
        System.out.print("12");
      else if(rowCount==row)
        for(int c=1;c<=row;c++)
        System.out.print(c);
      else{
        System.out.print("1");
        for(int space=1;space<=rowCount-2;space++){
          System.out.print(" ");
        }
        System.out.print(rowCount);
      }
      System.out.println();
    }
  }
}