import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container c1 = new Container();
        Container c2 = new Container();
        String input = "";

        while (true) {
            //System.out.println("> ");
            System.out.println("First:" + c1);
            
            System.out.println("Second:" + c2);
            input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
                         
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            
            //  Command ADD:
            if (command.equals("add")) {
                c1.add(amount);
            }
            //  Command MOVE:
            if (command.equals("move")) {
                c2.add(c1.move(amount));
            }
            //  Command REMOVE:
            if (command.equals("remove")) {
                c2.remove(amount);
            }
        }
        
    }

}
