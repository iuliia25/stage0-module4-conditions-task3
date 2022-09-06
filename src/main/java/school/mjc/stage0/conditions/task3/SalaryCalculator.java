package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double salaryAfterTaxes;
        if (salary <= 10000) {
            salaryAfterTaxes = salary * 0.85;
            System.out.println(salaryAfterTaxes);
        }
        if (salary <= 20000 && salary > 10000) {
            salaryAfterTaxes = salary * 0.82;
            System.out.println(salaryAfterTaxes);
        }
        if (salary > 20000) {
            salaryAfterTaxes = salary * 0.8;
            System.out.println(salaryAfterTaxes);
        }
        if (salary == 0) {
            System.out.println("wrong input!");
        }
    }
}
