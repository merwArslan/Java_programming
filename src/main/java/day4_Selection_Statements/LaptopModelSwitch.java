package day4_Selection_Statements;

public class LaptopModelSwitch {

    public static final String MODEL_ONE = "APPLE";
    public static final String MODEL_TWO = "DELL";
    public static final String MODEL_THREE = "HP";

    public static void main(String[] args) {
        String laptopModel = "fiserv";
        switch (laptopModel) {
            case MODEL_ONE:
                System.out.println("Apple - no virus");
                break;

            case MODEL_TWO:
                System.out.println("TOUGH ONE ");

                break;

            case MODEL_THREE:
                System.out.println("not recommended");
                break;

            default:
                System.out.println("do not buy that one!");


        }
    }
}