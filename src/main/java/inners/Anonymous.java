package inners;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

//interface Predicate<E> {
//  boolean test(E e);
//}

class LongString implements Predicate<String> {
  @Override
  public boolean test(String s) {
    return s.length() > 3;
  }
}

class FirstHalf implements Predicate<String> {

  @Override
  public boolean test(String s) {
    return s.charAt(0) <= 'M';
  }
}

public class Anonymous {

  public static <E> List<E> filter(List<E> in, Predicate<E> crit) {
    List<E> results = new ArrayList<>();
    for (E s : in) {
      if (crit.test(s)) {
        results.add(s);
      }
    }
    return results;
  }

  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Sheila");
    System.out.println("Names is " + names);
    System.out.println("long names is " + filter(names, new LongString()));
    System.out.println("first half names is " + filter(names, new FirstHalf()));

    Predicate<String> ps = new /*class LongString implements */Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.length() > 3;
      }

      @Override
      public String toString() {
//        System.out.println(this);
        return super.toString();
      }
    };

    System.out.println("long names is " + filter(names, ps));
    System.out.println("type of ps is " + ps.getClass());

//    System.out.println("long names is " + filter(names, /*new Predicate<String>() {
//      @Override
//      public boolean test*/(String s) -> {
//        return s.length() > 3;
//      }
//    /*}*/));
//    System.out.println("long names is " + filter(names,
//        (String s) -> {
////          System.out.println(this); // lambda is NOT represented by a "this" context object
//      return s.length() > 3;
//    }));
    System.out.println("long names is " + filter(names,
//        (String s) -> { return s.length() > 3; }
//        (s) -> s.length() > 3
//        s -> s.length() > 3
        (@Deprecated var s) -> s.length() > 3
    ));

//    Comparator<String> cs = (String s1, String s2) -> s1.compareTo(s2);
//    Comparator<String> cs = (s1, s2) -> s1.compareTo(s2);
    Comparator<String> cs = (var s1, var s2) -> s1.compareTo(s2);

  }
}
