public class Item {
    private String id;
    private String name;
    
    public Item (String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString () {
        return this.id + ": " + this.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public boolean equals(Object compared) {
        // Bird comparedBird = (Bird) compared;
        
        Item comparedItem = (Item) compared;
        if (this.id.equals(comparedItem.id)) {
            return true;
        }
        return false;
    }
}
