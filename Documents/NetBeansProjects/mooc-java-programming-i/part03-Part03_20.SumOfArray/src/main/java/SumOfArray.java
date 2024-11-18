
public class SumOfArray {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int i =0, suma = 0;
        while (i < array.length) {
            suma += array[i];
            i++;
        }
        
        return suma;
    }
}
