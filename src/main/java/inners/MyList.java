package inners;

import java.util.Iterator;

public class MyList<E> implements Iterable<E> {
  private E[] data = (E[])new Object[10];
  private int count = 0;

  public void add(E e) {
    data[count++] = e;
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder("MyList [");
    for (int i = 0; i < count; i++) {
      res.append(data[i]).append(", ");
    }
    res.setLength(res.length() - 2);
    res.append("]");
    return res.toString();
  }

  private class MyIterator implements Iterator<E> {
    private MyIterator(/* implicit argument of MyList type!*/) {}

    private int progress = 0;
//    private int count = 0;
    @Override
    public boolean hasNext() {
//      return progress < MyList.this.count;
      return progress < count;
    }

    @Override
    public E next() {
      return data[progress++];
    }
  }

  @Override
  public Iterator<E> iterator() {
//    return this.new MyIterator();
    // instance prefix not essential, and will be implied if omitted,
    // IFF you are in an INSTANCE CONTEXT
//    return new MyIterator();
    return this.new MyIterator();
  }

  public static void main(String[] args) {
    MyList<String> mls = new MyList<>();
    mls.add("Fred");
    mls.add("Jim");
    mls.add("Sheila");
    System.out.println(mls);

    MyList<String> m2 = new MyList<>();
    m2.new MyIterator();
    new MyList<>().new MyIterator();
  }

  /*
  A) Got it! (or good enough)
  B) Hmmm...
  C) No clue..
   */
}
