import java.util.Scanner;
public class Task10{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int row = sc.nextInt();
    for(int rowC=1;rowC<=row;rowC++){
      if(rowC!=row){
        for(int space=1;space<=row-rowC;space++)
        System.out.print(" ");
      if(rowC==1)
        System.out.print(row);
      else if(rowC==2)
        for(int c=row-1;c<=row;c++)
        System.out.print(c);
      else{
        System.out.print(rowC);
        for(int space=1;space<rowC-1;space++)
          System.out.print(" ");
        System.out.print(row);
      }
      }
      else
        for(int c=1;c<=row;c++)
        System.out.print(c);
      
      System.out.println();
    }
  }
}