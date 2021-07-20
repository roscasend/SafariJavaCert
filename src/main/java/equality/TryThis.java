package equality;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TryThis {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder("Hello");
    StringBuilder t = new StringBuilder("He");
    t.append("llo");
    System.out.println(s.equals(t));

    System.out.println("LocalDate?");
    LocalDate ld = LocalDate.of(2021, 3, 29);
    LocalDate ld2 = LocalDate.of(2021, 3, 29);
    System.out.println(ld.equals(ld2));

    System.out.println("Lists?");
    List<String> ls = List.of("Fred", "Jim");
    List<String> ls2 = new ArrayList<>(ls);
    System.out.println(ls.equals(ls2));

    List<String> ls3 = List.copyOf(ls2);
    System.out.println(ls == ls3);

  }
}
