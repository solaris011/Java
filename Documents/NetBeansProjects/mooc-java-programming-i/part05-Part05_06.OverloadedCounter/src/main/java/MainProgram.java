public class MainProgram {

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(5);
        
        System.out.println(counter1.value());
        System.out.println(counter2.value());
        counter1.increase();
        counter2.decrease();
        System.out.println(counter1.value());
        System.out.println(counter2.value());
        
        counter1.increase(10);
        counter2.decrease(2);
        System.out.println(counter1.value());
        System.out.println(counter2.value());
        
        counter1.increase(-10);
        counter2.decrease(-2);
        System.out.println(counter1.value());
        System.out.println(counter2.value());
        
    }
}
