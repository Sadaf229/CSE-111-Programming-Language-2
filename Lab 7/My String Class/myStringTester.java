import java.util.Scanner;
public class myStringTester{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    char [] a = {'g','o','o','g','l','e'};
    MyString strchr = new MyString(a);
    char [] b = {'M','a','s','s','i','v','e'};
    MyString strchar = new MyString(b);
    MyString str = new MyString("Google Is Massive");
    System.out.println(str.length());
    System.out.println(str.charAt(60));
    System.out.println(str.startsWith(strchr));
    System.out.println(str.startsWith("G"));
    System.out.println(str.endsWith(strchar));
    
  }
}