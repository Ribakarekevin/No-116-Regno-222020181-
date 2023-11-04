public class Breakstatement {
    public static void main(String[] args) {
        for (int A = 0; A < 10; A++){
            if (A==5)
            break;
            System.out.println("A: "  + A);
        }
        System.out.println("Loop complete.");
    }
}
