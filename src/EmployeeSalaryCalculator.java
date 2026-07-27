public class EmployeeSalaryCalculator {
    public static void main(String[] args){
        String employeeName;
        Integer basicSalary;
        Integer bonusAmount;
        Integer deductionAmount;
        Integer netSalary;
        String salaryType;

        employeeName = "John Smith";
        basicSalary = 1200;
        bonusAmount = 250;
        deductionAmount = 100;

        netSalary = calculateNetSalary(basicSalary, bonusAmount, deductionAmount);
    }
    public static Integer calculateNetSalary(Integer basicSalary,
                                            Integer bonus,
                                            Integer deduction) {

        return basicSalary + bonus - deduction;
    }
    public static Integer checkSalaryStatus(Integer netSalary){
        if (netSalary < 500){
            return = "Low Salary";
        } else if (netSalary <= 1500) {
            return = "Meduim Salary";
        }else {
            return = "High Salary";
        }
    }

}
