public class Printer {
    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printArrayInStars(int[] array) {
        int i = 0, m = 0;
       
        while (i < array.length) {
            m = 0;
            while (m < array[i]) {
                System.out.print("*");
                //System.out.print(array[m]);
                m++;
            }
            System.out.println("");
            i++;
        }
    }
}
