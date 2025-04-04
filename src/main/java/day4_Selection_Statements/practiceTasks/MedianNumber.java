package day4_Selection_Statements.practiceTasks;

public class MedianNumber {
    public static void main(String[] args) {

        int a =100, b = 15, c = 2000;

        boolean aIsMedian = (a > b && a < c) ||  (a > c && a < b);
        boolean bIsMedian = (b > a && b < c) ||  (b > c && b < a);

        int median;


        if(aIsMedian) {
            median = a ;
        }else if(bIsMedian){
            median = b ;
        }else {
            median = c;

        }
        System.out.println(median + " is the median number");




    }



}
