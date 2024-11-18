
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int end = Integer.valueOf(scanner.nextLine());
        for (int count = 0; count <= end; count++){
            System.out.println(count);
        }
    }
}
