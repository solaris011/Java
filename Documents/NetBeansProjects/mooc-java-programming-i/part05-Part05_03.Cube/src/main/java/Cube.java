public class Cube {
    private final int edgeLength;  
    
    public Cube (int edgeLength) {
        this.edgeLength = edgeLength;
    }    
    
    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }
    
    @Override
    public String toString() {
        // "The length of the edge is l and the volume v"
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }
    
}
