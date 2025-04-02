package day4_Selection_Statements;

public class Grading {

    public static void main(String[] args) {

        int score = 95;

        String result;


        if (score >= 0 && score <= 100) {


            if (score >= 90) {
                result = "Passed with distinction";
            } else if (score >= 60) {
                result = "Passed";
            } else {
               result= "Failed";
            }
            }else {
            result ="Invalid Score";
            }

        System.out.println(result);
        }
    }



