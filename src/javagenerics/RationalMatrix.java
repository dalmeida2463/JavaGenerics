/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Daniel Liang 
 * (c) 2017
 * Created: Oct 11, 2017 11:59:17 AM 
 */

package javagenerics;

/**
 * Class RationalMatrix
 * @author Daniel Liang
 */
public class RationalMatrix extends GenericMatrix<Rational> {
  @Override /** Add two rational numbers */
  protected Rational add(Rational r1, Rational r2) {
    return r1.add(r2);
  }

  @Override /** Multiply two rational numbers */
  protected Rational multiply(Rational r1, Rational r2) {
    return r1.multiply(r2);
  }

  @Override /** Specify zero for a Rational number */
  protected Rational zero() {
    return new Rational(0,1);
  }
}
