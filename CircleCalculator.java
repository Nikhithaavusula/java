import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius=sc.nextDouble();
        double circumference=Math.PI*radius;
        double area=Math.PI*radius*radius;
        System.out.println("radius: "+ radius);
        System.out.println("circumference: "+ circumference);
        System.out.println("area: "+ area);

    }
}
