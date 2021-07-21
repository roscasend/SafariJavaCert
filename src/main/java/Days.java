public enum Days {
  // actually static final fields, initialized during
  // class initialization!!! (weird, because the instance
  // initialization happens before the class initilization)

  // Values MUST BE FIRST
  MONDAY, TUESDAY;

  // default constructor for any enum is PRIVATE

  // this is still PRIVATE by default
  private Days() {
  }

  private Days(int value) {
//    *** TODO talk about this!!!
  }

  private int number = 3;

  // toString defaults to name()
  @Override
  public String toString() {
    return "whoot!" + super.toString();
  }

  public static void sayHello() {
    System.out.println("Hello");
  }

  public void sayHelloAgain() {
    // name is a final method giving MONDAY... etc.
    System.out.println("Hello, it's " + this.name());
  }
}
