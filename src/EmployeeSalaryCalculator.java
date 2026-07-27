public class EmployeeSalaryCalculator {
    public static void main(String[] args){
        String employeeName;
        Integer basicSalary;
        Integer bonusAmount;
        Integer deductionAmount;
        Integer netSalary;

        employeeName = "John Smith";
        basicSalary = 1200;
        bonusAmount = 250;
        deductionAmount = 100;
    }
    public static Integer calculateNetSalary(Integer basicSalary,
                                            Integer bonus,
                                            Integer deduction) {

        return basicSalary + bonus - deduction;
    }

}
