import java.util.Scanner;
public class Lab2Task8{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int []a=new int [10];
    a[0]=sc.nextInt();
    for(int i=1;i<a.length;i++){
      a[i]=sc.nextInt();
      for(int j=0;j<i;j++)
        if(a[j]==a[i]){
        i--;
        System.out.println("Duplicate Detected input again");
      }
    }
  }
}
