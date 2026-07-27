public class StudentResultAnalyzer {
    public static void main(String[] args) {
        String studentName;
        Integer math;
        Integer english;
        Integer science;
        Integer totalMarks;
        Integer subNum;
        Integer averageMarks;
        Character finalGrade;
        String performanceStatus;

        studentName = "Almajd Salim";
        math = 98;
        english = 95;
        science = 86;
        subNum = 3;

        if (validateMarks(math, english, science)) {

            totalMarks = calculateTotal(math, english, science);

            averageMarks = calculateAverage(totalMarks, subNum);

            finalGrade = calculateGrade(averageMarks);

            performanceStatus = checkPerformance(finalGrade);

            displayReport(
                    studentName,
                    math,
                    english,
                    science,
                    totalMarks,
                    averageMarks,
                    finalGrade,
                    performanceStatus);

        } else {

            System.out.println("Invalid marks. Please check the student grades.");
        }

    }

    public static boolean validateMarks(Integer math,
                                        Integer english,
                                        Integer science) {

        return math >= 0 && math <= 100 &&
                science >= 0 && science <= 100 &&
                english >= 0 && english <= 100;
    }

    public static Integer calculateTotal(Integer math,
                                         Integer english,
                                         Integer science) {

        return math + english + science;
    }

    public static Integer calculateAverage(Integer totalMarks,
                                           Integer subNum) {
        return (Integer) totalMarks / subNum;
    }

    public static Character calculateGrade(Integer averageMarks) {
        if (averageMarks > 90) {
            return 'A';
        } else if (averageMarks >= 80) {
            return 'B';
        } else if (averageMarks >= 70) {
            return 'C';
        } else if (averageMarks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static String checkPerformance(Character finalGrade) {

        if (finalGrade == 'A') {
            return "Excellent";
        } else if (finalGrade == 'B') {
            return "Very Good";
        } else if (finalGrade == 'C') {
            return "Good";
        } else if (finalGrade == 'D') {
            return "Satisfactory";
        } else {
            return "Needs Improvement";
        }
    }

    public static void displayReport(
            String studentName,
            Integer math,
            Integer science,
            Integer english,
            Integer totalMarks,
            Integer averageMarks,
            Character finalGrade,
            String performanceStatus) {

        System.out.println("Student Name: " + studentName);
        System.out.println("Math: " + math);
        System.out.println("Science: " + science);
        System.out.println("English: " + english);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Mark: " + averageMarks);
        System.out.println("Final Grade: " + finalGrade);
        System.out.println("Performance Status: " + performanceStatus);
    }
}
