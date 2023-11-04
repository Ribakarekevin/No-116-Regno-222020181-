public class Dowhileloop {
    public static void main(String[] args) {
        String userInput;
        do{
            System.out.println("Type a word (or 'quit' to exit): ");
            userInput = "quit";
    }
    while (!userInput.equals("quit"));
    System.out.println("Exiting loop. Goodbye!");
}
}