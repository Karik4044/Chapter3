public class EX15 {
    public static void main(String[] args) {
        int rows = 7;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < Math.abs( rows / 2 - i ); j++){
                System.out.print("     ");
            }
            for(int k = 0; k < rows - 2 * Math.abs(rows / 2 - i ); k++) {
                System.out.print("  *  ");
            }
            System.out.println();
        }
    }
}
