// interface showing calculator operations
interface Calculator{
    double add(double num1, double num2);
}
// Class Find implements Calculator interface 
class Find implements Calculator {
    // Method to add two numbers
    public double add(double num1, double num2){
         return num1 + num2;
    }
}
// Class Multiplication is extending from class Find
class Multiplication extends Find{
    // Method created to multiply two variables
    public int multiply(int a, int b){
        return a * b;
    }
}
// Class Division is extending from class Multiplication 
class Division extends Multiplication{
    // Method divide created to divide two values
    public double divide(double x, double y){
        return x / y;
    }
}
// class Substraction is extending from class Division
class Substraction extends Division{
    //Method created to substract two variables 
    public int substraction(int c, int d){
        return c - d;
    }
    public static void main(String[] args) {
        // Creating objects of Find, multiplication,division,and substraction
        Find F = new Find();
        Multiplication M = new Multiplication();
        Division D = new Division();
        Substraction S = new Substraction();
       double answer1 = F.add(5,3);
       int answer2 = M.multiply(10,5);
       double answer3 = D.divide(45,7);
       int answer4 = S.substraction(78,56);

       // Displaying the outputs
       System.out.println("Addition of the two numbers is: " + answer1);
       System.out.println("Multiplication of the two numbers is: " + answer2);
       System.out.println("Division of the two numbers is: " + answer3);
       System.out.println("Substraction of the two numbers is: " + answer4);
    }
}



