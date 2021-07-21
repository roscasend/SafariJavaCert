package inners;

import java.util.List;
import java.util.function.Predicate;

public class UseClosure {

  static Predicate<String> getOne(int x) {
//    x--;
    final int y = x++;
    return new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.length() >= /*++*/y;
      }
    };
  }

  public static void main(String[] args) {

    System.out.println(
        List.of("Fred", "Jim", "Sheila")
            .removeIf(getOne(3)));
  }
}

