import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountSystem2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> accountNumbers;
        ArrayList<String> customerNames;
        ArrayList<Double> accountBalances;

        Integer choice;
        Integer accountNumber;
        Double amount;

        accountNumbers = new ArrayList<>();
        customerNames = new ArrayList<>();
        accountBalances = new ArrayList<>();

        accountNumbers.add(1001);
        customerNames.add("Almajd Salim");
        accountBalances.add(2500.0);

        accountNumbers.add(1002);
        customerNames.add("Ahmed Ali");
        accountBalances.add(1800.0);

        accountNumbers.add(1003);
        customerNames.add("Sara Mohamed");
        accountBalances.add(3200.0);

        accountNumbers.add(1004);
        customerNames.add("John Smith");
        accountBalances.add(950.0);

        accountNumbers.add(1005);
        customerNames.add("Emily Brown");
        accountBalances.add(5000.0);

        accountNumbers.add(1006);
        customerNames.add("Ali Hassan");
        accountBalances.add(1250.0);

        accountNumbers.add(1007);
        customerNames.add("Fatima Noor");
        accountBalances.add(4100.0);

        accountNumbers.add(1008);
        customerNames.add("David Lee");
        accountBalances.add(750.0);

        accountNumbers.add(1009);
        customerNames.add("Sophia Green");
        accountBalances.add(6200.0);

        accountNumbers.add(1010);
        customerNames.add("Michael White");
        accountBalances.add(2800.0);
    }
}
