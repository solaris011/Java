import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            //scanner.nextInt();
            programs.add(new TelevisionProgram(name, duration));
            
        }
        System.out.println("");
        System.out.println("Program's maximum duration? ");
        int maximum = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram i: programs) {
            if (i.getDuration() <= maximum) {
                System.out.println(i);
            }
        }
    }
}
