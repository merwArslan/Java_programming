package day3_Operators;

public class UnaryOperatorsLAB {

    public static void main(String[] args) {

        int x =2;
        int y = x++;
        System.out.println(y);
        System.out.println(--x);
        System.out.println(x++);

        int z=8;
        int t = z--;
        System.out.println(t);

        int a =10;
        a=--a  + a++ +a-- +a++;//9+9+10+9
        System.out.println(a);

        int m =4;
        int n=--m *4 -m++;//12-3=9
        System.out.println("m =" +m);
        System.out.println("n ="+n);

    }

}
