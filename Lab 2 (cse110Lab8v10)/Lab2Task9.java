import java.util.Scanner;
public class Lab2Task9{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int []a=new int [10];
    a[0]=sc.nextInt();
    for(int i=1;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<=1;i++)
      for(int j=i;j<=a.length-1;j+=2){
      if(j==a.length-1)
        System.out.print(a[j]);
      else
        System.out.print(a[j]+", "); 
    }
  }
}