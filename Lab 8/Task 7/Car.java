public class Car{
  static int count =0;
  int Year;
  Car(int year){
    Year = year;
    count++;
  }
  public static int getObjectCount(){
    return count;
  }
  
  public int getYear(){
    return Year;
  }
}