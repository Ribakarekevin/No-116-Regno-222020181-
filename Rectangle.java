// Interface defining Geometry
interface Geometry{
    double area(double length, double width);
}

// Rectangle class implementing Geometry interface
class Rectangle implements Geometry {

    // Method to calculate the area of a rectangle 
  public double area(double length, double width){
      return length * width;
  }  
}

// Circle class is extending from rectangle class
class Circle extends Rectangle{
    // Method to calculate the area of circle
    public double circlearea(double radius){
        return Math.PI * radius * radius;
    }
}
// Square class is extending from the Circle class
class Square extends Circle{
    // Method to calculate the area of a square
    public double squarearea(double side){
        return side * side;
    }
}
// Triangle class extending from the Circle class 
class Triangle extends Square{
    // Method to calculate the area of a Triangle 
    public double trianglearea(double base, double height){
        return (base * height) / 2;
    }
    public static void main(String[] args) {
        // Creating objects of rectangle,circle,square and triangle 
        Rectangle R = new Rectangle();
        Circle C = new Circle();
        Square S = new Square();
        Triangle T = new Triangle();
        double result1 = R.area(20, 10);
        double result2 = C.circlearea(4);
        double result3 = S.squarearea(5);
        double result4 = T.trianglearea(6, 8);

        // Displaying the area of a rectangle,circle,square and triangle
        System.out.println("The area of the rectangle is: " +result1);
        System.out.println("The area of Circle is: " +result2);
        System.out.println("The area of a Square is: " +result3); 
        System.out.println("The area of a Triangle is: " +result4);
    }
}
