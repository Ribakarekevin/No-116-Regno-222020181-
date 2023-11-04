// Defining a class named Bank 
public class Bank {
    int principal; // Declaring a variable used to store principal amount
    double rate; // Declaring a variable used to store interest rate
    int years; // Declaring a variable used to store number of years

    // Creating a method to calculate simple interest and return the result
    public double SimpleInterest(){
        double SimpleInterest = (principal * rate * years)/100;
        return SimpleInterest;
    }
}
// Main class
class Account{

    public static void main(String[] args) {
        Bank nBank = new Bank();
        nBank.principal = 100000; // Principal amount in RWF
        nBank.rate = 5; // Annual interest rate
        nBank.years = 5; // Number of years

        // Calculating simple interest using the SimpleInterest method
        double SimpleInterest = nBank.SimpleInterest();
        // Print the calculated simple interest
        System.out.println("The simple interest for Mr.Bob is: "+ SimpleInterest + " RWF");
    }
}

