import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0, container2 = 0, max1 = 100, max2 = 100;
        String input = "";

        while (true) {
            //System.out.println("> ");
            System.out.println("First:" + container1 + "/100");
            
            System.out.println("Second:" + container2 + "/100");
            input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            // COMMANDS INPUT:
            
            /*
            if (input.isEmpty()) {
                continue;
            }
            if (input.equals("quit")) {
                break;
            } 
            */
               
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            
            //  Command ADD:
            if (command.equals("add")) {
                if (amount > 0) {
                    if (amount > max1) {
                        container1 += max1;
                        max1 = 0;
                    } else {
                        container1 += amount;
                        max1 -= amount;
                    }
                }
                    
            }
            //  Command MOVE:
            if (command.equals("move")) {
                
                if (amount > 0) {
                    if (container1 > 0) {
                        // CORREGIR **************************
                        if (amount > max2) {
                            /*
                            if (amount > max1) {
                                container1 = 0;
                                max1 = 100;
                                container2 = amount + max2;
                                max2 = 0;

                            } else {
                             */
                                if ((container2 + amount) > 100) {
                                    container2 = 100;
                                    max2 = 0;
                                    container1 -= amount;
                                    max1 += amount;
                                } else {
                                    container2 += amount;
                                    max2 += amount;
                                    container1 -= amount;
                                    max1 += amount;
                                }
                        }

                            /*
                            container1 = 0;
                            max1 = 100;
                            container2 = amount + max2;
                            max2 = 0;
                            
                          */
                         else if (amount <= container1) {
                            container1 -= amount;
                            max1 += amount;
                            container2 += amount;
                            max2 -= amount;
                        } else {
                            container2 += container1;
                            max2 -= container1;
                            container1 = 0;
                            max1 = 100;

                        }
                            
                    }
                }
            
            
            }
            //  Command REMOVE:
            if (command.equals("remove")) {
                if (amount > 0) {
                    if (container2 >= amount) {
                        container2 -= amount;
                        max2 += amount;
                    } else {
                            container2 = 0;
                            max2 = 100;
                    }
                }
            }

        }
    }

}