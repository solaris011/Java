public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte (int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        // (maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart rate
        double max = 206.3 - (0.711 * age);
        return (max - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
        
    }
}
