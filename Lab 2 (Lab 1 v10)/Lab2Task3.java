import java.util.Scanner;
public class Lab2Task3{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int []a=new int [10];
    a[0]=sc.nextInt();
    for(int i=1;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<=a.length-1;i++)
      for(int j=i+1;j<a.length;j++){
      if(a[i]<a[j]){
        a[i]=a[i]+a[j];
        a[j]=a[i]-a[j];
        a[i]=a[i]-a[j];       
      } 
    }
    for(int i=0;i<a.length;i++)
      if(i==a.length-1)
      System.out.print(a[i]);
      else
      System.out.print(a[i]+", ");
  }
}