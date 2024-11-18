import java.util.Scanner;

public class UserInterface {
    private TodoList lista;
    private Scanner sc;
    
    public UserInterface (TodoList lista, Scanner sc) {
        this.lista = lista;
        this.sc = sc;
    }
    
    public void start() {
        String word = "";
        
        while (!(word.equals("stop"))) { 
            System.out.println("Command: ");
            word = sc.nextLine();
            switch (word) {
                case "add" :
                    System.out.println("To add:");
                    String word1 = sc.nextLine();
                    lista.add(word1);
                    
                    break;
                case "list" :
                    lista.print();
                    break;
                    
                case "remove" :
                    int selection;
                    System.out.println("Which one is removed?");
                    selection = Integer.valueOf(sc.nextLine());
                    lista.remove(selection);
                    break;
            }
        }
    }      
}
    
   
