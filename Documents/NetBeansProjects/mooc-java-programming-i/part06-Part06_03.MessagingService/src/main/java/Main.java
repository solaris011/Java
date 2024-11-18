public class Main {

    public static void main(String[] args) {
        Message msg1 = new Message("Joe", "Hi, how are you?");
        //System.out.println(msg1.getContent());
        
        MessagingService msg2 = new MessagingService();
        
        msg2.add(msg1);
        Message msg3 = new Message("Lisa", "Very well!");
        msg2.add(msg3);
        Message msg4 = new Message("Joe", "I am hungry!! Let's go have some lunch.");
        msg2.add(msg4);
        Message msg5 = new Message("Lisa", "OK");
        msg2.add(msg5);
        System.out.println(msg2.getMessages());       
        
        
        
        
    }
}
