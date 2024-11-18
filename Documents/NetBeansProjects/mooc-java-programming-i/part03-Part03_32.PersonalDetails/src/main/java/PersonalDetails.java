
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int length = 0, sum = 0, count = 0;
        double avg = 1;
        String name = "";
        
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            count++;
            sum = sum + Integer.valueOf(parts[1]);
            //length = parts[0].length();
            avg = (double) sum / count;
            //oldest = Integer.valueOf(parts[1]);
            
            //for (int i = 0; i < parts.length - 1; i++) {
                if (length < parts[0].length()) {
                    length = parts[0].length();
                    name = parts[0];
                }
            //}
        }        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + avg);


    }
}
