package qualified;

class Grandparent {
  int x = 100;

}
class Parent extends Grandparent {
  int x = 200;
}

public class Sub extends Parent {
  int x = 101;
  void doStuff() {
//    int x = 99;
    System.out.println("x is " + x);
    System.out.println("x is " + this.x);
    System.out.println("x is " + super.x);
  }

  public static void main(String[] args) {
    new Sub().doStuff();
  }
}
