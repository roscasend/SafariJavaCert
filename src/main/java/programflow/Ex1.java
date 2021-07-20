package programflow;

enum Day { MONDAY; }

public class Ex1 {
  public static void main(String[] args) {
//   int x = 99; while (x) {}

//    int x = 99; switch (x) {}

//    Day x = Day.MONDAY;
//    switch (x) {
//      case MONDAY:
//    }

//    D) enum Day { MONDAY; }
//...
//    Day x = Day.MONDAY;
//    switch (x) {
//      case Day.MONDAY:
//    }

    // switch accepts int (and smaller) NOT boolean
    // enums but the case must be unqualified
    // String
//    long count = 99;
//    switch (count) {}

    // Switch MUST HAVE constant expressions for the cases
    int x = 99;
    final int y = 99;
    int z = 101;
    switch (x) {
      case y + 101:
    }

    if (false) {
      System.out.println("debug message");
    }

    // scope of variables in for loops
//    for (System.out.println("Hello"), System.out.print(""); Math.random() > 0.5; System.out.println("Hello again") )
//    for (int i = 99, j[] = {}; Math.random() > 0.5; )
//      ;
//    System.out.println(i);
  }
}
