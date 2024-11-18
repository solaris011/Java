
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*   You gave the integer 11
        You gave the double 4.2
        You gave the boolean true */
        System.out.println("Give a string:");
        String variabl = scan.nextLine();
                
        System.out.println("Give an integer:");
        int variaX = Integer.valueOf(scan.nextLine());
                
        System.out.println("Give a double:");
        double variaY = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean variaZ = Boolean.valueOf(scan.nextLine());
                
        System.out.println("You gave the string " + variabl);
        System.out.println("You gave the integer " + variaX);
        System.out.println("You gave the double " + variaY);
        System.out.println("You gave the boolean " + variaZ);
        
    }
}
