package day3_Operators;

public class Lab1 {

    public static void main(String[] args) {

        int b=2;

        boolean  result = (++b ==2 || b ==2) && --b == 2;
                           // 3==2 ||3==2 && 2==2

                       //false || false && true=false
                        //2 +1=3

        System.out.println(result);
        System.out.println(b);

    }



}
