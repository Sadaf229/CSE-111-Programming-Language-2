public class sphere extends Point{
  public sphere(double r){
    super(r);
    System.out.println("Creating a Sphere … done!");
  }
  double space(){
    System.out.println("The volume of the Sphere is "+(4/3.0*Math.PI*Math.pow(getRadius(),3)));
    return 0;
  }
}