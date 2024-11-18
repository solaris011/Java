
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthews = new Account("Matthews account", 1000);
        Account myaccount = new Account("My account", 0);
        
        matthews.withdrawal(100);
        myaccount.deposit(100);
        
        System.out.println(matthews);
        System.out.println(myaccount);
    }
}
