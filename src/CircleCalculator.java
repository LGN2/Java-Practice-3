import java.util.Scanner;
import java.util.Set;

public class CircleCalculator {
    public static void main(String[] args){
        Double pi = 3.14;
        Double radius;
        Double area = 0.0;
        Double circumference = 0.0;
        String classification;

        Scanner sc = new Scanner(System.in);
        IO.println("Enter the Radius of the circle:");
        radius = sc.nextDouble();


        if (radius <= 0){
            IO.println("Invalid radius must be greater than zero.");
        }else{
            area = pi * (radius * radius);
            circumference = 2 * pi * radius;
        }
        if (radius < 5){
            classification = "Small Circle";
        } else if (radius <= 15) {
            classification = "Medium Circle";

        }else{
            classification = "Large Circle";

        }

        IO.println("Radius: "+radius);
        IO.println("Area: "+area);
        IO.println("Circumference: "+circumference);
        IO.println("Classification: "+classification);
    }
}
