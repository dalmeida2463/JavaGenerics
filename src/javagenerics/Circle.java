/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Daniel Liang 
 * (c) 2017
 * Created: Oct 11, 2017 11:52:42 AM 
 */

package javagenerics;

/**
 * Class Circle
 * @author Gary De la Cruz
 */
public class Circle 
    extends GeometricObject {
  private double radius;

  /**
   * Circle constructor 1
   */
  public Circle() {
  }
/**
 * Circle constructor 2
 * @param radius 
 */
  public Circle(double radius) {
    this.radius = radius;
  }
/**
 * Circle constructor 3
 * @param radius
 * @param color 
 */
  public Circle(double radius, 
      String color) {
    this.radius = radius;
    setColor(color);
  }

  /**
   * radius getter
   * @return radius
   */
  public double getRadius() {
    return radius;
  }

  /**
   * radius setter
   * @param radius 
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * area getter
   * @return area
   */
  public double getArea() {
    return radius * radius * Math.PI;
  }
  
  /**
   * diameter getter
   * @return diameter
   */
  public double getDiameter() {
    return 2 * radius;
  }
  
  /**
   * perimeter getter
   * @return 
   */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
/**
 * toString for Circle
 * @return toString
 */
  @Override
  public String toString() {
    return "Circle{" + "radius=" + radius + '}';
  }


}