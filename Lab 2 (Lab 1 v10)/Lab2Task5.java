import java.util.Scanner;
public class Lab2Task5{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter value of voltage");
    double E=sc.nextDouble();
    System.out.println("Please enter value of resistance");
    double R=sc.nextDouble();
    System.out.println("Please enter value of inductance");
    double L=sc.nextDouble();
    System.out.println("Please enter value of capacitance");
    double C=sc.nextDouble();
    System.out.println("Please enter value of frequency");
    double f=sc.nextDouble();
    double I=(E/Math.sqrt(Math.pow(R,2)+Math.pow((2*Math.PI*f*L-(1/(2*Math.PI*f*C))),2)));
    System.out.print("The current is "+I+" amperes");
  }
}