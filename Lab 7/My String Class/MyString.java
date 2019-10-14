public class MyString{
  char array[];
  MyString(){
  }
  public MyString(char[]charSeq){
    array = charSeq;
  }
  public MyString (String str){
    array = str.toCharArray();
  }
  public int length (){
    return array.length;
  }
  public char charAt( int n ){
    if(n<0 || n>array.length-1){
      return 0;
    }
    else
      return array[n];
  }
  public boolean startsWith (MyString prefix){
    boolean a = false;
    if(prefix.array.length<this.array.length){
      for(int i=0;i<prefix.array.length;i++){
        if(prefix.array[i]==array[i])
          a=true;
        else{
          a=false;
          break;
        }
      }
    }
    return a;
  }
  public boolean startsWith (String prefix){
    boolean a = false;
    if(prefix.length()>=this.array.length){
    }
    else{
      for(int i=0;i<prefix.length();i++){
        if(prefix.charAt(i)==array[i])
          a=true;
        else
          a=false;
      }
    }
    return a;
  }
  public boolean endsWith(MyString suffix){
    boolean a=false;
    int k=0;
    if(suffix.array.length<this.array.length){
      for(int j=suffix.array.length-1;j>=0;j--){
        k++;
        for(int i=this.array.length-k; i==this.array.length-k;i--){
          if(suffix.array[j]==this.array[i])
            a=true;
          else{
            a=false;
            break;
          }
        }
      }
    }
    return a;
  }
  
  public boolean endsWith(String suffix){
    boolean a=false;
    int k=0;
    char [] b = suffix.toCharArray();
    if(b.length<this.array.length){
      for(int j = b.length-1;j>=0;j--){
        k++;
        for(int i=this.array.length-k; i==this.array.length-k;i--){
          if(b[j]==this.array[i])
            a=true;
          else{
            a=false;
            break;
          }
        }
      }
    }
    return a;
  }
  
  public MyString replaceFirst(char oldChar, char newChar){
    boolean condition = false;
    for(int i=0; i<array.length;i++){
      if(array[i]==oldChar){
        condition = true;
        break;
      }
    }
    if(condition==true){
      MyString abc = new MyString();
      array = new char [this.array.length];
      for(int i=0; i<array.length;i++){
        array[i]=this.array[i];  
      }
      for(int i=0; i<array.length;i++){
        if(this.array[i]==oldChar){
          abc.array[i]=newChar;
          break;
        }
      }
      return abc;
    }
    return this;
  }
  
  public MyString replaceAll(char oldChar, char newChar){
    boolean condition = false;
    for(int i=0; i<array.length;i++){
      if(array[i]==oldChar){
        condition = true;
        break;
      }
    }
    if(condition==true){
      MyString abc = new MyString();
      array = new char [this.array.length];
      for(int i=0; i<array.length;i++){
        array[i]=this.array[i];  
      }
      for(int i=0; i<array.length;i++){
        if(this.array[i]==oldChar){
          abc.array[i]=newChar;
        }
      }
      return abc;
    }
    return this;
  }
  
  public MyString replaceLast(char oldChar, char newChar){
    boolean condition = false;
    for(int i=0; i<array.length;i++){
      if(array[i]==oldChar){
        condition = true;
        break;
      }
    }
    if(condition==true){
      MyString abc = new MyString();
      array = new char [this.array.length];
      for(int i=0; i<array.length;i++){
        array[i]=this.array[i];  
      }
      for(int i=array.length-1; i>=0;i--){
        if(this.array[i]==oldChar){
          abc.array[i]=newChar;
        }
      }
      return abc;
    }
    return this;
  }
  
  public MyString toLowerCase (){
    boolean condition = false;
    for(int i=0; i<array.length;i++){
      if(array[i]>=65 && array[i]<=90){
        condition = true;
        break;
      }
    }
    if(condition==true){
      MyString abc = new MyString();
      array = new char [this.array.length];
      for(int i=0; i<array.length;i++){
        array[i]=this.array[i];  
      }
      for(int i=array.length-1; i>=0;i--){
        if(array[i]>=65 && array[i]<=90){
          array[i]+=32;
        }
      }
      return abc;
    }
    return this;
  }
  
  public MyString toUpperCase (){
    boolean condition = false;
    for(int i=0; i<array.length;i++){
      if(array[i]>=65 && array[i]<=90){
        condition = true;
        break;
      }
    }
    if(condition==true){
      MyString abc = new MyString();
      array = new char [this.array.length];
      for(int i=0; i<array.length;i++){
        array[i]=this.array[i];  
      }
      for(int i=array.length-1; i>=0;i--){
        if(array[i]>=65 && array[i]<=90){
          array[i]-=32;
        }
      }
      return abc;
    }
    return this;
  }
  
  public boolean equals (MyString rightStr){
    boolean condition = false;
    if(array.length==this.array.length){
      for(int i=0; i<array.length;i++){
        if(array[i]==this.array[i])
          condition=true;
        else
          condition=false;
      }
    }
    return condition;
  }
  
  public boolean equalsIgnoreCase(MyString rightString){
    boolean condition1 = false;
    for(int i=0; i<array.length;i++){
      if(array[i]>=65 && array[i]<=90){
        condition1 = true;
        break;
      }
    }
    if(condition1 ==true){
      MyString abc = new MyString();
      array = new char [this.array.length];
      for(int i=0; i<array.length;i++){
        array[i]=this.array[i];  
      }
      for(int i=array.length-1; i>=0;i--){
        if(array[i]>=65 && array[i]<=90){
          array[i]-=32;
        }
      }
    }
    boolean condition = false;
    if(array.length==this.array.length){
      for(int i=0; i<array.length;i++){
        if(array[i]==this.array[i])
          condition=true;
        else
          condition=false;
      }
    }
    return condition;
  }
  
  
  
}