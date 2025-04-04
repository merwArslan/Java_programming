package day4_Selection_Statements;

public class TernaryNumber {

    public static void main(String[] args) {

        int num = 0;
    /*  if (num> 0) {
          result = "positive";
      }else if (num < 0) {
          result = "negative"

      }else {
          result = "zero";
      }


     */
        String result = (num > 0 )? "Positive" :(num < 0) ? "Negative" : "ZERO";
        System.out.println(result);

      }



    }




