import java.util.Scanner;
public class Lab2Task9{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int []a=new int [10];
    a[0]=sc.nextInt();
    for(int i=1;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    sc.nextLine();
    System.out.println("What kind of sorting do you want?");
    System.out.println("a) only numbers at odd positions \nb) only numbers at even positions\nc) all numbers (means numbers at all positions)");
    String K=sc.nextLine();
    if(K.equals("A")||K.equals("a")){
      for(int i=1;i<=a.length-1;i+=2)
        for(int j=i+2;j<a.length;j+=2){
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
    else if(K.equals("b")||K.equals("B")){
      for(int i=0;i<=a.length-1;i+=2)
        for(int j=i+2;j<a.length;j+=2){
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
    else if(K.equals("c") || K.equals("C")){
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
}