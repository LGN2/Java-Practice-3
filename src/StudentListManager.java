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
    }
}
