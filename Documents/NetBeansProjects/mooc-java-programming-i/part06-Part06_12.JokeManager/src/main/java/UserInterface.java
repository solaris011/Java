import java.util.Scanner;

public class UserInterface {
    private JokeManager lista;
    private Scanner sc;
    
    public UserInterface (JokeManager lista, Scanner sc) {
        this.lista = lista;
        this.sc = sc;
    }
    
    public void start() {
        String selection = "";
        
        while (!(selection.equals("X")) && !(selection.equals("x"))) { 
            System.out.println("Commands: \n1 - add a joke\n2 - draw a joke\n3 - list jokes\nX - stop");
            selection = sc.nextLine();
            switch (selection) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke1 = sc.nextLine();
                    lista.addJoke(joke1);
                    break;
                case "2":
                    System.out.println(lista.drawJoke());
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    lista.printJokes();                    
            }
        }
    }    
}
