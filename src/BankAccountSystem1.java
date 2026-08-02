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


        do {

            IO.println("\n========== BANK ACCOUNT SYSTEM ==========");
            IO.println("1. Display All Accounts");
            IO.println("2. Deposit Money");
            IO.println("3. Withdraw Money");
            IO.println("4. Check Account Balance");
            IO.println("5. Display Account Statistics");
            IO.println("6. Exit");
            IO.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    displayAccounts(accountNumbers, customerNames, balances);
                    break;

                case 2:

                    IO.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    IO.print("Enter Deposit Amount: ");
                    amount = sc.nextDouble();

                    depositMoney(accountNumbers, balances, accountNumber, amount);
                    break;

                case 3:

                    IO.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    IO.print("Enter Withdrawal Amount: ");
                    amount = sc.nextDouble();

                    withdrawMoney(accountNumbers, balances, accountNumber, amount);
                    break;

                case 4:

                    IO.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    checkBalance(accountNumbers, balances, accountNumber);
                    break;

                case 5:

                    calculateStatistics(balances);
                    break;

                case 6:

                    IO.println("Thank you for using the Bank Account System.");
                    break;

                default:

                    IO.println("Invalid Menu Choice.");

            }

        } while (choice != 6);

        sc.close();
    }
    public static void displayAccounts(
            ArrayList<Integer> accountNumbers,
            ArrayList<String> customerNames,
            ArrayList<Double> balances) {

        System.out.println("\n========== ACCOUNT LIST ==========");

        for (Integer i = 0; i < accountNumbers.size(); i++) {

            System.out.println("--------------------------------");
            System.out.println("Account Number : " + accountNumbers.get(i));
            System.out.println("Customer Name  : " + customerNames.get(i));
            System.out.println("Balance        : $" + balances.get(i));
        }
    }
    public static void depositMoney(
            ArrayList<Integer> accountNumbers,
            ArrayList<Double> balances,
            Integer accountNumber,
            Double amount) {

        Boolean found = false;

        for (Integer i = 0; i < accountNumbers.size(); i++) {

            if (accountNumbers.get(i).equals(accountNumber)) {

                balances.set(i, balances.get(i) + amount);

                System.out.println("Deposit Successful.");
                System.out.println("New Balance: $" + balances.get(i));

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account Not Found.");
        }
    }

}
