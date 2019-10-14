public class Trim{
  public static char [] trim(char [] input){
    int space = 0;int spaces=0;
    for(int i=0;i<input.length;i++){
      if(input[i]==' '){
        space++;
        if(space>1){
          input[i]='#';
          spaces++;
        }
      }
      else
        space=0;
    }
    int k=0;
    char [] array=new char[input.length-spaces];
    for(int j=0;j<input.length;j++){
      if(input[j]!='#'){
        array[k]=input[j];
        k++;
      }
    }
    
  return  array;
  }
public static void main(String [] args){
  char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
  for (int i = 0; i< input.length; i++){
    System.out.print(input[i]);
  }
  System.out.println("");
  char []  output = trim(input);
  for (int i = 0; i< output.length; i++){
    System.out.print(output[i]);
  }
  System.out.println("");    
}
}
