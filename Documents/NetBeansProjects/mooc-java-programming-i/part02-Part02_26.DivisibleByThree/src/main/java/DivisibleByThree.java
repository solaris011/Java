
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
    public static void divisibleByThreeInRange(int start, int end){
        while (start <= end){
            if (start % 3 == 0) {
                System.out.println(start);
            }
            start++;
        }
        
    }
    

}
