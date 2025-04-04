package day4_Selection_Statements;

public class TrafficLight {

    public static void main(String[] args) {

            String lightColor= "m";

            switch (lightColor) {

                case "R":
                case  "r":
                    System.out.println("Red");
                break;
                case "Y":
                case  "y":
                    System.out.println("Yellow");
                break;
                case "G":
                case  "g":
                    System.out.println("Green");
                break;
                default:
                    System.out.println("Invalid Color");
                break;


            }

        }

    }

