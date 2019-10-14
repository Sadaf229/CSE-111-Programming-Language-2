import java.util.Scanner ;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius of Circle: ");
    double r = sc.nextDouble();
    circle C = new circle(r);
    C.space();
    System.out.print("Enter radius of Sphere: ");
    double rS=sc.nextDouble();
    sphere s = new sphere(rS);
    s.space();
  }
}