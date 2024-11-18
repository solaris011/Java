
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average;
        
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            } else if (num > 0){
                sum += num;
                count++;
            }
        }
        
        if (count == 0){
            System.out.println("Cannot calculate the average");
        } else {
            average = (1.0 * sum) / count;
            System.out.println("Average of the numbers: " + average);
        }
    }
}
