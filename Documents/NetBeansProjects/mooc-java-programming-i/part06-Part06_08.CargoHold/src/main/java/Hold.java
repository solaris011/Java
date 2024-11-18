import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> maletas;
    
    public Hold (int maxWeight) {
        this.maxWeight = maxWeight;
        this.maletas = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int total = totalWeight() + suitcase.totalWeight();
        if (total <= this.maxWeight) {
            this.maletas.add(suitcase);        
        }
    }
    
    public int totalWeight () {
        int totWeight = 0;
        for (Suitcase suitcase : this.maletas) {
            totWeight += suitcase.totalWeight();
        }
        return totWeight;
    }
    
    public String toString() {
        // "x suitcases (y kg)"
        return this.maletas.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : maletas) {
            suitcase.printItems();
        }       
        
    }
    
}
