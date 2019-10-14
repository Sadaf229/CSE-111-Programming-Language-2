import java.util.Scanner;
public class Lab4Task3{
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of the array");
    int siz=sc.nextInt();
    int [] array = new int[siz];
    for(int i=0;i<array.length;i++){
      System.out.println("Enter a value");
      array[i]=sc.nextInt();
    }
    arraySize(array , array.length);
  }
  public static void arraySize(int []a , int size){
    int count = 0;
    for(int i=0;i<a.length;i++){
      if(a[i]>=0)
        count++;
    }
    int []ar = new int[count];
    int j=0;
    for(int i=0;i<a.length;i++){
      if(a[i]>=0){
        ar[j]=a[i];
        j++;
      }
      
    }
    System.out.println(ar.length);
  }
}