package day3_Operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 50 ,
                weeklyHours =45,
                stateTaxRate =6,
                federalTaxRate=26;

        double salaryBeforeTax =hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * (stateTaxRate / 100 ); // 6%
        double federalTax =salaryBeforeTax * (federalTaxRate/100); //26%
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax-totalTax;

        System.out.println("Gross Pay: $" + salaryBeforeTax);
        System.out.println("FederalTax : $" + federalTax);
        System.out.println("State tax: $" + stateTax);
        System.out.println("Total tax : $" +totalTax);
        System.out.println("Net income is : $" +salaryAfterTax);


    }
}
