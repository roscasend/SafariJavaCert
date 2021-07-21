package inners;

public class Ex1 {
  private static String x = "Ex1.x";

  // A class inside another class
  // can be private/protected/default/public
  // static or instance
  // if it's static, the "proper" name is "nested"
  public /*static*/ class Inner {
    private static String x = "Inner.x";
    private static void showXes() {
      System.out.println("x is " + x);
      System.out.println("x is " + Ex1.x);
    }
  }

  public static void main(String[] args) {
//    var obj = new Ex1.Inner();
    var obj = new Ex1.Inner();
    System.out.println("type is " + obj.getClass());
    System.out.println(Inner.x);
    Inner.showXes();
  }
}
