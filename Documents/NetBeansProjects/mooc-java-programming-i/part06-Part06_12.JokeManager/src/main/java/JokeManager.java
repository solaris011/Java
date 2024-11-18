import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager () {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        Random aleat = new Random();
        int min = 0;
        int max = jokes.size() - 1;
        
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;
        
        return jokes.get(randomNum);        
    }
    
    public void printJokes() {
        for (String i : jokes) {
            System.out.println(i);
        }
    }
    
    
    
    
}
