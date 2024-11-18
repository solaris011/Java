import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        
        
        System.out.println("Point average (all): " + register.averageOfPoints());
        if (register.averageOfPointsPassing() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + register.averageOfPointsPassing());
        }
        System.out.println("Pass percentage: " + register.passPercentage());
        System.out.println("Grade distribution:");
        printGradeDistribution();
    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            try {
            String input = scanner.nextLine();
            if (input.isBlank()){
                continue;
            }
            if (input.equals("-1")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points >= 0 && points <= 100) {
                this.register.addGradeBasedOnPoints(points);
            }
                 
            } catch (Exception e) {
                System.out.println("Something went wrong.");
            }
            
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
