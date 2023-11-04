//Defining a class named Compound
public class Compound {
    int principal; //Declaring a variable principal to store the principal amount
    double rate; //Declaring a variable rate to store the rate
    int years; //Declaring a variable years to store number of years

    // Creating a method to calculate the total amount to be paid 
    public double TotalAmount(){
        double monthlyrate = rate / 100 / 12;
        int totalpayment = years * 12;
        double TotalAmount = principal * Math.pow(1 + monthlyrate, totalpayment);
        return TotalAmount;
    }
}
// Main class
class Amount{
    public static void main(String[] args) {
        // Creating an object
        Compound nCompound = new Compound();
        nCompound.principal = 500000;
        nCompound.rate = 18;
        nCompound.years = 3;

        // Calculate and print the total amout paid after 3 years
        double TotalAmount = nCompound.TotalAmount();
        // Print the calculated amount
        System.out.println("The amount paid after 3 years: "+ TotalAmount + " RWF");

    }
}
