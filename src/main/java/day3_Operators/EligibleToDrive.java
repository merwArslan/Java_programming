package day3_Operators;

public class EligibleToDrive {

    public static void main(String[] args) {


         double age = 15.5;
         boolean hasLearningPermit = true;
         boolean hasDriverLicense = false;

        boolean result =(age >=18 && hasDriverLicense)  || (age >= 15.5 && hasLearningPermit);

        boolean result2 =(age >=17 && hasDriverLicense)  || (age >= 15.5 && hasLearningPermit);

        System.out.println("is mike eligible to drive?  " +result);
        System.out.println("is mary eligible to drive?  " +result2);





    }


}
