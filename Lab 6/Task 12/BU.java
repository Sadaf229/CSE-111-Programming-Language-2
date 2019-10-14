import java.util.Scanner;
public class BU{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Input Your Full Name");
    String name = sc.nextLine();
    System.out.println("Please Input Your ID");
    int id= sc.nextInt();
    for(int c=0;c<name.length();c++){
      if(name.charAt(c)==' ')
        break;
      System.out.print(name.charAt(c)); 
    }
    System.out.println();
    
    int count = 0;
    for(int c=0;c<name.length();c++){
      if(name.charAt(c)==' ')
        count++;
    }
    int space = 0;
    for(int c=0;c<name.length();c++){
      if(space==count){
        for(int i=c;i<name.length();i++){
          System.out.print(name.charAt(i));
        }
        break;
      }
      else{
        if(name.charAt(c)==' ')
          space++;
      }
    }
    System.out.println();
    
    int counter=0;
    for(int c=0;c<name.length();c++){
      if(name.charAt(c)==' '){
        counter++;
        if(counter!=count)
          System.out.print(name.charAt(c+1)+". ");
      }
    }
    System.out.println();
    
    
  }
}
