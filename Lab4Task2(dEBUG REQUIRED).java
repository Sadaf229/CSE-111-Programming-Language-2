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
    int second=Letters[0];
    for(int i=0;i<Letters.length;i++)
      if(Letters[i]!=max){
      if(second<Letters[i])
        second = Letters[i];
    }
    if(max!=1){
      for(int i=0;i<Letters.length;i++)
        if(Letters[i]==second){
        System.out.println((char)(i+65));
      }
    }
  }
}