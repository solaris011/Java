import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;
    
    public Package () {
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }
    
    public int totalWeight() {
        int totWeight = 0;
        
        for (Gift i : gifts) {
            totWeight += i.getWeight();
        }
        
        return totWeight;
    }
    
    
}
