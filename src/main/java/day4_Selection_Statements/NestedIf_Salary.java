package day4_Selection_Statements;

public class NestedIf_Salary {


    public static void main(String[] args) {


        int salary = 40000;
        int yearsOnJob = 3;

        if (salary >= 30000) {


            if (yearsOnJob >= 2) {
                System.out.println("you are qualified for the loan.");

            } else {
                System.out.println("You are not qualified for the loan yet.");
            }

        } else {
            System.out.println("You must earn at least $30,000 for loan yet.");
        }
    }
}