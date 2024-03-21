import java.util.*;
public class Prime {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if (n<=1) {
            System.out.println("Neither prime nor composite");
        } else {
            for (int i=2;i<=Math.sqrt(n);i++) {
                if (n%i==0) {
                    isPrime=false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }
    }
}
