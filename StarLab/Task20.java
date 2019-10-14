import java.util.Scanner;
public class Task20{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int row = sc.nextInt();
    for(int rowC=1;rowC<=row;rowC++){
      for(int space = 1; space<=row-rowC;space++)
        System.out.print(" ");
      for(int c=1;c<=rowC*2-1;c++)
        System.out.print("*");
      System.out.println();
    }
    for(int rowC=row-1;rowC>=1;rowC--){
      for(int space = row; space>rowC;space--)
        System.out.print(" ");
      for(int c=1;c<=rowC*2-1;c++)
        System.out.print("*");
      System.out.println();
    }
  }
}