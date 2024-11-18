public class Multiplier {
    private int num;
    public Multiplier(int number) {
        this.num = number;
    }
    
    public int multiply(int number) {
//        multiplyByThree.multiply(2): 6
//        multiplyByFour.multiply(2): 8
//        multiplyByThree.multiply(1): 3
//        multiplyByFour.multiply(1): 4
        return this.num * number;
    }
}
