public class Forloop {
    public static void main(String[] args) {
        String message = "Hello,World!";
        for (int i = 0; i < message.length(); i++){
            char character = message.charAt(i);
            System.out.println("Character at index" + i + ":" + character);
        }
    }
}
