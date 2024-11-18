import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = input.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(input.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(input.nextLine());
            
            books.add(new Book(title, pages, year));
        
        }
        System.out.println("What information will be printed?");
        String question = input.nextLine();
        
        if (question.equals("everything")) {
            for (Book i: books) {
                System.out.println(i);
            }
        } else if (question.equals("name")) {
            for (Book i: books) {
                System.out.println(i.getTitle());
            }
        }

    }
}
