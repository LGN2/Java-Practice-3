import java.util.ArrayList;
import java.util.List;

public class NumberListStatistics {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(-10);
        numbers.add(-9);
        numbers.add(-8);
        numbers.add(-7);
        numbers.add(-6);
        numbers.add(-5);
        numbers.add(-4);
        numbers.add(-3);
        numbers.add(-2);
        numbers.add(-1);
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        Integer totalSum = 0;
        Integer evenNumbers = 0;
        Integer oddNumbers = 0;
        Integer positiveNumbers = 0;
        Integer negativeNumbers = 0;
        Integer numberZero = 0;
        Integer largest;
        Integer smallest;
        Integer avg = 0;

        largest = numbers.get(0);
        smallest = numbers.get(0);

        for (int number : numbers) {

            if (number % 2 ==0){
                evenNumbers ++;
            }else {
                oddNumbers ++;
            }

            if (number > 0){
                positiveNumbers ++;
            } else if (number < 0) {
                negativeNumbers ++;
            }else {
                numberZero ++;
            }

            if (number > largest) {
                largest = number;
            }

            if (number > smallest) {
                smallest = number;
            }

            totalSum += number;

            avg = (Integer) totalSum / numbers.size();


        }
        for (Integer number : numbers) {
            IO.println(number);
        }
        IO.println("Sum of Numbers: "+totalSum);
        IO.println("Average: "+avg);
        IO.println("Largest Number: "+largest);
        IO.println("Smallest Number: "+smallest);
        IO.println("Count of Even Numbers: "+evenNumbers);
        IO.println("Count of Odd Numbers: "+oddNumbers);
        IO.println("Count of Positive Numbers: "+positiveNumbers);
        IO.println("Count of Negative Numbers: "+negativeNumbers);
    }
}
