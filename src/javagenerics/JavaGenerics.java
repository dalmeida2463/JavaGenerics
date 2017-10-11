/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Daniel Liang 
 * (c) 2017
 * Created: Oct 11, 2017 11:33:10 AM 
 */
package javagenerics;

import java.util.ArrayList;

/**
 *
 * @author Daniel Liang
 */
public class JavaGenerics {

    /** Find the maximum in a stack of numbers */
  public static double max(GenericStack<Number> stack) {
    double max = stack.pop().doubleValue(); // initialize max

    while (!stack.isEmpty()) {
      double value = stack.pop().doubleValue();
      if (value > max)
        max = value;
    }

    return max;
  }

  /** 
   * Move all elements from stack1 into stack2
   * @param <T> type of the elements
   * @param stack1 source stack
   * @param stack2 destination stack
   */
  public static <T> void add(GenericStack<T> stack1,
      GenericStack<? super T> stack2) {
    while (!stack1.isEmpty())
      stack2.push(stack1.pop());
  }

  /**
   * Array list test method
   */
  public static void testArrayList() {
      // Create a list to store cities
    ArrayList<String> cityList = new ArrayList<String>();

    // Add some cities in the list
    cityList.add("London");
    cityList.add("New York");
    cityList.add("Paris");
    cityList.add("Toronto");
    cityList.add("Hong Kong");
    cityList.add("Singapore");

    System.out.println("List size? " + cityList.size());
    System.out.println("Is Toronto in the list? " +
      cityList.contains("Toronto"));
    System.out.println("The location of New York in the list? "
      + cityList.indexOf("New York"));
    System.out.println("Is the list empty? " +
      cityList.isEmpty()); // Print false

    // Insert a new city at index 2
    cityList.add(2, "Beijing");

    // Remove a city from the list
    cityList.remove("Toronto");

    // Remove a city at index 1
    cityList.remove(1);

    // Display London Beijing Paris Hong Kong Singapore
    for (int i = 0; i < cityList.size(); i++)
      System.out.print(cityList.get(i) + " ");
    System.out.println();

    // Create a list to store two circles
    ArrayList<Circle> list = new ArrayList<Circle>();

    // Add a circle and a cylinder
    list.add(new Circle(2));
    list.add(new Circle(3));

    // Display the area of the first circle in the list
    System.out.println("The area of the circle? " +
      ((Circle)list.get(0)).getArea());
  }
  
  public static void testIntegerMatrix() {
    // Create Integer arrays m1, m2
    Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
    Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};

    // Create an instance of IntegerMatrix
    IntegerMatrix integerMatrix = new IntegerMatrix();

    System.out.println("\nm1 + m2 is ");
    GenericMatrix.printResult(
      m1, m2, integerMatrix.addMatrix(m1, m2), '+');

    System.out.println("\nm1 * m2 is ");
    GenericMatrix.printResult(
      m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');
  }

  public static void testRationalMatrix() {
    // Create two Rational arrays m1 and m2
    Rational[][] m1 = new Rational[3][3];
    Rational[][] m2 = new Rational[3][3];
    for (int i = 0; i < m1.length; i++)
      for (int j = 0; j < m1[0].length; j++) {
        m1[i][j] = new Rational(i + 1, j + 5);
        m2[i][j] = new Rational(i + 1, j + 6);
      }

    // Create an instance of RationalMatrix
    RationalMatrix rationalMatrix = new RationalMatrix();

    System.out.println("\nm1 + m2 is ");
    GenericMatrix.printResult(
      m1, m2, rationalMatrix.addMatrix(m1, m2), '+');

    System.out.println("\nm1 * m2 is ");
    GenericMatrix.printResult(
      m1, m2, rationalMatrix.multiplyMatrix(m1, m2), '*');
  }
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
  }
  
  
}
