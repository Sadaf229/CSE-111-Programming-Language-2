import java.util.Scanner;
public class Task8{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Length Number");
    int length = sc.nextInt();
    System.out.println("Enter Width Number");
    int width = sc.nextInt();
    for(int lengthC=1;lengthC<=length;lengthC++){
      if(lengthC==1 || lengthC==length)
        for(int c=1;c<=width;c++){
        System.out.print(c);
      }
      else{
        System.out.print("1");
        for(int space = width-2;space>=1;space--)
          System.out.print(" ");
        System.out.print(width);
      }
      System.out.println();
    }
  }
}