package day4_Selection_Statements;

public class Watermelon {

    public static void main(String[] args) {
        int number = 40;
        boolean isEnough = false;

        if (number >= 20) {
            System.out.println("I have more than 20 watermelons");
            isEnough = true;//isEnough===>true

        }

        if (isEnough) {
            System.out.println("Good Job");

        }

        if (!isEnough) {
            System.out.println("I have les than 20 watermelons ");
        }
    }
}
