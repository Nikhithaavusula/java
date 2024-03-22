import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value: ");
        double a=sc.nextDouble();
        System.out.println("Enter b value: ");
        double b=sc.nextDouble();
        System.out.println("Enter operator: ");
        int operator=sc.nextInt();
        switch(operator) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Invalid number");
                } else {
                    System.out.println(a/b);
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("Invalid number");
                } else {
                    System.out.println(a%b);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
