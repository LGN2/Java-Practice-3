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

            System.out.println("\n========== BANK ACCOUNT SYSTEM ==========");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Account Balance");
            System.out.println("5. Display Account Statistics");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    displayAccounts(
                            accountNumbers,
                            customerNames,
                            accountBalances);
                    break;

                case 2:

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    System.out.print("Enter Deposit Amount: ");
                    amount = sc.nextDouble();

                    depositMoney(
                            accountNumbers,
                            accountBalances,
                            accountNumber,
                            amount);
                    break;

                case 3:

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    System.out.print("Enter Withdrawal Amount: ");
                    amount = sc.nextDouble();

                    withdrawMoney(
                            accountNumbers,
                            accountBalances,
                            accountNumber,
                            amount);
                    break;

                case 4:

                    System.out.print("Enter Account Number: ");
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

                    System.out.println("Thank you for using the Bank Account System.");
                    break;

                default:

                    System.out.println("Invalid Menu Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
