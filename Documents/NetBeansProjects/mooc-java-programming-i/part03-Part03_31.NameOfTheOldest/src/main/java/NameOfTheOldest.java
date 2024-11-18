
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            //oldest = Integer.valueOf(parts[1]);
            
            //for (int i = 0; i < parts.length - 1; i++) {
                if (oldest < Integer.valueOf(parts[1])) {
                    oldest = Integer.valueOf(parts[1]);
                    name = parts[0];
                }
            //}
        }        
        System.out.println("Age of the oldest: " + name);
    }   
}
