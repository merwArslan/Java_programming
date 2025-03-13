package day3_Operators;

public class ExplicitCasting {

    public static void main(String[] args) {
        //there is risk of losing data
        //must be done explicitly

        double num1=10.0;

        short num2= (short)num1;

        System.out.println("num1 = " +num1);
        System.out.println("num2 = " +num2);

        int num3 = 500;

        byte num4 = (byte)num3;//byte max 127

        System.out.println("num3 = " +num3);
        System.out.println("num4 = " +num4);

    }



}
