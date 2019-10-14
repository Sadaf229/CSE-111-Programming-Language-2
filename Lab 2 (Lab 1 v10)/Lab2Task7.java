import java.util.Scanner;
public class Lab2Task7{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int []a=new int [11];
    for(int i=0;i<4;i++){
      System.out.println("Please Enter a Number");
      a[i]=sc.nextInt();
    }
    for(int i=4;i<a.length;i++){
      System.out.println("Please Enter a Number");
      a[i]=sc.nextInt();
      int c=0;
      for(int j=0;j<=i;j++){
        if(a[j]==a[i])
          c++;
        if(c>4){
          System.out.println("The number is rejected as it has been entered 4 times");
          i--;
        }
      }
    }
  }
}