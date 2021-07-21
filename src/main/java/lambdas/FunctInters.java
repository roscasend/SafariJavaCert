package lambdas;

@FunctionalInterface
interface A {
  void doStuff();
}

/*
@FunctionalInterface
*/
interface B {
  void doStuff();

  abstract void doMoreStuff();
}

@FunctionalInterface
interface C {
  void doStuff();

  default void doMoreStuff() {
  }
}

//@FunctionalInterface
/*public */interface D {
  static void doStuff() {
  }

  default void doMoreStuff() {
  }
}

@FunctionalInterface
    /*public */interface E {
  static void doStuff() {
  }

  default void doMoreStuff() {
  }

  public abstract void evenMoreStuff();
}

public class FunctInters {
}
