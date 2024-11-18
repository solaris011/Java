public class Container {
    private int liq;
    
    public Container () {
        this.liq = liq;
    }
    
    public int contains() {
        return this.liq;
    }
    
    public String toString () {
        return this.liq + "/100";
    }
    
    public void add (int amount) {
        if (amount > 0) {
            if ((this.liq + amount) > 100) {
                this.liq = 100;                
            } else {
                this.liq += amount;
            }
        }
    }
    
    public int move (int amount) {
        if (amount > 0) {
            if(this.liq >= amount) {
                this.liq -= amount;
                return amount;
            } 
            int temp = this.liq;
            this.liq = 0;
            return temp;
        
        }
        return 0;
    }
    
    
    public void remove(int amount) {
        if (amount > 0) {
            if (this.liq > 0) {
                if (this.liq < amount) {
                
                    this.liq = 0;
                } else {
                        this.liq -= amount;
                }              
            }
        }
    }    
}
