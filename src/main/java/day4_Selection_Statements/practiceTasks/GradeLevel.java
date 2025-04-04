package day4_Selection_Statements.practiceTasks;

public class GradeLevel {
    public static void main(String[] args) {

        byte grade = 4;

        boolean isValidGrade = grade > 0 && grade < 19;
        String result = " ";

        if(isValidGrade) {
            if (grade > 1 && grade<5) {
                result = "Elementary School";
            }else if (grade > 6 && grade<8) {
                result = "Middle School";
            }else if (grade >= 9){
                result = "High School";
            }else if (grade >= 13){
                result = "College";
            }else if (grade >= 17){
                result = "Grad School";

            }else{
            result = "Invalid grade level";

            }
            System.out.println(result);
        }


    }
}
