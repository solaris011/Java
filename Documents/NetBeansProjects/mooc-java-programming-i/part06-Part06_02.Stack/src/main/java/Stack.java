import java.util.ArrayList;
public class Stack {
    private ArrayList<String> letras;
    
    public Stack () {
        this.letras = new ArrayList<>();        
    }
    
    public boolean isEmpty() {
        return this.letras.isEmpty();
    }
    
    public void add(String value) {
        this.letras.add(value);
    }
    
    public ArrayList<String> values() {
        return this.letras;
    }
    
    public String take() {
        return this.letras.remove(this.letras.size() -1);
    }
}
