public class Item {
    private String name;
    private int weight;
    
    public Item (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public int getWeight() {
        return this.weight;
    }
       
    public String getName() {
        return this.name;        
    }
    
    public String toString() {
        // "name (weight kg)"
        return this.name + " (" + this.weight + " kg)";        
    }
    
    
}
