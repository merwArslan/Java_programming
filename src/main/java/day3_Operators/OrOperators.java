package day3_Operators;

public class OrOperators {


    public static void main(String[] args) {

        int x =50;

        System.out.println((x<100) | (x>0));

        //true| true


        System.out.println((x>200) || (x<0));

        //false|false ===>false

        System.out.println(true ^ true);//false
        System.out.println(true^false);//true
        System.out.println(false^false);//false
    }

}
