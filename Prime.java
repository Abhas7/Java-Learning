public class Prime {
    public static void main(String[] args) {
        int num = 7;
        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) { 
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is composite");
        }
    }
}
 