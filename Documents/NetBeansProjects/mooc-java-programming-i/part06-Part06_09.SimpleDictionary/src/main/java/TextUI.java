import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI (Scanner sc, SimpleDictionary dict) {
        this.scanner = sc;
        this.dictionary = dict;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();
            
            if (word.equals("end")) {
                break;
            } else if (word.equals("add")) {
                System.out.println("Word: ");
                String word1 = scanner.nextLine();
                System.out.println("Translation: ");
                String word2 = scanner.nextLine();
                this.dictionary.add(word1, word2);
            } else if (word.equals("search")) {
                System.out.println("To be translated: ");
                String word3 = scanner.nextLine();
                
                String word4 = dictionary.translate(word3);
                if (word4 == null) {
                    System.out.println("Word " + word3 + " was not found");
                } else {
                    System.out.println("Translation: " + word4);
                }                
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }   
}
