public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");

        // 1. Working with 1D Arrays
        int[] ar = {1, 2, 3, 4};

        System.out.println("\n--- Standard For Loop ---");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        System.out.println("\n--- For-Each Loop ---");
        for (int i : ar) {
            System.out.println(i);
        }

        // 2. Working with 2D Arrays (Matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\n--- Matrix Element ---");
        System.out.println("Element at [1][2]: " + matrix[1][2]); // 6
    }
}
