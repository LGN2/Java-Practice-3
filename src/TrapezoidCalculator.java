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

        if (a <= 0 || b <= 0 || c <= 0 || base <= 0 || height <= 0) {
            IO.println("Invalid input. All values must be greater than zero.");
        } else {
            area = (base * height) / 2;
            perimeter = a + b + c;
        }
    }
}
