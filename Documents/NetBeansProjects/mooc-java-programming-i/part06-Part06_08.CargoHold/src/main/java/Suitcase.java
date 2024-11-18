import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> cosas;
    private int maxWeight;
        
    public Suitcase (int maxWeight) {
        this.cosas = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int total = totalWeight() + item.getWeight();
        if (total <= this.maxWeight) {
                this.cosas.add(item);
        }
               
    }
    
    public int totalWeight () {
        int totWeight = 0;
        for (Item i : cosas) {
                totWeight += i.getWeight();
        }
        return totWeight;
    }
    
    
    public String toString() {
        switch(this.cosas.size()) {
            case 0:
                return "no items (0 kg)";
            case 1:
                return this.cosas.size() + " item (" + totalWeight() + " kg)";
            default:
                return this.cosas.size() + " items (" + totalWeight() + " kg)"; 
        }
    }

    public void printItems () {
        for (Item items : this.cosas) {
            System.out.println(items.getName() + " (" + items.getWeight() + " kg)");
        }
    }       
     
    public Item heaviestItem () {
        if (this.cosas.isEmpty()) {
            return null;
        }
        
        Item heaviestIt = this.cosas.get(0);
        
        for (Item items : this.cosas) {
            if (heaviestIt.getWeight() < items.getWeight()) {
                heaviestIt = items;
            }
        }
        return heaviestIt;
    }
}
