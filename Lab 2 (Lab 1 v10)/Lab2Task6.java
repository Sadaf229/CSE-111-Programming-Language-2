import java.util.Scanner;
public class Lab2Task6{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter a Number");
    int n=sc.nextInt();
    int y=0;
    for(int k=1;k<=n;k++){
      if(k%2==1)
        y+=(k*k);
      else
        y-=(k*k);
    }
    System.out.print(y);
  }
}  