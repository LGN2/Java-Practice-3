import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountSystem2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

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


        do {

            IO.println("\n========== BANK ACCOUNT SYSTEM ==========");
            IO.println("1. Display All Accounts");
            IO.println("2. Deposit Money");
            IO.println("3. Withdraw Money");
            IO.println("4. Check Account Balance");
            IO.println("5. Display Account Statistics");
            IO.println("6. Exit");
            IO.println("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    displayAccounts(
                            accountNumbers,
                            customerNames,
                            accountBalances);
                    break;

                case 2:

                    IO.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    IO.print("Enter Deposit Amount: ");
                    amount = sc.nextDouble();

                    depositMoney(
                            accountNumbers,
                            accountBalances,
                            accountNumber,
                            amount);
                    break;

                case 3:

                    IO.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    IO.print("Enter Withdrawal Amount: ");
                    amount = sc.nextDouble();

                    withdrawMoney(
                            accountNumbers,
                            accountBalances,
                            accountNumber,
                            amount);
                    break;

                case 4:

                    IO.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    checkBalance(
                            accountNumbers,
                            accountBalances,
                            accountNumber);
                    break;

                case 5:

                    calculateStatistics(accountBalances);
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
            ArrayList<Double> accountBalances) {

        System.out.println("\n========== ACCOUNT LIST ==========");

        for (Integer i = 0; i < accountNumbers.size(); i++) {

            System.out.println("--------------------------------");
            System.out.println("Account Number : " + accountNumbers.get(i));
            System.out.println("Customer Name  : " + customerNames.get(i));
            System.out.println("Balance        : $" + accountBalances.get(i));
        }
    }

    public static void depositMoney(
            ArrayList<Integer> accountNumbers,
            ArrayList<Double> accountBalances,
            Integer accountNumber,
            Double amount) {

        Boolean found = false;

        for (Integer i = 0; i < accountNumbers.size(); i++) {

            if (accountNumbers.get(i).equals(accountNumber)) {

                accountBalances.set(i,
                        accountBalances.get(i) + amount);

                System.out.println("Deposit Successful.");
                System.out.println("New Balance: $" + accountBalances.get(i));

                found = true;
                break;
            }
        }

        if (!found) {

            System.out.println("Account Not Found.");
        }
    }
}
