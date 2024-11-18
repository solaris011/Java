import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        
        try(Scanner sc = new Scanner(Paths.get(file))) {

        // we read all the lines of the file
            while (sc.hasNextLine()) {
                list.add(Integer.valueOf(sc.nextLine()));
            } 
            
            for (int i = 0; i <= list.size() - 1; i++) {
                if (list.get(i) >= lowerBound && list.get(i) <= upperBound) {
                    count++;
                }
            }
            System.out.print("Numbers: " + count);
            
//        if (list.contains(searchedFor)) {
//            System.out.println("Found!");
//        } else {
//            System.out.println("Not found.");
//        }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
