package day4_Selection_Statements;

public class GreatestNumberNested {

    public static void main(String[] args) {
        int num1 = 40, num2 = 4;

        if (num1 != num2) {
            System.out.println("The numbers are not equal");

            if (num1 > num2) {
                System.out.println("The num1 is greater than num2");
            } else if (num2 > num1) {
                System.out.println("The num2 is greater than num1");

            } else {
                System.out.println("The numbers are equal");
            }


        }
    }
}
