
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {            
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            } else {
                if (text.contains("av")) {
                    String[] nuevo = text.split(" ");
                    for (int i = 0; i < nuevo.length; i++) {
                        if (nuevo[i].contains("av")) {
                            System.out.println(nuevo[i]);
                        }
                    }
                }
            }
        }
    }        
}
