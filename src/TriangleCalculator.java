import java.util.Scanner;

public class TriangleCalculator {

    public static void main(String[] args) {
        
        Double base;
        Double height;
        Double area = 0.0;
        Double a;
        Double b;
        Double c;
        Double perimeter = 0.0;
        String type;

        Scanner sc = new Scanner(System.in);
        IO.println("Enter the three sides, base and height of the triangle:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        base = sc.nextDouble();
        height = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0 || base <= 0 || height <= 0) {
            IO.println("Invalid input. All values must be greater than zero.");
        } else {
            area = (base * height) / 2;
            perimeter = a + b + c;
        }
        if (a == b && b == c) {
            type = "Equilateral";
        } else if (a == b || a == 3 || b == c) {
            type = "Isosceles";
        } else {
            type = "Scalene";
        }

        IO.println("The base: " + base);
        IO.println("The Height: " + height);
        IO.println("The Side A: " + a);
        IO.println("The Side B: " + b);
        IO.println("The Side C: " + c);
        IO.println("The Triangle Area is: " + area);
        IO.println("The Triangle perimeter: " + perimeter);
        IO.println("The Triangle Type is: " + type);

    }
}
