import java.util.Scanner;
public class testStudentInterface{
  public static void main(String[]args){
    Student array[];
    Scanner sc = new Scanner(System.in);
    array = new Student[sc.nextInt()];
    for(int i =0; i<array.length;i++){
      array[i]=new Student();
    }
    for(int i =0; i<array.length;i++){
      sc.nextLine();
      System.out.println("Please enter name of the student");
      array[i].setName(sc.nextLine());
      System.out.println("Please enter ID of the student");
      array[i].setID(sc.nextInt());     
    }
    
    for(int i=0;i<array.length;i++){
      char main[]=array[i].name.toCharArray();;
      for(int j=i+1;j<array.length;j++){
        char comparing [] =array[j].name.toCharArray();
        int value;
        if(main.length<comparing.length){
          value = main.length;
        }
        else{
          value= comparing.length;
        }
        for(int k=0;k<value;k++){
          if((main[k]+"").compareToIgnoreCase((comparing[k]+""))==0)
            continue;
          else if((main[k]+"").compareToIgnoreCase((comparing[k]+""))<0)
            break;
          else{
            String name = array[i].getName();
            array[i].setName(array[j].name);
            array[j].setName(name);
            int z = array[i].ID;
            array[i].setID(array[j].getID());
            array[j].setID(z);
            break;
          }
        }
      }
    }
    for(int x=0;x<array.length;x++){
    System.out.println(array[x].getName()+" "+array[x].getID());
    }
  }
}