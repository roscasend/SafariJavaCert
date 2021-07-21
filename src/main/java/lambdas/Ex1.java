package lambdas;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Ex1 {
  BiFunction<String, String, Integer> f = (s, t) -> s.length() - t.length();
//  BiPredicate<String> f2 = (s, t) -> s.length() - t.length();
  Comparator<String> f3 = (s, t) -> s.length() - t.length();
//  Supplier<String, Integer> f4 = (s, t) -> s.length() - t.length();
//  BinaryOperator<String> f5 = (s, t) -> s.length() - t.length();

}
