import java.util.Scanner;
public class Task25{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int row = sc.nextInt();
    for(int rowC=1;rowC<row;rowC++){
      for(int space= row-rowC;space>0;space--)
        System.out.print(" ");
      if(rowC==1)
        System.out.print("*");
      else if(rowC<row){
        System.out.print("*");
        for(int space=1;space<=2*rowC-3;space++)
          System.out.print(" ");
        System.out.print("*");
      }
      System.out.println();
    }
    for(int rowC=row;rowC>=1;rowC--){
      for(int space= row-rowC;space>0;space--)
        System.out.print(" ");
      System.out.print("*");
      for(int space=1;space<=2*rowC-3;space++)
        System.out.print(" ");
      if(rowC!=1)
        System.out.print("*");
      System.out.println();
    }
  }
}