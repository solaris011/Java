
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int number = Integer.valueOf(scan.nextLine());
        double tax;
        if (number < 5000){
            System.out.println("No tax!");
        } else if (number >= 5000 && number < 25000){
            tax = 100 + (number - 5000) * 0.08;
            System.out.println("Tax: " + tax);
        } else if (number >= 25000 && number < 55000){
            tax = 1700 + (number - 25000) * 0.1;
            System.out.println("Tax: " + tax);
        } else if (number >= 55000 && number < 200000){
            tax = 4700 + (number - 55000) * 0.12;
            System.out.println("Tax: " + tax);
        } else if (number >= 200000 && number < 1000000){
            tax = 22100 + (number - 200000) * 0.15;
            System.out.println("Tax: " + tax);
        } else {
            tax = 142100 + (number - 1000000) * 0.17;
            System.out.println("Tax: " + tax);
        }
    }
}
