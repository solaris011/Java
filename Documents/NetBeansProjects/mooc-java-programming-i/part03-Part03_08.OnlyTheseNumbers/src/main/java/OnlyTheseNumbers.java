
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From where?");
        int start = read.nextInt();
        //System.out.print("");
        System.out.println("To where?");
        int end = read.nextInt();
        //System.out.print("");
        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
