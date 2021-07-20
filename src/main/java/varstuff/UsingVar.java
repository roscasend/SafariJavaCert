package varstuff;

class X {
  // NOPE, var is method local vars only
//  var x = 99;
}

public class UsingVar {
//
//  void doStuff(var x) { }
//
//  void doStuff() {
//    var x;
//    x = 100;
//  }
//
//  void doStuff() {
//    var x = 100;
//  }
//
//  void doStuff() {
//    var x = { 1, 2, 3 }; // fails
//    var x = new int[]{ 1, 2, 3 }; // this is OK
//    var [] x = new int[]{ 1, 2, 3 }; // fails too.
//  }

//  public void doStuff(int [] ia) {}
//  public void useIt() {
////    int [] ia = {1, 2, 3}; // type inferencing
//    int [] ia = new int[]{1, 2, 3}; // EXPLICIT typing
//    doStuff(ia);
//    doStuff(new int[]{1, 2, 3});
//    var x = "Hello";
////    var x = 1, y = 2;
//  }

//  void doStuff() {
//    try {
//      // stuff happens
//    } catch (NullPointerException ex) {
//    } catch (OutOfMemoryError de) {
//
//    }
//  }
}
