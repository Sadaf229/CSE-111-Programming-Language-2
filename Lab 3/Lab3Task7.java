public class Lab3Task7{
  public static void main(String[]args){
    String one = "H1bE31 Ag3Ty ";
    String two = " h1Be31 aG3tY";
    double c=21356.6435234;
    System.out.println(two.compareTo(one));
    System.out.println(one.compareTo(two));
    System.out.println(two.compareToIgnoreCase(one));
    System.out.println(two.compareToIgnoreCase(one));
    System.out.println(two.startsWith("h"));
    System.out.println(one.startsWith("h"));
    System.out.println(two.endsWith("3"));
    System.out.println(one.endsWith("H13"));
    System.out.println(one.equals(two));
    System.out.println(one.equalsIgnoreCase(two));
    System.out.println(one.indexOf("1"));
    System.out.println(two.indexOf("3"));
    System.out.println(one.indexOf("7"));
    System.out.println(one.lastIndexOf("1"));
    System.out.println(one.length());
    System.out.println(one.replace('1','4'));
    System.out.println(two.replace('h','2'));
    System.out.println(one.substring(1,2));
    System.out.println(one.toLowerCase());
    System.out.println(two.toUpperCase());
    System.out.println(two.trim());
    System.out.println(String.valueOf(two));
    System.out.println(String.valueOf(one));
    System.out.println(two.toCharArray());
    System.out.println(one.toCharArray());
  }
}