import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString () {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        String personajes = "";
        
        for (int i = 0; i < elements.size(); i++) {
           personajes += elements.get(i) + "\n";
        }
        
        if (elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:\n" + elements.get(0);
        }
        
        return "The collection " + this.name + " has " + elements.size() + " elements:\n" + personajes;
        
        
    }
    
}
