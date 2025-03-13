package day3_Operators;

public class PrePostIncrement {
    public static void main(String[] args) {


int x = 10;
int y = 22;


        System.out.println(x++  +  x);//10+11=21
        System.out.println(x++ + +y);//11+22=33
        System.out.println(x++ + ++y);//12+23=35 x=13,y=23
        System.out.println(++x %5);//x=14 mod5
        System.out.println("x =" +x);
        System.out.println("y =" +y);

    }


}
