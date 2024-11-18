public class Main {

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Uno");
        System.out.println(s.isEmpty());
        s.add("Dos");
        s.add("Tres");
        s.add("Cuatro");
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);

    }
}
