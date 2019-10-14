import java.util.Scanner;
public class Task14{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int row = sc.nextInt();
    for(int rowC=1;rowC<=row;rowC++){
      for(int space=1;space<=row-rowC;space++)
        System.out.print(" ");
      for(int column=1;column<=rowC;column++)
        System.out.print(column);
      for(int column=rowC-1;column>0;column--)
        System.out.print(column);
    System.out.println();
    }
  }
}