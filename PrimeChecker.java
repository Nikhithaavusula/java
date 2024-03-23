import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 1) {
            System.out.println("This is not prime nor composite");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("This is a prime number");
            } else {
                System.out.println("This is not a prime number");
            }
        }
    }
}
