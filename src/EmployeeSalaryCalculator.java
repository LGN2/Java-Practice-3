public class EmployeeSalaryCalculator {
    public static void main(String[] args){
        String employeeName;
        Integer basicSalary;
        Integer bonusAmount;
        Integer deductionAmount;
        Integer netSalary;
        String salaryStatus;

        employeeName = "John Smith";
        basicSalary = 1200;
        bonusAmount = 250;
        deductionAmount = 100;

        netSalary = calculateNetSalary(basicSalary, bonusAmount, deductionAmount);
        salaryStatus = checkSalaryStatus(netSalary);
        displaySalaryDetails(
                employeeName,
                basicSalary,
                bonusAmount,
                deductionAmount,
                netSalary,
                salaryStatus
        );
    }
    public static Integer calculateNetSalary(Integer basicSalary,
                                            Integer bonus,
                                            Integer deduction) {

        return basicSalary + bonus - deduction;
    }
    public static String checkSalaryStatus(Integer netSalary){
        if (netSalary < 500){
            return "Low Salary";
        } else if (netSalary <= 1500) {
            return "Medium Salary";
        }else {
            return "High Salary";
        }
    }
    public static void displaySalaryDetails(
            String employeeName,
            Integer basicSalary,
            Integer bonusAmount,
            Integer deductionAmount,
            Integer netSalary,
            String salaryStatus) {

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonusAmount);
        System.out.println("Deduction: " + deductionAmount);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Salary Status: " + salaryStatus);
    }


}
