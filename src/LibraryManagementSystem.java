import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<String> bookNames;
        ArrayList<String> authorNames;
        ArrayList<Boolean> bookAvailability;

        Integer choice;
        String bookName;
        Integer[] bookCounts;

        bookNames = new ArrayList<>();
        authorNames = new ArrayList<>();
        bookAvailability = new ArrayList<>();

        // Add books
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
    }
}
