public class Student{
  String name = "default name";
  static int numberOfStudents=0;
  public Student(){
    numberOfStudents++;
  }
  public Student(String n){
    name = n;
    numberOfStudents++;
  }
  public String getName(){
    return name;
  }
}