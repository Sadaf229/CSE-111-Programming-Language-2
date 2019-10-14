public class Teacher{
  String name , dpt, cor="";
  public Teacher(String n, String d){
    name = n;
    dpt = d;
  }
  public void addCourse(Course c){
    cor += "\n"+ c.courseName;
  }
  public void printDetail(){
    System.out.println("========================\nName: "+name+" \nDepartment: "+dpt+" \nList of courses \n======================== "+cor+" \n========================");
  }
}