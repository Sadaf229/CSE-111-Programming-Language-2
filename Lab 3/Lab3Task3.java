import java.util.Scanner;
public class Lab3Task3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String S=sc.nextLine();
    for(int i=0;i<S.length();i++){
      System.out.print(S.charAt(i)+" : ");
      System.out.println((int)S.charAt(i)); 
    }
  }
}