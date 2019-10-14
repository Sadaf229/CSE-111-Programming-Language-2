public class Testing_Instrument{
  public static void main(String[]args){
    Guitar g = new Guitar();
    Keyboard k = new Keyboard();
    Violin v = new Violin();
    g.play();
    g.adjust();
    g.compose();
    k.play();
    k.adjust();
    k.compose();
    v.play();
    v.adjust();
    v.compose();
  }
}