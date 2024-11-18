import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            items.add(new Item(name));
        }
        System.out.println();
        for (Item i: items) {
            System.out.println(i);
        }
    }
}
