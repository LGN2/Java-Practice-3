public class StudentResultAnalyzer {
    public static void main(String[] args){
        String studentName;
        Integer math;
        Integer english;
        Integer science;
        Integer totalMarks;
        Integer subNum;
        Integer averageMarks;
        Integer finalGrade;
        String performanceStatus;

        studentName = "Almajd Salim";
        math = 98;
        english = 95;
        science = 86;
        subNum = 3;
    }
    public static boolean validateMarks(Integer math,
                                        Integer english,
                                        Integer science){
        
        return math >= 0 && math <= 100 &&
                science >= 0 && science <= 100 &&
                english >= 0 && english <= 100;
    }
}
