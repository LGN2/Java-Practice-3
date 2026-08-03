import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> bookNames;
        ArrayList<String> authorNames;
        ArrayList<Boolean> bookAvailability;

        Integer choice;
        String bookName;
        Integer[] bookCounts;

        bookNames = new ArrayList<>();
        authorNames = new ArrayList<>();
        bookAvailability = new ArrayList<>();

        bookNames.add("Java Programming");
        authorNames.add("John Smith");
        bookAvailability.add(true);

        bookNames.add("Python Basics");
        authorNames.add("Sarah Lee");
        bookAvailability.add(true);

        bookNames.add("Database Systems");
        authorNames.add("David Brown");
        bookAvailability.add(false);

        bookNames.add("Web Development");
        authorNames.add("Emma Wilson");
        bookAvailability.add(true);

        bookNames.add("Operating Systems");
        authorNames.add("James Miller");
        bookAvailability.add(true);

        bookNames.add("Computer Networks");
        authorNames.add("Lisa Taylor");
        bookAvailability.add(false);

        bookNames.add("Artificial Intelligence");
        authorNames.add("Michael Scott");
        bookAvailability.add(true);

        bookNames.add("Data Structures");
        authorNames.add("Robert King");
        bookAvailability.add(true);

        bookNames.add("Software Engineering");
        authorNames.add("Jennifer White");
        bookAvailability.add(false);

        bookNames.add("Cyber Security");
        authorNames.add("Daniel Green");
        bookAvailability.add(true);

        do {

            IO.println("\n========== LIBRARY MENU ==========");
            IO.println("1. Display All Books");
            IO.println("2. Search Book");
            IO.println("3. Borrow Book");
            IO.println("4. Return Book");
            IO.println("5. Display Library Report");
            IO.println("6. Exit");
            IO.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    displayBooks(bookNames, authorNames, bookAvailability);
                    break;

                case 2:

                    IO.print("Enter Book Name: ");
                    bookName = sc.nextLine();

                    searchBook(bookNames, authorNames, bookAvailability, bookName);
                    break;

                case 3:

                    IO.print("Enter Book Name to Borrow: ");
                    bookName = sc.nextLine();

                    borrowBook(bookNames, bookAvailability, bookName);
                    break;

                case 4:

                    IO.print("Enter Book Name to Return: ");
                    bookName = sc.nextLine();

                    returnBook(bookNames, bookAvailability, bookName);
                    break;

                case 5:

                    bookCounts = countBooks(bookAvailability);

                    displayReport(
                            bookNames.size(),
                            bookCounts[0],
                            bookCounts[1]);

                    break;

                case 6:

                    IO.println("Program Ended.");
                    break;

                default:

                    IO.println("Invalid Choice.");

            }

        } while (choice != 6);

        sc.close();
    }

    public static void displayBooks(
            ArrayList<String> bookNames,
            ArrayList<String> authorNames,
            ArrayList<Boolean> bookAvailability) {

        IO.println("\n========== BOOK LIST ==========");

        for (Integer i = 0; i < bookNames.size(); i++) {

            IO.println("--------------------------------");
            IO.println("Book Name : " + bookNames.get(i));
            IO.println("Author    : " + authorNames.get(i));

            if (bookAvailability.get(i)) {
                IO.println("Status    : Available");
            } else {
                IO.println("Status    : Unavailable");
            }
        }
    }

    public static void searchBook(
            ArrayList<String> bookNames,
            ArrayList<String> authorNames,
            ArrayList<Boolean> bookAvailability,
            String bookName) {

        Boolean found = false;

        for (Integer i = 0; i < bookNames.size(); i++) {

            if (bookNames.get(i).equalsIgnoreCase(bookName)) {

                IO.println("\nBook Found");
                IO.println("Book Name : " + bookNames.get(i));
                IO.println("Author    : " + authorNames.get(i));

                if (bookAvailability.get(i)) {
                    IO.println("Status    : Available");
                } else {
                    IO.println("Status    : Unavailable");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            IO.println("Book Not Found.");
        }
    }
    
    public static void borrowBook(
            ArrayList<String> bookNames,
            ArrayList<Boolean> bookAvailability,
            String bookName) {

        Boolean found = false;

        for (Integer i = 0; i < bookNames.size(); i++) {

            if (bookNames.get(i).equalsIgnoreCase(bookName)) {

                found = true;

                if (bookAvailability.get(i)) {

                    bookAvailability.set(i, false);
                    IO.println("Book Borrowed Successfully.");

                } else {

                    IO.println("Book Is Already Borrowed.");
                }

                break;
            }
        }

        if (!found) {
            IO.println("Book Not Found.");
        }
    }

    public static void returnBook(
            ArrayList<String> bookNames,
            ArrayList<Boolean> bookAvailability,
            String bookName) {

        Boolean found = false;

        for (Integer i = 0; i < bookNames.size(); i++) {

            if (bookNames.get(i).equalsIgnoreCase(bookName)) {

                found = true;

                bookAvailability.set(i, true);

                IO.println("Book Returned Successfully.");

                break;
            }
        }

        if (!found) {
            IO.println("Book Not Found.");
        }
    }


    public static Integer[] countBooks(
            ArrayList<Boolean> bookAvailability) {

        Integer availableBooks = 0;
        Integer unavailableBooks = 0;

        for (Boolean status : bookAvailability) {

            if (status) {
                availableBooks++;
            } else {
                unavailableBooks++;
            }
        }

        return new Integer[]{
                availableBooks,
                unavailableBooks
        };
    }

    public static void displayReport(
            Integer totalBooks,
            Integer availableBooks,
            Integer unavailableBooks) {

        IO.println("\n========== LIBRARY REPORT ==========");
        IO.println("Total Books       : " + totalBooks);
        IO.println("Available Books   : " + availableBooks);
        IO.println("Unavailable Books : " + unavailableBooks);
    }
}