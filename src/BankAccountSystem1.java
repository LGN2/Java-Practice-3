import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountSystem1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        ArrayList<Integer> accountNumbers;
        ArrayList<String> customerNames;
        ArrayList<Double> balances;

        Integer choice;
        Integer accountNumber;
        Double amount;


        accountNumbers = new ArrayList<>();
        customerNames = new ArrayList<>();
        balances = new ArrayList<>();

        
        accountNumbers.add(1001);
        customerNames.add("Almajd Salim");
        balances.add(1500.0);

        accountNumbers.add(1002);
        customerNames.add("Ahmed Ali");
        balances.add(2200.0);

        accountNumbers.add(1003);
        customerNames.add("Sara Mohamed");
        balances.add(3500.0);

        accountNumbers.add(1004);
        customerNames.add("John Smith");
        balances.add(900.0);

        accountNumbers.add(1005);
        customerNames.add("Emily Brown");
        balances.add(5000.0);
    }
}
