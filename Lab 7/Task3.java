import java.util.Scanner;
public class Task3{
  public static void main(String[]args){  
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter A String");
    String input1=sc.nextLine();
    char [] array1 = input1.toCharArray();
    System.out.println("Enter Another String");
    String input2=sc.nextLine();
    char [] array2 = input2.toCharArray();
    if(array2.length>=array1.length)
      System.out.println("false");
    else{
      boolean a = true;
      for(int i=0;i<array2.length;i++){
        if(array1[i]==array2[i]){}        
        else{
          a = false;
          break;
        }
      }
      System.out.println(a);
    }
  }
}