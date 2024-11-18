public class StarSign {
    public static void main(String[] args) {        
        printStars(3);
        
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int x = 1;
        while (x <= number){
            System.out.print("*");
            
            x++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int x = 1;
        int y = 2;
        while (x <= size){
            System.out.print("*");            
            x++;
            y = 2;
            while (y <= size){
                System.out.print("*");            
                y++;
            }
            System.out.println(""); 
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        int x = 1;
        int y = 2;
        while (x <= height){
            System.out.print("*");            
            x++;
            y = 2;
            while (y <= width){
                System.out.print("*");            
                y++;
            }
            System.out.println(""); 
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        int x = 1;
        int y = 0;
        while (x <= size){
            y = 1;
            while (y <= x){
                System.out.print("*");            
                y++;
                
            }
            System.out.println("");
            x++;
        }
        
        
    }
}
