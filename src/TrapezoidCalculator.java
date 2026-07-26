import java.util.Scanner;

public class TrapezoidCalculator {
    public static void main(String[] args){
        Double b1;
        Double b2;
        Double l1;
        Double l2;
        Double height;
        Double area;
        Double perimeter;
        String type;

        Scanner b01 = new Scanner(System.in);
        IO.println("Enter the base 1:");
        b1 = b01.nextDouble();
        Scanner b02 = new Scanner(System.in);
        IO.println("Enter the base 2:");
        b2 = b02.nextDouble();
        Scanner l01 = new Scanner(System.in);
        IO.println("Enter the leg 1:");
        l1 = l01.nextDouble();
        Scanner l02 = new Scanner(System.in);
        IO.println("Enter the leg 2:");
        l2 = l02.nextDouble();
        Scanner h1 = new Scanner(System.in);
        IO.println("Enter the Height:");
        height = h1.nextDouble();

        if (b1 <= 0 || b2 <= 0 || l1 <= 0 || l2 <= 0 || height <= 0) {
            IO.println("Invalid input. All values must be greater than zero.");
        } else {
            area = ((b1 + b2) * height)/2;
            perimeter = b1 + b2 + l1 + l2;
        }

        if (perimeter <30) {
            type = "Small Trapezoid";
        } else if (perimeter <= 60) {
            type = "Medium Trapezoid";
        } else {
            type = "Large Trapezoid";
        }

        IO.println("Base 1: "+b1);
        IO.println("Base 2: "+b2);
        IO.println("Leg 1: "+l1);
        IO.println("Leg 2: "+l2);
        IO.println("Height: "+height);
        IO.println("Area: "+area);
        IO.println("Perimeter: "+perimeter);
        IO.println("Type: "+type);
    }
}
