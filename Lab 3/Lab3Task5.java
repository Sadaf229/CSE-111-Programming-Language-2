import java.util.Scanner;
public class Lab3Task5{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String sample=sc.next();
    for(int i=0;i<=2;i++){
      if(i==1)
        System.out.println(sample+"==THE END==");
      else 
        System.out.println(sample);
    }
  }
}
