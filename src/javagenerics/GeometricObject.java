/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Gary De la Cruz (gdelacruz2918@westfield.ma.edu) 
 * (c) 2017
 * Created: Sep 9, 2017 9:58:33 PM 
 */

package javagenerics;

/**
 * Class GeometricObject
 * @author Gary De la Cruz
 */
public abstract class GeometricObject {
  private String color = "white";
  private java.util.Date dateCreated;

/**
 * GeometricObject constructor 1
 */
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** 
   * Construct a geometric object with color and filled value 
   * @param color color of the object
   */
  protected GeometricObject(String color) {
    dateCreated = new java.util.Date();
    this.color = color;
  }

/**
 * color getter
 * @return color 
 */
  public String getColor() {
    return color;
  }

  /**
   * color setter
   * @param color 
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * data created getter
   * @return data created 
   */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }
/**
 * toString for GeometricObject
 * @return toString 
 */
  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color;
  }

/**
 * area getter
 * @return area  
 */
  public abstract double getArea();

  /**
   * perimeter getter
   * @return perimeter
   */
  public abstract double getPerimeter();
}