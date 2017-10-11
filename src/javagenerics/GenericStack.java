/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Daniel Liang 
 * (c) 2017
 * Created: Oct 11, 2017 11:38:23 AM 
 */

package javagenerics;

/**
 * Class GenericStack
 * @author Daniel Liang
 */
 
public class GenericStack<E> {
  private java.util.ArrayList<E> list = new java.util.ArrayList<>();

  public int getSize() {
    return list.size();
  }

  public E peek() {
    return list.get(getSize() - 1);
  }

  public void push(E o) {
    list.add(o);
  }

  public E pop() {
    E o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }
  
  @Override
  public String toString() {
    return "stack: " + list.toString();
  }
}
