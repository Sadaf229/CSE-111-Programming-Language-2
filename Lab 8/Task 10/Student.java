class Student implements StInterface{
  public String name;
  public int ID;
  public void setName(String M){
    name = M;
  }
  public void setID(int D){
    ID = D;
  }
  public String getName(){
    return name;
  }
  public int getID(){
    return ID;
  }
}