
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.println("Search for?");
        int buscar = Integer.valueOf(scanner.nextLine());
        //Integer num = null; 
        //Integer indice = null;
        //ArrayList<Integer> lista2 = new ArrayList<>();        

        for (int i = 0; i < list.size(); i++){
            if (buscar == list.get(i)) {
                System.out.println(list.get(i) + " is at index " + i);
            }
        }
        
        
        
    }
}
