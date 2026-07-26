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

        Scanner sc = new Scanner(System.in);
        IO.println("Enter the base 1:");
        b1 = sc.nextDouble();
        Scanner sc = new Scanner(System.in);
        IO.println("Enter the base 2:");
        b2 = sc.nextDouble();
        Scanner sc = new Scanner(System.in);
        IO.println("Enter the leg 1:");
        l1 = sc.nextDouble();
        Scanner sc = new Scanner(System.in);
        IO.println("Enter the leg 2:");
        l2 = sc.nextDouble();
        Scanner sc = new Scanner(System.in);
        IO.println("Enter the Height:");
        height = sc.nextDouble();
    }
}
