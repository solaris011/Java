
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        try {
            System.out.println("Which file should have its contents printed?");
            Scanner scanner1 = new Scanner(System.in);
            String file1 = scanner1.nextLine();
            Scanner scanner = new Scanner(Paths.get(file1));
            //Paths.get(file1); 
            
        // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }

    }
}
