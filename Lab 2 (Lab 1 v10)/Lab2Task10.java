import java.util.Scanner;
public class Lab2Task10{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please specify how many number you want to inout");
    int l = sc.nextInt();
    int a[]=new int[l];
    int breaker=0;
    for(int i=0;i<a.length;i++){
      int c=sc.nextInt();
      if(c>9||c<0){
        i--;
      }
      else{
        a[c]++; 
      }
    }
    for(int i=0;i<a.length;i++){
      if(a[i]>=2 && a[i]<5){
        breaker=i;
      }
    }
    for(int i=0;i<a.length;i++){
      if(a[i]>=2 && a[i]<5){
        if(breaker==i){
        System.out.print(i);
        break;
        }
        System.out.print(i+",");
      }
    }
  }
}