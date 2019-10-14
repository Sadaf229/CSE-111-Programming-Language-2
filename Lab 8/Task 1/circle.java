class circle extends Point{
  circle(double r){
    super(r);
    System.out.println("Creating a Circle .. done!");
  }  
  public double space(){
    System.out.println("The area of the circle is "+Math.PI*Math.pow(getRadius(),2));
    return 0;
  }
}