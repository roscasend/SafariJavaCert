package equality;
class X {
  static String h = "Hello";
}

public class TryTwo  {
  //Which are true?
  String s1 = "Hello";
  String s2 = new StringBuilder("Hello").toString();
  String s3 = s2.intern();
//  A) s1 == s2
//  B) s2 == s3
//  C) s1 == s3
//  D) X.h == s1

  public void go() {
    System.out.println(s1 == s2);
    System.out.println(s2 == s3);
    System.out.println(s1 == s3);
    System.out.println(X.h == s1);
  }
  public static void main(String[] args) {
    new TryTwo().go();

  }
}

