import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int oldest = 0;
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
                }
            //}
        }        
        System.out.println("Age of the oldest: " + oldest);
    }
}
