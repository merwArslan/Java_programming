package day4_Selection_Statements;

public class ternaryVote {

    public static void main(String[] args) {


        int age = 28;

       /* String result;

        if(age >= 18) {
            result = "you are eligible to vote";
        }else {
            result = "you are not eligible to vote";

        }


        */
            String result = (age >= 18) ? "you are eligible to vote": "you are not eligible to vote";

        System.out.println(result);

        }


    }

