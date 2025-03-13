package first_package;

public class ShippingAddress
{
    public static void main(String[] args) {

        String fullName = " Aaron Kissing" , streetName= "Legacy Cir" , city = "Fairfax" , state = "VA";

        int buildingNumber = 132343, zipCode = 07405;


        System.out.println("Your shipping address is:");
        System.out.println("\t\t\t" + fullName);
        System.out.println("\t\t\t" + buildingNumber + " " + streetName);
        System.out.println("\t\t\t" + city + "," + state + " " + zipCode);

    }

}
