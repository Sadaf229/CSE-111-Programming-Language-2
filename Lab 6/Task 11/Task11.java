public class Task11{
  public static void main(String[]args){
    System.out.print("0");
    System.out.println();
    for(int col=1;col<=9;col++){
      for(int row=0; row<=col*col;row=row+col){
        System.out.print(row+" ");
      }
      System.out.println();
    }
  }
}