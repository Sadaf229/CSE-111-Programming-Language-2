import java.util.Scanner;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int Counter = 1;
    while(i>0){
      int test;
      do{test = sc.nextInt();
      }while(test>=1000000000);
      int print=test;
      if(test/10==0){
        test*=test;
      }
      if(test/10==0){
        test*=test;
      }
      int hisab =0;
      while(test>9
           ){
        if(test ==4 ||test == 16 ||test == 37 ||test ==  58 ||test ==  89 ||test ==  145 ||test ==  42 ||test ==  20)
          break;
        while(test>0){
          while(test>0){
            int rakhlam=0;
            int temp = test%10;
            rakhlam=rakhlam+(temp*temp);
            test/=10;
            hisab=rakhlam;
          }
          if(hisab/10!=0){
            test=hisab;
          }
        }
      }
      test = hisab;
      if(test==1)
        System.out.println("Case #"+Counter+": "+print+" is a Happy number.");
      else
        System.out.println("Case #"+Counter+": "+print+" is an Unhappy number.");
      i--;
      Counter++;
    }
  }
}