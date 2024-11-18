
public class YourFirstAccount {

    public static void main(String[] args) {
        Account pioAccount = new Account("Pio's Account", 100.0);
        System.out.println("Initial state");
        System.out.println(pioAccount);
        pioAccount.deposit(20.0);
        
        System.out.println("End state");   
        System.out.println(pioAccount);
    }
}
