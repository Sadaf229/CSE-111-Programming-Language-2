import java.util.Scanner;
public class Lab4Task2{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    String a= sc.nextLine();
    int Letters[]=new int[26];
    for(int i=0;i<a.length();i++){
      Letters[(int)a.charAt(i)-65]++;
    }
    int max=Letters[0];
    for(int i=0;i<Letters.length;i++)
      if(Letters[i]>max){
      max=Letters[i];
    }
    for(int i=0;i<Letters.length;i++)
      if(Letters[i]==max){
      Letters[i] = -1;
    }
    int max2=Letters[0];
    for(int i=0;i<Letters.length;i++)
      if(Letters[i]>max2){
      max2=Letters[i];
    }
    for(int i= 0;i<Letters.length;i++)
      if(Letters[i]==max2){
      System.out.println((char)(i+65));
      break;
    }
  }
}