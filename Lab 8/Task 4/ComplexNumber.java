public class ComplexNumber extends RealNumber{
  private double imaginaryPart=1.0;
  public void setImaginaryPart(double n){
    imaginaryPart=n;
  }
  public double getImaginaryPart(){
    return imaginaryPart;
  }
  public ComplexNumber(double n, double m){
    setRealValue(n);
    setImaginaryPart(m);
  }
  public ComplexNumber(){
    setRealValue(1.0);
  }
  public String toString(){
    return super.toString()+"\nImaginaryPart: "+getImaginaryPart();
  }
  public void check(){
    System.out.println("I'm in ComplexNumber class");
    super.ping();
    System.out.println("Checking ended.");
  }
}