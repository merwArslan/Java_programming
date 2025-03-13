package day3_Operators;

public class LeapYear {

    public static void main(String[] args) {

        int year=2027;

        boolean isLeapYear  = (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);


        System.out.println("Is "  + year +  " is a leap year? "  +isLeapYear);
    }


}
