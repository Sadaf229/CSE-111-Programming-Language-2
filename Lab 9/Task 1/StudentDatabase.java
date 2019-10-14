/**
 * 
 * 
 * Ei class ta database manage kore
 * 
 */

public class StudentDatabase{
  
  Student [] records;
  
  /**
   * Eita diye info print kora jay
   */
  void printDatabase(){
    int c=0; /* jj*/
    while(c<records.length){ //5
      System.out.println(records[c].toString());
      ++c;
    }
  }
  /**
   * Eita name diye sort kore dey
   * This takes no parameter
   */
  void sortByName(){
    for(int k=0;k<records.length;k++){
      for(int j=0;j<records.length;j++){
        if((records[k].name).compareToIgnoreCase(records[j].name)>0)
          continue;
        else if((records[k].name).compareToIgnoreCase(records[j].name)==0)
          continue;
        else{
          Student temp = records[k];
          records[k] = records [j];
          records[j] = temp ;
        }
      }
    }
  }
  
  /**
   * Eita ID diye sort kore dey
   * This takes no parameter
   */
  void sortByID(){
    int i,j;
    Student tmp;
    i=0;
    while(i<records.length){
      j=1;
      while(j<records.length){// "batman".compareTo("badman")  
        if(records[j-1].id.compareTo(records[j].id)>0){
          tmp=records[j-1];
          records[j-1]=records[j];
          records[j]=tmp;
        }
        ++j;
      }
      ++i;
    }
  }
  /**
   * Eita Section diye sort kore dey
   * This takes no parameter
   */
  void sortBySection(){
    for(int i =0; i<records.length;i++){
      for(int j=0; j<records.length;j++){
        if((records[i].section)<(records[j].section)){
          Student temp = records[i];
          records[i] = records [j];
          records[j] = temp ;
        }
      }
    }
  }
  
  /**
   * Eita Marks diye sort kore dey
   * This takes no parameter
   */
  void sortByMark(){
    int i,j;
    Student tmp;
    i=0;
    while(i<records.length){
      j=1;
      while(j<records.length){
        if(records[j-1].mark > records[j].mark){
          tmp=records[j-1];
          records[j-1]=records[j];
          records[j]=tmp;
        }
        ++j;
      }
      ++i;
    }
  }
}