public class Main {

    public static void main(String[] args) {
        // Pola 1 Right Half Pyramid
        int bintang = 5;
        for (int b = bintang; b > 0; b--) {
            for (int i = bintang; i >= b; i--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();

        // Pola 2 Reverse Right Half Pyramid
        bintang = 5;
        for (int b = 1; b <= bintang; b++) {
            for (int g = bintang; g >= b; g--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();

        // Pola 3 Left Half Pyramid
        bintang = 5;
        for (int b = bintang; b > 0; b--) {
            for (int n = 1; n <= b; n++) {
                System.out.print("   ");
            }
            for (int b1 = bintang; b1 >= b; b1--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
