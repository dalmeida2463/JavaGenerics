/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Daniel Liang 
 * (c) 2017
 * Created: Oct 11, 2017 11:58:31 AM 
 */

package javagenerics;

/**
 * Class IntegerMatrix
 * @author Daniel Liang
 */ 
public class IntegerMatrix extends GenericMatrix<Integer> {
  @Override /** Add two integers */
  protected Integer add(Integer o1, Integer o2) {
    return o1 + o2;
  }

  @Override /** Multiply two integers */
  protected Integer multiply(Integer o1, Integer o2) {
    return o1 * o2;
  }

  @Override /** Specify zero for an integer */
  protected Integer zero() {
    return 0;
  }
}