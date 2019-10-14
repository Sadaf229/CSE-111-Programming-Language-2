import java.util.Scanner;
public class Task1{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int row = sc.nextInt();
    for(int rowC=1;rowC<=row;rowC+=1){
        System.out.print(rowC);
    }
  }
}