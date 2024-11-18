import java.util.Scanner;
public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
            
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            } else {
                String[] nuevo = text.split(" ");
                for (int i = 0; i < nuevo.length; i++) {
                    System.out.println(nuevo[i]);
                }
            }
        }        
    }
}
