public class Nestedforloop {
    public static void main(String[] args) {
        int size = 5;
        //Upper part of the rhombus
        for (int i = 1; i <= size; i++){
            for ( int j = size; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();

        }
        // Lower part of a rhombus
        for (int i = size - 1; i >= 1; i--){
            for (int j = size; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
