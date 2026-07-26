import java.util.Scanner;
import java.util.Set;

public class CircleCalculator {
    public static void main(String[] args){
        Double pi = 3.14;
        Double radius;

        Scanner sc = new Scanner(System.in);
        IO.println("Enter the Radius of the circle:");
        Double radius = sc.nextDouble();


        if (radius <= 0){
            IO.println("Invalid radius must be greater than zero.");
        }else{
            Double area = pi * (radius * radius);
            Double circumference = 2 * pi * radius;
            IO.println("The Circle area is: "+area);
            IO.println("The Circle circumference is: "+circumference);
        }
        if (radius < 5){
            IO.println("Small Circle");
        } else if (radius < 15) {
            IO.println("Medium Circle");
        }else{
            IO.println("Large Circle");
        }
    }
}
