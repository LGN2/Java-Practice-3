import java.util.ArrayList;
import java.util.List;

public class StudentListManager {
    public static void main(String[] args){
        List<String> students = new ArrayList<>();

        students.add("Abdulrahman");
        students.add("Almajd");
        students.add("Abdulaziz");
        students.add("Suliman");
        students.add("Mohammed");
        students.add("Nawaf");
        students.add("Ali");
        students.add("Rashed");
        students.add("Almonther");
        students.add("Said");

        for (String student : students){
            IO.println(student);
        }

        IO.println("Total Students: "+students.size());
        IO.println("First Students: "+students.getFirst());
        IO.println("Last Students: "+students.getLast());

        if (students.contains("Ali")){
            IO.println("The Student is in the list");
        }else {
            IO.println("The Student is not in the list");
        }

        students.remove("Ali");
        for (String student : students){
            IO.println(student);
        }
    }
}
