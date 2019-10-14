import java.util.Scanner;
public class Lab2Task5{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int []a=new int [10];
    for(int i=0;i<a.length;i++){
      int c=sc.nextInt();
      a[i]=c;
    }
    boolean con=false;
    int c=sc.nextInt();
    for(int i=0;i<a.length;i++){
      if(a[i]==c){
        System.out.println("Yes");
        con=true;
        break;
      }
    }
    if(con==false)
      System.out.println("No");
  }
}